package layout

import RegistrationResponse
import android.content.Intent
import android.telecom.Call
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.hello.MultipartBody
import layout.ApiClientuk.ApiInterface.ApiClient.buildService
import javax.security.auth.callback.Callback

class MainActivity {

    var  requestBody = MultipartBody.Builder()
    .setType(MultipartBody.FORM)
    .addFormDataPart("user_name", userName)
    .addFormDataPart("password", password)
    .build()

    registerUser(requestBody)
    Toast.makeText(baseContext, userName, Toast.LENGTH_SHORT).show()
}
}


fun registerUser(requestBody: RequestBody) {
    var apiClient = APiClient.(ApiClientuk.ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    val enqueue: Any = registrationCall.enqueue(object : Callback<RegistrationResponse> {
        private val baseContext: Any

        override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
            val baseContext = null
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

        override fun onResponse(
            call: Call<RegistrationResponse>,

            response: Response<RegistrationResponse>
        ) {
            if (response.isSuccessful) {
                val baseContext = null
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



}