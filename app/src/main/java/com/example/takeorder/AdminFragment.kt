package com.example.takeorder

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AdminFragment:Fragment(R.layout.fragment_admin){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuButton = view.findViewById<Button>(R.id.adminMenu)
        menuButton.setOnClickListener{
            findNavController().navigate(AdminFragmentDirections.actionAdminFragmentToAdminMenuFragment())
        }
        val staffButton = view.findViewById<Button>(R.id.adminStaff)
        staffButton.setOnClickListener{
            findNavController().navigate(AdminFragmentDirections.actionAdminFragmentToAdminStaffFragment())
        }
    }
}