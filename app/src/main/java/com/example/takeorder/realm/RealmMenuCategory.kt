package com.example.takeorder.realm

import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.PrimaryKey

open class RealmMenuCategory (
    @PrimaryKey
    var category: String = "",
    var items: RealmList<RealmMenuItems>? = RealmList()
) : RealmObject(){
    fun insert(category: String){
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            val menuCategory = RealmMenuCategory(category)
            realm.copyToRealmOrUpdate(menuCategory)
        }
    }
}