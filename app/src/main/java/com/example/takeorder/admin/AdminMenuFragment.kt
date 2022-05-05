package com.example.takeorder.admin

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.takeorder.R
import com.example.takeorder.adapter.MenuRecyclerViewAdapter
import com.example.takeorder.realm.RealmMenuItems
import io.realm.Case
import io.realm.Realm
import java.text.NumberFormat
import java.util.*

class AdminMenuFragment: Fragment(R.layout.fragment_admin_menu){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instantiate a RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.menuList)
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
        val adapter = MenuRecyclerViewAdapter(
            requireContext(),
            realm.where(RealmMenuItems::class.java).findAll()
        )
        recyclerView.adapter = adapter

        val searchView = view.findViewById<SearchView>(R.id.menuSearch)
        // search bar that will query the id, name and category field at the same time
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // convert query into an int or null(if not a valid int) so it can be compared with the id column in database
                val intQuery: Int? = query.toIntOrNull()
                adapter.updateData(realm.where(RealmMenuItems::class.java)
                    .equalTo("id", intQuery)
                    .or()
                    .contains("name", query, Case.INSENSITIVE)
                    .or()
                    .contains("category", query, Case.INSENSITIVE)
                    .findAll())
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                val intNewText: Int? = newText.toIntOrNull()
                adapter.updateData(realm.where(RealmMenuItems::class.java)
                    .equalTo("id", intNewText)
                    .or()
                    .contains("name", newText, Case.INSENSITIVE)
                    .or()
                    .contains("category", newText, Case.INSENSITIVE)
                    .findAll())
                return false
            }
        })

        // add new menu item button
        val addMenuButton: View = view.findViewById(R.id.add_menu_button)
        addMenuButton.setOnClickListener {
            addMenuDialog()
        }
    }

    private fun addMenuDialog() {
        val inflater = LayoutInflater.from(requireContext())
        val subView = inflater.inflate(R.layout.edit_menu, null)
        val nameField = subView.findViewById<EditText>(R.id.name)
        val priceField = subView.findViewById<EditText>(R.id.price)
        val descriptionField = subView.findViewById<EditText>(R.id.description)

        // Long variable that we will use to put into the database
        // defaulted to 0
        var cleanStringLong: Long = 0

        // format the price field so that numbers are forced to be with 2 decimal places
        priceField.addTextChangedListener(object: TextWatcher {
            private var currentText = ""
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if(s.toString() != currentText){
                    priceField.removeTextChangedListener(this)

                    val cleanString = s.replace("\\D".toRegex(), "")

                    cleanStringLong = cleanString.toLong()

                    val parsed = cleanString.toDouble()
                    val formatted = NumberFormat.getCurrencyInstance(Locale.UK).format((parsed/100))
                    currentText = formatted
                    priceField.setText(formatted)
                    priceField.setSelection(formatted.length)
                    priceField.addTextChangedListener(this)
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })

        // implementation of spinner drop-down menu from documentation
        // https://developer.android.com/guide/topics/ui/controls/spinner#kotlin
        val spinner: Spinner = subView.findViewById(R.id.category_spinner)
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.edit_menu_array,
            android.R.layout.simple_spinner_item
        )
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Add new menu item").setView(subView)
            .setPositiveButton("Add Item") { _: DialogInterface, _: Int ->
                val realm = RealmMenuItems()
                realm.insert(
                    nameField.text.toString(),
                    cleanStringLong,
                    descriptionField.text.toString(),
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