package com.example.takeorder.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.text.bold
import androidx.core.text.italic
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.R
import com.example.takeorder.realm.RealmMenuItems
import com.example.takeorder.realm.RealmOrders
import com.example.takeorder.realm.RealmStaff
import com.example.takeorder.realm.RealmMenuCategory
import io.realm.OrderedRealmCollection
import io.realm.Realm
import io.realm.RealmRecyclerViewAdapter
import org.w3c.dom.Text
import java.io.Serializable
import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

/*
 * OrderRecyclerViewAdapter: extends the Realm-provided
 * RealmRecyclerViewAdapter to provide data
 * for a RecyclerView to display
 * Realm objects on screen to a user.
 */
// code borrowed and edited from documentation
// https://www.mongodb.com/docs/realm/sdk/java/examples/adapters/
internal class OrderRecyclerViewAdapter(data: OrderedRealmCollection<RealmOrders?>?) :
    RealmRecyclerViewAdapter<RealmOrders?,
            OrderRecyclerViewAdapter.OrderViewHolder?>(data, true) {
    var TAG = "REALM_RECYCLER_ADAPTER"
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OrderViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_row, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        //val obj = getItem(position)
        val obj: RealmOrders? = data!![position]
        Log.i(TAG, "Binding view holder: ${obj!!.id}")
        // build strings to be displayed inside each recyclerview
        holder.orderId.text =
            SpannableStringBuilder().bold { append("Order ID ") }.append(obj.id.toString())
        // prices stored in db without decimal, so we divide by 100 and format it to show to 2 decimal places
        holder.price.text = SpannableStringBuilder().bold { append("Total Price ") }.append("£")
            .append(
                DecimalFormat("#,##0.00")
                    .format(
                        obj.total_price.toBigDecimal().divide(
                            BigDecimal(100)
                        )
                    ).toString()
            )
        holder.date.text =
            SpannableStringBuilder().bold { append("Date ") }.append(obj.date.toString())
        holder.itemView.setOnClickListener {
            notifyItemChanged(position)
        }
        // hide textView4,5 and buttons as they are not needed for this view
        holder.textView4.visibility = View.GONE
        holder.textView5.visibility = View.GONE
        holder.editButton.visibility = View.GONE
        holder.deleteButton.visibility = View.GONE
    }

    override fun getItemId(index: Int): Long {
        return getItem(index)!!.id
    }

    internal inner class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var orderId: TextView = itemView.findViewById(R.id.textView1)
        var price: TextView = itemView.findViewById(R.id.textView2)
        var date: TextView = itemView.findViewById(R.id.textView3)
        var textView4: TextView = itemView.findViewById(R.id.textView4)
        var textView5: TextView = itemView.findViewById(R.id.textView5)
        var editButton: ImageView = itemView.findViewById(R.id.editButton)
        var deleteButton: ImageView = itemView.findViewById(R.id.deleteButton)
    }

    init {
        Log.i(
            TAG,
            "Created RealmRecyclerViewAdapter for ${getData()!!.size} orders."
        )
    }
}

