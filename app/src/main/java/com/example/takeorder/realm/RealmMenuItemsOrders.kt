package com.example.takeorder.realm

import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects
import io.realm.annotations.RealmClass

// associative table in many-to-many relationship
open class RealmMenuItemsOrders (
    var menuItem: RealmMenuItems? = null,

    var order: RealmOrders? = null,

    // quantity of each menu item for a specific order
    var quantity: Int = 0

): RealmObject()