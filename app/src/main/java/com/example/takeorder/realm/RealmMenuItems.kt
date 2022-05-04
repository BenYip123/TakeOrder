package com.example.takeorder.realm

import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required

open class RealmMenuItems (
    @PrimaryKey
    var id: Long = 0,

    @Required
    var name: String = "",

    var price: Long = 0,
    var description: String = "",

    //Link back to RealmMenuItemsOrders
    @LinkingObjects("menuItem")
    val itemOrder: RealmResults<RealmMenuItemsOrders>? = null
) : RealmObject() {
    fun insert(name: String, price: Long, description: String) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            val maxID = realm.where(RealmMenuItems::class.java).max("id")
            val newID: Long = if (maxID == null || maxID == 0) {
                1
            } else {
                maxID.toLong() + 1
            }
            val menuItem = RealmMenuItems(newID, name, price, description)
            realm.copyToRealmOrUpdate(menuItem)
        }
    }
}