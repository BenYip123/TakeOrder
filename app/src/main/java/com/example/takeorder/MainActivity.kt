package com.example.takeorder

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavView : BottomNavigationView
    var sharedPreference: SharedPreference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreference = SharedPreference(this)
        val sharedPref = getSharedPreferences("user info", Context.MODE_PRIVATE)

        bottomNavView = findViewById(R.id.bottomNavView)

        // if the logged in user is not an admin, hide the admin tab
        if(sharedPref.getString("role", null) != "admin") {
            bottomNavView.menu.findItem(R.id.adminFragment).isVisible = false
        }

        // partial code borrowed from documentation for the nav_graph to navigate through fragments using botton navigation bar
        // https://developer.android.com/guide/navigation/navigation-getting-started
        // https://developer.android.com/guide/navigation/navigation-ui
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bottomNavView).setupWithNavController(navController)

        // only show the navigation bar in the 4 main fragments, otherwise hide the bar
        navController.addOnDestinationChangedListener{ controller, destination, arguments ->
            when(destination.id) {
                R.id.homeFragment ->bottomNavView.visibility = View.VISIBLE
                R.id.orderFragment ->bottomNavView.visibility = View.VISIBLE
                R.id.orderHistoryFragment ->bottomNavView.visibility = View.VISIBLE
                R.id.adminFragment ->bottomNavView.visibility = View.VISIBLE
                else -> bottomNavView.visibility = View.GONE
            }
        }
    }

    // youtube.com/watch?v=2uCR0JSmMXc
    // code borrowed for onCreateOptionsMenu function
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.appbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            // logs the user out and clears the shared preferences when "logout" is selected from the menu
            R.id.logout -> {
                sharedPreference!!.clearSharedPreference()
                Toast.makeText(applicationContext, "Logging out...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        // find the current fragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val currentFragment = NavHostFragment.findNavController(navHostFragment).currentDestination?.id
        // check if current fragment is home fragment
        if(currentFragment != R.id.homeFragment){
            // if false, use default back button functionality
            super.onBackPressed()
        } else {
            // ask if the user would like to close the app on back button press, only on the home fragment
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Are you sure you want to exit the app?")
                .setPositiveButton(
                    "Yes",
                    DialogInterface.OnClickListener(function = { _: DialogInterface, _: Int ->
                        finish()
                    })
                )
                .setNegativeButton(
                    "No",
                    DialogInterface.OnClickListener(function = { dialog: DialogInterface, _: Int ->
                        dialog.cancel()
                    })
                )
            val alert = builder.create()
            alert.show()
        }
    }
}