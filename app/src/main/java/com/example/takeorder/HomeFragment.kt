package com.example.takeorder

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment:Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //gets shared preferences for current user logged in and displays welcome message
        val sharedPref = requireActivity().applicationContext.getSharedPreferences("user info", Context.MODE_PRIVATE)
        val username = sharedPref?.getString("username", null)
        val welcomeText = view.findViewById<TextView>(R.id.welcomeMessage)
        welcomeText.text = buildString {
            append("Welcome, ")
            append(username)
        }

        val orderButton = view.findViewById<Button>(R.id.home_to_order_button)
        orderButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToOrderFragment())
        }
        val orderHistoryButton = view.findViewById<Button>(R.id.home_to_orderHistory_button)
        orderHistoryButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToOrderHistoryFragment())
        }
    }
}