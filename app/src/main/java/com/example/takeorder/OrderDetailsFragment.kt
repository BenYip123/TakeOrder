package com.example.takeorder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class OrderDetailsFragment : Fragment(R.layout.fragment_order_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: Bundle? = arguments
        val orderId = bundle!!.getLong("order_id")
        println(orderId)
    }
}