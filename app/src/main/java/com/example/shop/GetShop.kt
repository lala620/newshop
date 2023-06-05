package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class GetShop : AppCompatActivity() {


    lateinit var BackButton:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_shop)

        BackButton=findViewById(R.id.backbutton)
        BackButton.setOnClickListener{
            val intent=Intent(this@GetShop,CREATESHOP::class.java)
            startActivity(intent)
        }


    }
}