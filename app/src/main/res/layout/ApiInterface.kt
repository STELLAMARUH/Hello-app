package layout

import RegistrationResponse
import android.telecom.Call
import android.widget.Toast
import com.example.hello.MultipartBody
import layout.ApiClientuk.ApiInterface.ApiClient.buildService
import javax.security.auth.callback.Callback

var  requestBody = MultipartBody.Builder()
.setType(MultipartBody.FORM)
.addFormDataPart("user_name", userName)
.addFormDataPart("password", password)
.build()

object password {

}

object userName {

}



}


fun registerUser(requestBody: RequestBody) {
    var apiClient = APiClient.buildService(ApiClientuk.ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    registrationCall.enqueue(object : Callback<RegistrationResponse> {
        override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
            val baseContext = null
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

class Response<T> {

    val isSuccessful: Boolean
}

class APiClient {

}

class RequestBody {

}

}


