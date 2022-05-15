package com.example.takeorder

import android.app.Application
import com.example.takeorder.realm.RealmMenuCategory
import com.example.takeorder.realm.RealmMenuItems
import com.example.takeorder.realm.RealmOrders
import com.example.takeorder.realm.RealmStaff
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmResults
import io.realm.kotlin.createObject
import java.time.Instant
import java.time.LocalDateTime
import java.util.*

@Suppress("unused")
class RealmDB: Application() {
    override fun onCreate() {
        super.onCreate()

        //initialise Realm database
        initRealm()

        /*
        val staff = RealmStaff()
        staff.insert("admin2", "myPassw0rD", "admin")
        val menuItems = RealmMenuItems()
        menuItems.insert("Fish and Chips", 500, "Fresh battered cod with chips", "food")
        menuItems.insert("Bottled Water", 120, "Bottled spring water", "drink")
        menuItems.insert("Ketchup", 10, "Tomato ketchup made from the finest tomatoes", "miscellaneous")
        */
    }
    private fun initRealm() {
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .schemaVersion(1)
            .allowQueriesOnUiThread(true)
            .allowWritesOnUiThread(true)
            .build()

        Realm.setDefaultConfiguration(config)

        // Delete existing Realm database on app startup, only for testing
        //Realm.deleteRealm(config)

        val realm = Realm.getInstance(config)

        // Create new Realm db if one does not exist
        // This should only create a new database the first time the app starts up
        // Adds a staff object with admin credentials to login
        if(!realm.isEmpty){
            println("database not empty")
        } else {
            println("database empty, create new")
            realm.executeTransaction{
                val staff = realm.createObject<RealmStaff>(0)
                staff.name = "admin"
                staff.password = "admin"
                staff.role = "admin"
            }
            val menuCategory = RealmMenuCategory()
            menuCategory.insert("food")
            menuCategory.insert("drink")
            menuCategory.insert("miscellaneous")
        }
    }
}