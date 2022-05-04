package com.example.takeorder

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.takeorder.realm.RealmStaff
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    var sharedPreference:SharedPreference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sharedPreference = SharedPreference(this)

        // Change the text on the top bar
        supportActionBar!!.title = "Login"

        val usernameWrapper = findViewById<TextInputLayout>(R.id.usernameWrapper)
        val passwordWrapper = findViewById<TextInputLayout>(R.id.passwordWrapper)

        val button = findViewById<Button>(R.id.login_button)
        button.setOnClickListener{
            hideKeyboard()
            val username = usernameWrapper.editText?.text.toString()
            val password = passwordWrapper.editText?.text.toString()

            //remove previous error message from text fields
            usernameWrapper.error = null
            passwordWrapper.error = null

            val login = RealmStaff()

            // validate input on the client side first
            // if it passes those checks, then search database for matching credentials
            if(!validateUsername(username) || !validatePassword(password)) {
                if(!validateUsername(username)) {
                    usernameWrapper.error = "Username must not contain spaces"
                }
                if (!validatePassword(password)) {
                    passwordWrapper.error = "Password must be at least 5 characters"
                }
            } else if(login.query(username, password) != null){
                usernameWrapper.isErrorEnabled = false
                passwordWrapper.isErrorEnabled = false
                val loginDetails = login.query(username, password)
                sharedPreference!!.saveLogin(loginDetails!!.id, loginDetails.name, loginDetails.role)
                doLogin()
            } else {
                Toast.makeText(applicationContext, "Incorrect login details", Toast.LENGTH_SHORT).show()
            }
        }
    }
    // function to hide the keyboard
    // partial code taken from https://stackoverflow.com/a/57265044
    private fun hideKeyboard(){
        val view = currentFocus
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (view != null) {
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
    private fun validateUsername(username: String): Boolean {
        return !username.contains(" ")
    }
    // returns true if password is 5 or more characters
    private fun validatePassword(password: String): Boolean {
        return password.length > 4
    }
    private fun doLogin(){
        Toast.makeText(applicationContext, "Logging in...", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}