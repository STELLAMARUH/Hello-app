package com.example.hello

import layout.SerializedName
import layout.Student

class LoginResponse {
    data class LoginResponse (
        @SerializedName("message") var message: String,
        @SerializedName("student") var student: Student
    )

}