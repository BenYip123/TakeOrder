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
    @LinkingObjects("items")
    val category: RealmResults<RealmMenuCategory>? = null,

    //Link back to RealmMenuItemsOrders
    @LinkingObjects("menuItem")
    val itemOrder: RealmResults<RealmMenuItemsOrders>? = null
) : RealmObject() {
    fun insert(name: String, price: Long, description: String, category: String) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            val maxID = realm.where(RealmMenuItems::class.java).max("id")
            val newID: Long = if (maxID == null || maxID == 0) {
                1
            } else {
                maxID.toLong() + 1
            }
            val menuItem = RealmMenuItems(newID, name, price, description)
            val category = realm.where(RealmMenuCategory::class.java).equalTo("category", category).findFirst()
            category?.items?.add(menuItem)
            realm.copyToRealmOrUpdate(menuItem)
        }
    }
    fun update(id: Long, name: String, price: Long, description: String, category: String){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction{
            val menuItem = RealmMenuItems(id, name, price, description)
            val oldCategory = realm.where(RealmMenuCategory::class.java).equalTo("items.id", id).findFirst()
            val newCategory = realm.where(RealmMenuCategory::class.java).equalTo("category", category).findFirst()
            realm.insertOrUpdate(menuItem)
            // if category has changed, remove it from the old category and add to the new
            if(oldCategory?.category != category){
                val newMenuItem = realm.where(RealmMenuItems::class.java).equalTo("id", id).findFirst()
                oldCategory?.items?.remove(newMenuItem)
                newCategory?.items?.add(newMenuItem)
            }
        }
    }
    fun delete(id: Long){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction{
            // search by primary key then delete
            val result = realm.where(RealmMenuItems::class.java).equalTo("id", id).findFirst()
            result?.deleteFromRealm()
        }
    }
}