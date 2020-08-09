package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_courses.*

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
    }
}

data class Coursesactivity(val courses_id:Int, val courses_name:String, val course_code:Int, val instructor:String, val Description:String)
class coursesactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)
       rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val CoursesactivityAdapter = CoursesActivityRecyclerViewAdapter(
            coursesactivity = listOf(
                Coursesactivity(5006, "stella", 4004, "Maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"), Coursesactivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1"),
                Coursesactivity(5006, "stella", 4004, "maruh", "Kotline project1")

            )
        )


        val rvCoursesActivity = null
        val coursesAdapter = null
        val value: Any = rvCoursesActivity.= coursesAdapter



    }

    private fun CoursesActivityRecyclerViewAdapter(
        listOf: List<Any>,
        coursesactivity: List<Coursesactivity>
    ) {

    }

}
