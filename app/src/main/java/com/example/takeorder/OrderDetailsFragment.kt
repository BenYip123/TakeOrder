package com.example.takeorder

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.TextView
import androidx.core.text.bold
import androidx.core.view.doOnNextLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.adapter.OrderSummaryAdapter
import com.example.takeorder.realm.RealmMenuItems
import com.example.takeorder.realm.RealmMenuItemsOrders
import com.example.takeorder.realm.RealmOrders
import com.example.takeorder.realm.RealmStaff
import io.realm.Realm
import java.math.BigDecimal
import java.text.DecimalFormat

class OrderDetailsFragment : Fragment(R.layout.fragment_order_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: Bundle? = arguments
        val orderId = bundle!!.getLong("order_id")
        println(orderId)

        // put data into hashmap so recyclerview can display it
        val orderDetails: HashMap<RealmMenuItems?, Int> = HashMap()

        val realm = Realm.getDefaultInstance()
        val results = realm.where(RealmMenuItemsOrders::class.java).equalTo("order.id", orderId).findAll()
        results.forEach { entry ->
            orderDetails[entry.menuItem] = entry.quantity
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.detailsRecyclerView)
        val adapter = OrderSummaryAdapter(orderDetails)
        recyclerView.adapter = adapter
        val linearLayoutManager = LinearLayoutManager(requireActivity().applicationContext)
        // use doOnNextLayout method on recyclerView so that we can get the total price AFTER recyclerview content has loaded
        recyclerView.doOnNextLayout {
            // display the total price
            val totalPriceTextview = view.findViewById<TextView>(R.id.details_total_price)
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
        val staffIdTextview = view.findViewById<TextView>(R.id.details_staff_id)
        // query database for staff id linked to a specific order
        val staffId = realm.where(RealmStaff::class.java).equalTo("orders.id", orderId).findFirst()!!.id
        staffIdTextview.text = SpannableStringBuilder().append("Staff ID ").bold{append(staffId.toString())}
    }
}