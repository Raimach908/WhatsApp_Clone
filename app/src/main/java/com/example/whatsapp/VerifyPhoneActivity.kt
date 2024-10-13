package com.example.whatsapp

import android.content.Intent // Import Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VerifyPhoneActivity : AppCompatActivity() {

    private lateinit var verifyPhoneNumber: TextView
    private lateinit var statusMessage: TextView
    private lateinit var wrongNumberLink: TextView
    private lateinit var verificationCodeInput: EditText
    private lateinit var resendSMSButton: Button
    private lateinit var callMeButton: Button
    private lateinit var nextButton: Button // Declare Next Button
    private lateinit var resendSMSIcon: ImageView
    private lateinit var callMeIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verification) // Link the XML layout file

        // Initialize views
        verifyPhoneNumber = findViewById(R.id.verifyPhoneNumber)
        statusMessage = findViewById(R.id.statusMessage)
        wrongNumberLink = findViewById(R.id.wrongNumberLink)
        verificationCodeInput = findViewById(R.id.verificationCodeInput)
        resendSMSButton = findViewById(R.id.resendSMSButton)
        callMeButton = findViewById(R.id.callMeButton)
        nextButton = findViewById(R.id.nextButton2) // Initialize Next Button
        resendSMSIcon = findViewById(R.id.resendSMSIcon)
        callMeIcon = findViewById(R.id.callMeIcon)

        // Retrieve and display the phone number from the intent
        val phoneNumber = intent.getStringExtra("PHONE_NUMBER")
        verifyPhoneNumber.text = phoneNumber ?: "Phone number not available"

        // Set click listeners for buttons
        resendSMSButton.setOnClickListener {
            // Logic for resending SMS
            Toast.makeText(this, "Resending SMS...", Toast.LENGTH_SHORT).show()
        }

        callMeButton.setOnClickListener {
            // Logic for calling me
            Toast.makeText(this, "Calling...", Toast.LENGTH_SHORT).show()
        }

        wrongNumberLink.setOnClickListener {
            // Logic for handling wrong number
            Toast.makeText(this, "Handle wrong number here", Toast.LENGTH_SHORT).show()
        }

        // Set click listener for Next button
        nextButton.setOnClickListener {
            // Optionally, you can validate the verification code input
            val verificationCode = verificationCodeInput.text.toString()
            if (verificationCode.isEmpty()) {
                Toast.makeText(this, "Please enter the verification code", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed to RegistrationActivity
                val intent = Intent(this, RegistrationActivity::class.java)
                intent.putExtra("PHONE_NUMBER", phoneNumber) // Pass the phone number
                startActivity(intent)
            }
        }
    }
}
