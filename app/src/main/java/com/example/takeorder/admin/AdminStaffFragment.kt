package com.example.takeorder.admin

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.R
import com.example.takeorder.adapter.OrderRecyclerViewAdapter
import com.example.takeorder.adapter.StaffRecyclerViewAdapter
import com.example.takeorder.realm.RealmOrders
import com.example.takeorder.realm.RealmStaff
import io.realm.Realm
import io.realm.Sort

class AdminStaffFragment : Fragment(R.layout.fragment_admin_staff) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instantiate a RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.staffList)
        recyclerView.layoutManager =
            LinearLayoutManager(requireActivity().applicationContext)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireActivity().applicationContext,
                DividerItemDecoration.VERTICAL
            )
        )
        // create an adapter with a RealmResults collection
        // and attach it to the RecyclerView
        val realm = Realm.getDefaultInstance()
        val adapter = StaffRecyclerViewAdapter(
            requireContext(),
            realm.where(RealmStaff::class.java).findAll()
        )
        recyclerView.adapter = adapter

        val searchView = view.findViewById<SearchView>(R.id.staffSearch)
        // search bar that will query the username or id field at the same time
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // convert query into an int or null(if not a valid int) so it can be compared with the id column in database
                val intQuery: Int? = query.toIntOrNull()
                adapter.updateData(realm.where(RealmStaff::class.java).equalTo("id", intQuery).or().contains("name", query).findAll())
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                val intNewText: Int? = newText.toIntOrNull()
                adapter.updateData(realm.where(RealmStaff::class.java).equalTo("id", intNewText).or().contains("name", newText).findAll())
                return false
            }
        })

        // add new staff member button
        val addStaffButton: View = view.findViewById(R.id.add_staff_button)
        addStaffButton.setOnClickListener {
            addStaffDialog()
        }
    }

    private fun addStaffDialog() {
        val inflater = LayoutInflater.from(requireContext())
        val subView = inflater.inflate(R.layout.edit_staff, null)
        val usernameField = subView.findViewById<EditText>(R.id.username)
        val passwordField = subView.findViewById<EditText>(R.id.password)

        // implementation of spinner drop-down menu from documentation
        // https://developer.android.com/guide/topics/ui/controls/spinner#kotlin
        val spinner: Spinner = subView.findViewById(R.id.role_spinner)
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.edit_staff_array,
            android.R.layout.simple_spinner_item
        )
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Add new staff").setView(subView)
            .setPositiveButton("Add Staff") { _: DialogInterface, _: Int ->
                val realm = RealmStaff()
                realm.insert(
                    usernameField.text.toString(),
                    passwordField.text.toString(),
                    spinner.selectedItem.toString()
                )
            }
            .setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
                dialog.cancel()
            }
        val alert = builder.create()
        alert.show()
    }
}