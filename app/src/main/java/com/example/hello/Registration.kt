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


var requestBody = MultipartBody.Builder()
    .setType(MultipartBody.FORM)
    .addFormDataPart("first_name", firstName)
    .addFormDataPart("last_name", lastName)
    .addFormDataPart("email", email)
    .addFormDataPart("phone_number", phoneNumber)
    .addFormDataPart("password", password)
    .build()

object lastName {

}

object firstName {

}

registerUser(requestBody)
Toast.makeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
}
}


fun registerUser(requestBody: RequestBody) {
    var apiClient = APiClient.buildService(ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    registrationCall.enqueue(object : Callback<RegistrationResponse> {
        override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

        override fun onResponse(
            call: Call<RegistrationResponse>,

            response: Response<RegistrationResponse>
        ) {
            if (response.isSuccessful) {
                Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG).show()
                startActivity(Intent(baseContext, MainActivity::class.java))
            } else {
                Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                    .show()
            }
        }
    })
}

}
var requestBody = MultipartBody.Builder()
    .setType(MultipartBody.FORM)
    .addFormDataPart("first_name", firstName)
    .addFormDataPart("last_name", lastName)
    .addFormDataPart("email", email)
    .addFormDataPart("phone_number", phoneNumber)
    .addFormDataPart("password", password)
    .build()

registerUser(requestBody)
Toast.makeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
}
}


fun registerUser(requestBody: RequestBody) {
    var apiClient = APiClient.buildService(ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    registrationCall.enqueue(object : Callback<RegistrationResponse> {
        override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

        override fun onResponse(
            call: Call<RegistrationResponse>,

            response: Response<RegistrationResponse>
        ) {
            if (response.isSuccessful) {
                Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG).show()
                startActivity(Intent(baseContext, MainActivity::class.java))
            } else {
                Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                    .show()
            }
        }
    })
}

}
