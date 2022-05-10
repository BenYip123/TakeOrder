package com.example.takeorder

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class OrderConfirmFragment : Fragment(R.layout.fragment_order_confirm) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toHomeButton = view.findViewById<Button>(R.id.to_home_button)
        val toOrderHistoryButton = view.findViewById<Button>(R.id.to_order_history_button)
        val toNewOrderButton = view.findViewById<Button>(R.id.to_new_order_button)

        toHomeButton.setOnClickListener {
            findNavController().navigate(
                OrderConfirmFragmentDirections.actionOrderConfirmFragmentToHomeFragment()
            )
        }
        toOrderHistoryButton.setOnClickListener {
            findNavController().navigate(
                OrderConfirmFragmentDirections.actionOrderConfirmFragmentToOrderHistoryFragment()
            )
        }
        toNewOrderButton.setOnClickListener {
            findNavController().navigate(
                OrderConfirmFragmentDirections.actionOrderConfirmFragmentToOrderFragment()
            )
        }
    }
}