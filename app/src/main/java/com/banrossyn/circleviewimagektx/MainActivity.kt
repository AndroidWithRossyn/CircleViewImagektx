package com.banrossyn.circleviewimagektx

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // In your Activity or Fragment
        val profileImageView = findViewById<CircleImageView>(R.id.profile_img)

        // Set border color programmatically
        // profileImageView.borderColor = Color.RED

        // Set border width programmatically
        // profileImageView.borderWidth = 5 // in pixels

        // Set circle background color programmatically
        // profileImageView.circleBackgroundColor = Color.BLUE

    }

}