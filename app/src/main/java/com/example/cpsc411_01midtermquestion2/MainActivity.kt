// Question 2 - CPSC 411-01 Midterm
// Ernesto Hooghkirk
// CWID: 887409282

package com.example.cpsc411_01midtermquestion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Main Activity", "Creating a TextView on screen.")
        var vObj = UIManager(this).createFullScreen()
        setContentView(vObj)
    }
}