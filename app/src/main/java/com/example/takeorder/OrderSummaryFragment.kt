package com.example.takeorder

import android.content.Context
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.bold
import androidx.core.view.doOnNextLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.adapter.OrderSummaryAdapter
import com.example.takeorder.realm.RealmMenuItems
import com.example.takeorder.realm.RealmMenuItemsOrders
import com.example.takeorder.realm.RealmOrders
import org.w3c.dom.Text
import java.math.BigDecimal
import java.text.DecimalFormat
import java.time.Instant
import java.util.*
import kotlin.collections.HashMap

class OrderSummaryFragment: Fragment(R.layout.fragment_order_summary){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //gets shared preferences for current user logged in to get their staff id to attach to the order
        val sharedPref = requireActivity().applicationContext.getSharedPreferences("user info", Context.MODE_PRIVATE)
        val staffId = sharedPref.getLong("id", 0)

        // get data sent from OrderFragment bundle
        val orderData: HashMap<RealmMenuItems?, Int>
        val bundle: Bundle? = arguments
        orderData = (bundle!!.getSerializable("orderBundle") as? HashMap<RealmMenuItems?, Int>)!!

        val recyclerView = view.findViewById<RecyclerView>(R.id.summaryRecyclerView)
        val adapter = OrderSummaryAdapter(orderData)
        recyclerView.adapter = adapter
        val linearLayoutManager = LinearLayoutManager(requireActivity().applicationContext)
        // use doOnNextLayout method on recyclerView so that we can get the total price AFTER recyclerview content has loaded
        recyclerView.doOnNextLayout {
            // display the total price
            val totalPriceTextview = view.findViewById<TextView>(R.id.summary_total_price)
            totalPriceTextview.text = SpannableStringBuilder().bold { append("£")
                .append(
                    DecimalFormat("#,##0.00")
                        .format(
                            adapter.getTotal().toBigDecimal().divide(BigDecimal(100))
                        ).toString()
                )}
        }
        recyclerView.layoutManager = linearLayoutManager

        // display the staff id of the current user
        val staffIdTextview = view.findViewById<TextView>(R.id.summary_staff_id)
        staffIdTextview.text = SpannableStringBuilder().append("Staff ID ").bold{append(staffId.toString())}

        // go to order confirmed screen if the order is successfully added to the database
        val orderConfirmButton = view.findViewById<Button>(R.id.confirm_order)
        orderConfirmButton.setOnClickListener {
            val realmOrder = RealmOrders()
            val currentDate = Date.from(Instant.now())
            // create an order object in realm order class and link to realm staff class
            val order = realmOrder.insert(adapter.getTotal(), currentDate, staffId)

            // add order details (items and quantity) to database
            val itemQuantityMap = adapter.getItemMap()
            val realmItemsOrders = RealmMenuItemsOrders()
            realmItemsOrders.insertMultiple(itemQuantityMap, order)
            findNavController().navigate(OrderSummaryFragmentDirections.actionOrderSummaryFragmentToOrderConfirmFragment())

            Toast.makeText(context, "Order successfully added to database", Toast.LENGTH_SHORT).show()
        }
    }

}