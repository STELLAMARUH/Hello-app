package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    fun onCreate(savedInstanceState: Bundle?, etUsername: Any) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogin = null
        btnLogin.setOnClickListener {
            var userName = etUsername.text.toString()
            val etPassword
            var password = etPassword.text.toString()
            var baseContext = null
            Toast.makeText(baseContext, userName, Toast.LENGTH_LONG).show()
        }
    }

    private fun setContentView(activityMain: Int) {
        TODO("Not yet implemented")
    }
}

private fun Nothing?.setOnClickListener(any: Any) {
    TODO("Not yet implemented")
}

open class AppCompatActivity {

}

class MainActivity {
}