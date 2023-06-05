package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var Create: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Create =findViewById(R.id.create)
        Create.setOnClickListener{
            val intent = Intent(this@LoginActivity,GetShop::class.java)
            startActivity(intent)
        }


    }
}