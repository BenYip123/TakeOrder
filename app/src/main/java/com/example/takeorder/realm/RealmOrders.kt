package com.example.takeorder.realm

import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.*

open class RealmOrders(
    @PrimaryKey
    var id: Long = 0,

    var total_price: Long = 0,

    var date: Date? = null,

    // Link back to RealmMenuItemsOrders
    @LinkingObjects("order")
    val menuItemOrder: RealmResults<RealmMenuItemsOrders>? = null,

    // Each order has a staff member associated with it
    @LinkingObjects("orders")
    val staff: RealmResults<RealmStaff>? = null
) : RealmObject() {
    fun insert(total_price: Long, date: Date) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            val maxID = realm.where(RealmOrders::class.java).max("id")
            val newID: Long = if (maxID == null || maxID == 0) {
                1
            } else {
                maxID.toLong() + 1
            }
            val order = RealmOrders(newID, total_price, date)
            realm.copyToRealmOrUpdate(order)
            println("true")
        }
    }
}