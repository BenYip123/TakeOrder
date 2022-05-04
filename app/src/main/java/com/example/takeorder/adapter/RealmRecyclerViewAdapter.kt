package com.example.takeorder.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.text.SpannableStringBuilder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.text.bold
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.R
import com.example.takeorder.realm.RealmOrders
import com.example.takeorder.realm.RealmStaff
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import java.math.BigDecimal
import java.text.DecimalFormat

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
        // hide textView4 and buttons as they are not needed for this view
        holder.textView4.visibility = View.GONE
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
        // prices stored in db without decimal, so we divide by 100 and format it to show to 2 decimal places
        holder.username.text = SpannableStringBuilder().bold { append("Username ") }.append(obj.name)
        holder.role.text =
            SpannableStringBuilder().bold { append("Role ") }.append(obj.role)
        holder.password.text = SpannableStringBuilder().bold { append("Password ")}.append(obj.password)
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
                println(spinnerPosition)
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