internal class StaffRecyclerViewAdapter(private val context: Context, data: OrderedRealmCollection<RealmStaff?>?) :
    RealmRecyclerViewAdapter<RealmStaff?,
            StaffRecyclerViewAdapter.StaffViewHolder?>(data, true) {
    var TAG = "REALM_RECYCLER_ADAPTER"
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StaffViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_row, parent, false)
        return StaffViewHolder(view)
    }

    override fun onBindViewHolder(holder: StaffViewHolder, position: Int) {
        //val obj = getItem(position)
        val obj: RealmStaff? = data!![position]
        Log.i(TAG, "Binding view holder: ${obj!!.id}")
        // build strings to be displayed inside each recyclerview
        holder.staffId.text =
            SpannableStringBuilder().bold { append("Staff ID ") }.append(obj.id.toString())
        holder.username.text = SpannableStringBuilder().bold { append("Username ") }.append(obj.name)
        holder.role.text =
            SpannableStringBuilder().bold { append("Role ") }.append(obj.role)
        holder.password.text = SpannableStringBuilder().bold { append("Password ")}.append(obj.password)
        //hide textView5
        holder.textView5.visibility = View.GONE
        // if the primary key is 0 hide the edit button, as this is the first default admin account created
        if(obj.id.toInt() == 0){
            holder.editButton.visibility = View.GONE
        } else {
            holder.editButton.visibility = View.VISIBLE
        }
        holder.editButton.setOnClickListener { editStaffDialog(obj.id, obj.name, obj.password, obj.role) }
        holder.deleteButton.setOnClickListener {
            if (obj.role == "admin") {
                Toast.makeText(context, "Admin users cannot be deleted!", Toast.LENGTH_SHORT).show()
            } else {
                // ask if the user is sure they want to delete this user
                val builder = AlertDialog.Builder(context)
                builder.setMessage("Are you sure you want to delete this user?")
                    .setPositiveButton(
                        "Yes"
                    ) { _: DialogInterface, _: Int ->
                        val realm = RealmStaff()
                        realm.delete(obj.id)
                    }
                    .setNegativeButton(
                        "No"
                    ) { dialog: DialogInterface, _: Int ->
                        dialog.cancel()
                    }
                val alert = builder.create()
                alert.show()
            }
        }
    }

    override fun getItemId(index: Int): Long {
        return getItem(index)!!.id
    }

    internal inner class StaffViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var staffId: TextView = itemView.findViewById(R.id.textView1)
        var username: TextView = itemView.findViewById(R.id.textView2)
        var password: TextView = itemView.findViewById(R.id.textView3)
        var role: TextView = itemView.findViewById(R.id.textView4)
        var textView5: TextView = itemView.findViewById(R.id.textView5)
        var editButton: ImageView = itemView.findViewById(R.id.editButton)
        var deleteButton: ImageView = itemView.findViewById(R.id.deleteButton)
    }

    init {
        Log.i(
            TAG,
            "Created RealmRecyclerViewAdapter for ${getData()!!.size} staff."
        )
    }
    private fun editStaffDialog(id: Long, username: String, password: String, role: String){
        val inflater = LayoutInflater.from(context)
        val subView = inflater.inflate(R.layout.edit_staff, null)
        val usernameField = subView.findViewById<EditText>(R.id.username)
        val passwordField = subView.findViewById<EditText>(R.id.password)

        // pre-fill the text fields with the previous data that the user wants to edit
        usernameField.setText(username)
        passwordField.setText(password)

        // implementation of spinner drop-down menu from documentation
        // https://developer.android.com/guide/topics/ui/controls/spinner#kotlin
        val spinner: Spinner = subView.findViewById(R.id.role_spinner)
        ArrayAdapter.createFromResource(context, R.array.edit_staff_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
                val spinnerPosition = adapter.getPosition(role)
                spinner.setSelection(spinnerPosition)
            }
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Edit staff").setView(subView)
            .setPositiveButton("Save") { _: DialogInterface, _: Int ->
                val realm = RealmStaff()
                realm.update(id, usernameField.text.toString(), passwordField.text.toString(), spinner.selectedItem.toString())
            }
            .setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.cancel()
            }
        val alert = builder.create()
        alert.show()
    }
}
internal class MenuRecyclerViewAdapter(private val context: Context, data: OrderedRealmCollection<RealmMenuItems?>?) :
    RealmRecyclerViewAdapter<RealmMenuItems?,
            MenuRecyclerViewAdapter.MenuViewHolder?>(data, true) {
    var TAG = "REALM_RECYCLER_ADAPTER"
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_row, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        //val obj = getItem(position)
        val obj: RealmMenuItems? = data!![position]
        val realm = Realm.getDefaultInstance()
        val categoryObj = realm.where(RealmMenuCategory::class.java).equalTo("items.id", obj!!.id).findFirst()
        val category = categoryObj?.category
        Log.i(TAG, "Binding view holder: ${obj!!.id}")
        // build strings to be displayed inside each recyclerview
        holder.itemId.text =
            SpannableStringBuilder().bold { append("Menu Item ID ") }.append(obj.id.toString())
        holder.name.text =
            SpannableStringBuilder().bold { append("Item Name ") }.append(obj.name)
        // prices stored in db without decimal, so we divide by 100 and format it to show to 2 decimal places
        holder.price.text = SpannableStringBuilder().bold { append("Price ") }.append("£")
            .append(
                DecimalFormat("#,##0.00")
                    .format(
                        obj.price.toBigDecimal().divide(
                            BigDecimal(100)
                        )
                    ).toString()
            )
        holder.description.text =
            SpannableStringBuilder().bold { append("Description ") }.append(obj.description)
        holder.category.text = SpannableStringBuilder().bold { append("Category ")}.append(category)

        holder.editButton.setOnClickListener {
            editMenuDialog(
                obj.id,
                obj.name,
                obj.price,
                obj.description,
                category!!
            )
        }
        holder.deleteButton.setOnClickListener {
            // ask if the user is sure they want to delete this item
            val builder = AlertDialog.Builder(context)
            builder.setMessage("Are you sure you want to delete this item?")
                .setPositiveButton(
                    "Yes"
                ) { _: DialogInterface, _: Int ->
                    val realm = RealmMenuItems()
                    realm.delete(obj.id)
                }
                .setNegativeButton(
                    "No"
                ) { dialog: DialogInterface, _: Int ->
                    dialog.cancel()
                }
            val alert = builder.create()
            alert.show()
        }
    }

    override fun getItemId(index: Int): Long {
        return getItem(index)!!.id
    }

    internal inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemId: TextView = itemView.findViewById(R.id.textView1)
        var name: TextView = itemView.findViewById(R.id.textView2)
        var price: TextView = itemView.findViewById(R.id.textView3)
        var description: TextView = itemView.findViewById(R.id.textView4)
        var category: TextView = itemView.findViewById(R.id.textView5)
        var editButton: ImageView = itemView.findViewById(R.id.editButton)
        var deleteButton: ImageView = itemView.findViewById(R.id.deleteButton)
    }

    init {
        Log.i(
            TAG,
            "Created RealmRecyclerViewAdapter for ${getData()!!.size} menu."
        )
    }

    private fun editMenuDialog(id: Long, name: String, price: Long, description: String, category: String) {
        val inflater = LayoutInflater.from(context)
        val subView = inflater.inflate(R.layout.edit_menu, null)
        val nameField = subView.findViewById<EditText>(R.id.name)
        val priceField = subView.findViewById<EditText>(R.id.price)
        val descriptionField = subView.findViewById<EditText>(R.id.description)

        // fill textfields with data
        nameField.setText(name)
        val parsed = price.toDouble()
        val formatted = NumberFormat.getCurrencyInstance(Locale.UK).format((parsed/100))
        priceField.setText(formatted)
        descriptionField.setText(description)

        // Initialise Long variable so that the price stays the same if the user does not change the price text field
        var cleanStringLong: Long = price

        // format the price field so that numbers are forced to be with 2 decimal places
        priceField.addTextChangedListener(object: TextWatcher {
            private var currentText = ""
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if(s.toString() != currentText){
                    priceField.removeTextChangedListener(this)

                    val cleanString = s.replace("\\D".toRegex(), "")

                    cleanStringLong = cleanString.toLong()

                    val parsed = cleanString.toDouble()
                    val formatted = NumberFormat.getCurrencyInstance(Locale.UK).format((parsed/100))
                    currentText = formatted
                    priceField.setText(formatted)
                    priceField.setSelection(formatted.length)
                    priceField.addTextChangedListener(this)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        // implementation of spinner drop-down menu from documentation
        // https://developer.android.com/guide/topics/ui/controls/spinner#kotlin
        val spinner: Spinner = subView.findViewById(R.id.category_spinner)
        ArrayAdapter.createFromResource(
            context,
            R.array.edit_menu_array,
            android.R.layout.simple_spinner_item
        )
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
                val spinnerPosition = adapter.getPosition(category)
                spinner.setSelection(spinnerPosition)
            }
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Edit menu item").setView(subView)
            .setPositiveButton("Save") { _: DialogInterface, _: Int ->
                val realm = RealmMenuItems()
                realm.update(
                    id,
                    nameField.text.toString(),
                    cleanStringLong,
                    descriptionField.text.toString(),
                    spinner.selectedItem.toString()
                )
            }
            .setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.cancel()
            }
        val alert = builder.create()
        alert.show()
    }
}

