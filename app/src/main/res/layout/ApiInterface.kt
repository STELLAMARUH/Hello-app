package layout

import android.telecom.Call


@POST("login")
fun loginStudent(@Body requestBody: RequestBody) {

    @GET("courses")
    fun getCourses(@Header("Authorization") accessToken: String): Call<CoursesResponse> {

    }
}

class CoursesResponse {

}

annotation class Header(val value: String)

annotation class GET(val value: String)

class RequestBody {

}

annotation class Body

annotation class POST(val value: String)
