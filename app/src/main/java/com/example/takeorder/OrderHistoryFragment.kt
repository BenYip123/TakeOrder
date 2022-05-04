package com.example.takeorder

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.adapter.OrderRecyclerViewAdapter
import com.example.takeorder.realm.RealmOrders
import io.realm.Realm
import io.realm.Sort

class OrderHistoryFragment: Fragment(R.layout.fragment_order_history){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instantiate a RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.list)
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
        val adapter = OrderRecyclerViewAdapter(realm.where(RealmOrders::class.java).sort("date", Sort.DESCENDING).findAll())
        recyclerView.adapter = adapter

        val newestBtn = view.findViewById<Button>(R.id.newestBtn)
        newestBtn.setOnClickListener{
            adapter.updateData(realm.where(RealmOrders::class.java).sort("date", Sort.DESCENDING).findAll())
        }
        val oldestBtn = view.findViewById<Button>(R.id.oldestBtn)
        oldestBtn.setOnClickListener{
            adapter.updateData(realm.where(RealmOrders::class.java).sort("date", Sort.ASCENDING).findAll())
        }
        val expensiveBtn = view.findViewById<Button>(R.id.expensiveBtn)
        expensiveBtn.setOnClickListener{
            adapter.updateData(realm.where(RealmOrders::class.java).sort("total_price", Sort.DESCENDING).findAll())
        }
    }
}