internal class ChildMenuOrderRecyclerViewAdapter(private val context: Context, data: OrderedRealmCollection<RealmMenuItems?>?) :
    RealmRecyclerViewAdapter<RealmMenuItems?,
            ChildMenuOrderRecyclerViewAdapter.ChildMenuOrderViewHolder?>(data, true) {
    var TAG = "REALM_RECYCLER_ADAPTER"
    var orderMap = HashMap<RealmMenuItems, Int>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChildMenuOrderViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_order_recyclerview_row, parent, false)
        return ChildMenuOrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildMenuOrderViewHolder, position: Int) {
        val obj: RealmMenuItems? = data!![position]
        Log.i(TAG, "Binding view holder: ${obj!!.id}")
        // build strings to be displayed inside each recyclerview
        holder.item.text = obj.name
        holder.description.text = obj.description
        holder.price.text = SpannableStringBuilder().bold { append("£")
            .append(
                DecimalFormat("#,##0.00")
                    .format(
                        obj.price.toBigDecimal().divide(
                            BigDecimal(100)
                        )
                    ).toString()
            )}
        holder.increaseButton.setOnClickListener{
            // get the counter as a string then convert to int
            var quantity = holder.counter.text.toString().toInt()
            quantity++
            holder.counter.text = quantity.toString()
            orderMap[obj] = quantity
        }
        holder.decreaseButton.setOnClickListener{
            // get the counter as a string then convert to int
            var quantity = holder.counter.text.toString().toInt()
            if(quantity > 0) {
                quantity--
                holder.counter.text = quantity.toString()
                orderMap[obj] = quantity
            }
        }
    }

    override fun getItemId(index: Int): Long {
        return getItem(index)!!.id
    }

    internal inner class ChildMenuOrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var item: TextView = itemView.findViewById(R.id.item_name)
        var description: TextView = itemView.findViewById(R.id.item_description)
        var price: TextView = itemView.findViewById(R.id.item_price)
        var increaseButton: Button = itemView.findViewById(R.id.increase_button)
        var decreaseButton: Button = itemView.findViewById(R.id.decrease_button)
        var counter: TextView = itemView.findViewById(R.id.quantity_counter)
    }

    init {
        Log.i(
            TAG,
            "Created RealmRecyclerViewAdapter for ${getData()!!.size} menu ordering."
        )
    }
}

