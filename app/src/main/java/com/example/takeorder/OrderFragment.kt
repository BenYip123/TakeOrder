package com.example.takeorder

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter
//import com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter
import com.example.takeorder.adapter.OrderRecyclerViewAdapter
import com.example.takeorder.realm.RealmMenuCategory
import com.example.takeorder.realm.RealmMenuItems
import com.example.takeorder.realm.RealmOrders
import io.realm.Realm
import io.realm.Sort

class OrderFragment:Fragment(R.layout.fragment_order){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instantiate a RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.itemRecyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(requireActivity().applicationContext)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(
            DividerItemDecoration(requireActivity().applicationContext,
                DividerItemDecoration.VERTICAL)
        )
        // create an adapter with a RealmResults collection
        // and attach it to the RecyclerView
        val realm = Realm.getDefaultInstance()
        val adapter = MenuOrderRecyclerViewAdapter(requireContext(), realm.where(RealmMenuCategory::class.java).findAll())
        recyclerView.adapter = adapter

        val orderButton = view.findViewById<Button>(R.id.order)
        orderButton.setOnClickListener{
            findNavController().navigate(R.id.action_adminFragment_to_adminMenuFragment, adapter.getMap())
        }
    }
}