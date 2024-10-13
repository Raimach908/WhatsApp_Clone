package com.example.whatsapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EnterPhoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_phone)

        // Find the views
        val countryCodeSpinner: Spinner = findViewById(R.id.countryCodeSpinner)
        val phoneNumberInput: EditText = findViewById(R.id.phoneNumberInput)
        val nextButton: Button = findViewById(R.id.nextButton)

        // Set up country code spinner listener
        var selectedCountryCode = ""

        countryCodeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>, view: View?, position: Int, id: Long
            ) {
                selectedCountryCode = parent.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Default action if nothing is selected
            }
        }

        // Set a click listener for the next button
        nextButton.setOnClickListener {
            val phoneNumber = phoneNumberInput.text.toString().trim()

            // Validate phone number input
            if (phoneNumber.isEmpty()) {
                Toast.makeText(this, "Please enter your phone number", Toast.LENGTH_SHORT).show()
            } else {
                // Combine country code with phone number
                val fullPhoneNumber = "$selectedCountryCode $phoneNumber"

                // Navigate to VerifyPhoneActivity
                val intent = Intent(this, VerifyPhoneActivity::class.java)
                intent.putExtra("PHONE_NUMBER", fullPhoneNumber)
                startActivity(intent)
            }
        }
    }
}
