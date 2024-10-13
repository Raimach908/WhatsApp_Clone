package com.example.whatsapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var profileImageView: ImageView
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText)
        profileImageView = findViewById(R.id.profileImageView)
        nextButton = findViewById(R.id.nextButton)

        profileImageView.setOnClickListener {
            // Code to open image picker to upload a profile photo
            Toast.makeText(this, "Open image picker", Toast.LENGTH_SHORT).show()
        }

        nextButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                // Handle the next action
                Toast.makeText(this, "Name: $name", Toast.LENGTH_SHORT).show()

                // Navigate to VerifyPhoneActivity
                val intent = Intent(this, VerifyPhoneActivity::class.java)
                intent.putExtra("PHONE_NUMBER", "Your phone number here") // Replace with actual phone number
                startActivity(intent)
            }
        }

        // Set the button color and style
        nextButton.setBackgroundColor(Color.parseColor("#90EE90")) // Light green
        nextButton.setPadding(8, 8, 8, 8) // Smaller padding
    }
}
