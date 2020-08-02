package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val onClickListener: Any = btnRegister.setOnClickListener {
            var firstName = etFirstname.text.toString()
            var lastName = etLastname.text.toString()
            val email = etEmail.text.toString()
            // val phoneNumber=etPhonenumber.text.toString()
            val passwordConfirmation = etConfirmPassword.text.toString()
            Toast.makeText(baseContext, lastName, Toast.LENGTH_LONG).show()
        }
    }
}