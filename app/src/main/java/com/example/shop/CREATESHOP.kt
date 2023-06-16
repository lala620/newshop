package com.example.shop

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CREATESHOP : AppCompatActivity() {

    lateinit var createButton : Button
    lateinit var login: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createshop)


        createButton = findViewById(R.id.button)
        createButton.setOnClickListener {
            Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@CREATESHOP,Getshopiko::class.java)
            startActivity(intent)

        }
        login =findViewById(R.id.login)
        login.setOnClickListener {
            val intent = Intent(this@CREATESHOP,LoginActivity::class.java)
            startActivity(intent)
        }


    }
}