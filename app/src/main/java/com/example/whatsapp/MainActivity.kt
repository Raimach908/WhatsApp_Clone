package com.example.whatsapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Make sure this points to your actual layout file

        // Find the views
        val privacyPolicyTextView: TextView = findViewById(R.id.privacy_policy_text)
        val agreeButton: Button = findViewById(R.id.agreeButton)

        // Create the full text
        val fullText = "Read our Privacy Policy. Tap \"Agree and continue\" to accept the Terms of services."

        // Create a SpannableString
        val spannableString = SpannableString(fullText)

        // Apply green color to "Read our Privacy Policy" and "Terms of services"
        spannableString.setSpan(
            ForegroundColorSpan(Color.parseColor("#25D366")),
            9, 23,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            ForegroundColorSpan(Color.parseColor("#25D366")),
            64, 82,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Optional: Apply style (bold) to "Agree" and "continue"
        spannableString.setSpan(
            StyleSpan(android.graphics.Typeface.BOLD),
            30, 36,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            StyleSpan(android.graphics.Typeface.BOLD),
            40, 48,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Set the styled text to the TextView
        privacyPolicyTextView.text = spannableString

        // Set a click listener for the agree button
        agreeButton.setOnClickListener {
            // Navigate to the next screen (EnterPhoneActivity)
            val intent = Intent(this, EnterPhoneActivity::class.java)
            startActivity(intent)
        }
    }
}