internal class MenuOrderRecyclerViewAdapter(private val context: Context, data: OrderedRealmCollection<RealmMenuCategory?>?) :
    RealmRecyclerViewAdapter<RealmMenuCategory?,
            MenuOrderRecyclerViewAdapter.MenuOrderViewHolder?>(data, true), Serializable {
    var TAG = "REALM_RECYCLER_ADAPTER"
    var orderMap = HashMap<RealmMenuItems, Int>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuOrderViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.order_recyclerview_row, parent, false)
        return MenuOrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuOrderViewHolder, position: Int) {
        val obj: RealmMenuCategory? = data!![position]
        Log.i(TAG, "Binding view holder: ${obj!!.category}")
        //initialise child recycler view inside the parent
        val adapter = ChildMenuOrderRecyclerViewAdapter(context, obj.items)
        holder.childRecyclerView.setHasFixedSize(true)
        holder.childRecyclerView.layoutManager = LinearLayoutManager(context)
        holder.childRecyclerView.adapter = adapter
        orderMap = adapter.orderMap
        // adds divider line between each recycler item
        holder.childRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

        holder.category.text = SpannableStringBuilder().italic { append(obj.category.uppercase()) }
    }

    /*override fun getItemId(index: Int): Long {
        return getItem(index)!!.id
    }*/

    internal inner class MenuOrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var category: TextView = itemView.findViewById(R.id.category_textview)
        var childRecyclerView: RecyclerView = itemView.findViewById(R.id.child_recyclerview)
    }

    init {
        Log.i(
            TAG,
            "Created RealmRecyclerViewAdapter for ${getData()!!.size} menu ordering."
        )
    }
    fun getMap(): Bundle {
        val bundle = Bundle()
        bundle.putSerializable("orderBundle", orderMap)
        return bundle
    }
}