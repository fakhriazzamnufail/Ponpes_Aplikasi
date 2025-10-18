package com.example.ponpes_aplikasi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnGoogle = findViewById<Button>(R.id.btnGoogle)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)

        btnLogin.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)

            startActivity(intent)
        }

        btnGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }

        inputEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {}
        })
    }
}