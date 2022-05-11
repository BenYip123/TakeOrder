package com.example.takeorder.adapter

import android.text.SpannableStringBuilder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.bold
import androidx.core.text.italic
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.R
import com.example.takeorder.realm.RealmMenuItems
import java.math.BigDecimal
import java.text.DecimalFormat

class OrderSummaryAdapter(private val data: HashMap<RealmMenuItems?, Int>) :
    RecyclerView.Adapter<OrderSummaryAdapter.ViewHolder>() {
    var TAG = "REALM_RECYCLER_ADAPTER"
    var totalPrice: Long = 0
    var itemQuantityMap = mutableMapOf<RealmMenuItems, Int>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        Log.i(TAG, "Creating view holder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.order_summary_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // gets the key (RealmObject) by index
        val obj = data.keys.elementAt(position)
        // get the value (quantity) from the same element
        val quantity = data.getValue(obj)
        Log.i(TAG, "Binding view holder: ${obj!!.id}")
        // build strings to be displayed inside each recyclerview
        holder.name.text = SpannableStringBuilder().italic { append(obj.name) }
        // prices stored in db without decimal, so we divide by 100 and format it to show to 2 decimal places
        holder.price.text = SpannableStringBuilder().bold { append("£")
            .append(
                DecimalFormat("#,##0.00")
                    .format(
                        obj.price.toBigDecimal().divide(BigDecimal(100)).multiply(quantity.toBigDecimal())
                    ).toString()
            )}
        holder.quantity.text = SpannableStringBuilder().append(quantity.toString())
        // add to total price variable
        totalPrice += obj.price * quantity.toLong()

        // add to map of menu items and quantity
        itemQuantityMap[obj] = quantity
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.summary_name)
        var price: TextView = itemView.findViewById(R.id.summary_price)
        var quantity: TextView = itemView.findViewById(R.id.summary_quantity)
    }

    override fun getItemCount(): Int {
        return data.size
    }
    fun getTotal(): Long {
        return totalPrice
    }
    fun getItemMap(): MutableMap<RealmMenuItems, Int> {
        return itemQuantityMap
    }
}