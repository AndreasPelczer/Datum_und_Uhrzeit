package com.example.uhr

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.uhr.R.id
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the current date and time
        val dateTime = LocalDateTime.now()

        // Get a TextView from the layout
        val textView = findViewById<TextView>(R.id.textView)

        // Set the TextView to the current date and time
        textView.text = dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))
    }
}