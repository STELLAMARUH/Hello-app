package ke.co.hello

import com.google.gson.annotations.SerializedName
import layout.SerializedName

data class Course(
    @SerializedName("course_id") var courseId: String,
    @SerializedName("course_name") var courseName: String,
    @SerializedName("course_code") var courseCode: String,
    @SerializedName("instructor") var instructor: String,
    @SerializedName("description") var description: String
)