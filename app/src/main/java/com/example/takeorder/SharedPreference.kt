package com.example.takeorder

import android.content.Context
import android.content.SharedPreferences

class SharedPreference (val context: Context) {
    private val preferenceName = "user info"
    val sharedPref: SharedPreferences? = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)

    fun saveLogin(id: Long, username: String, role: String) {
        val editor: SharedPreferences.Editor = sharedPref!!.edit()
        editor.putLong("id", id)
        editor.putString("username", username)
        editor.putString("role", role)
        editor.apply()
    }

    //getters
    fun getSharedPrefString(key_name: String): String? {
        return sharedPref!!.getString(key_name, null)
    }
    fun getSharedPrefLong(key_name: String): Long? {
        return sharedPref!!.getLong(key_name, 0)
    }

    fun clearSharedPreference() {
        val editor: SharedPreferences.Editor = sharedPref!!.edit()
        editor.clear().commit()
    }
}