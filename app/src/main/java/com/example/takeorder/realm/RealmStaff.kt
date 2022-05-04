package com.example.takeorder.realm

import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required

open class RealmStaff (
    @PrimaryKey
    var id: Long = 0,

    @Required
    var name: String = "",

    var password: String = "",
    var role: String = "",

    // relationship to RealmOrders object, similar to one to many relationship
    var orders: RealmList<RealmOrders>? = RealmList()
) : RealmObject() {
    fun insert(name: String, password: String, role: String){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction{
            // get the largest primary key ID and if it is null or 0, set the new ID to 1
            // otherwise the new ID will be the largest current ID + 1
            val maxID = realm.where(RealmStaff::class.java).max("id")
            val newID: Long = if (maxID == null || maxID == 0){
                1
            } else {
                maxID.toLong() + 1
            }
            val staff = RealmStaff(newID, name, password, role)
            realm.copyToRealmOrUpdate(staff)
        }
    }
    fun query(name: String, password: String): RealmStaff? {
        val realm = Realm.getDefaultInstance()
        val login = realm.where(RealmStaff::class.java).equalTo("name", name).equalTo("password", password).findFirst()
        return login
    }
    fun update(id: Long, name: String, password: String, role: String){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction{
            val staff = RealmStaff(id, name, password, role)
            RealmStaff()
            realm.insertOrUpdate(staff)
        }
    }
    fun delete(id: Long){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction{
            // search by primary key then delete
            val result = realm.where(RealmStaff::class.java).equalTo("id", id).findFirst()
            result?.deleteFromRealm()
        }
    }
}
