package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast

class MainActivity() : AppCompatActivity(), Parcelable {


    constructor(parcel: Parcel) : this() {
    }

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

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}

private fun Nothing?.setOnClickListener(any: Any) {
    TODO("Not yet implemented")
}

open class AppCompatActivity {

}

class MainActivity {
}