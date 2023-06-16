package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    private lateinit var email: EditText
    private lateinit var password: EditText

    lateinit var Create: TextView
    lateinit var signin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Create =findViewById(R.id.create)
        Create.setOnClickListener{
            val intent = Intent(this@LoginActivity,Getshopiko::class.java)
            startActivity(intent)
        }

        auth = FirebaseAuth.getInstance()

        signin =findViewById(R.id.button3)
        signin.setOnClickListener {
            val intent =Intent(this@LoginActivity,Homepage::class.java)
            startActivity(intent)



        }


    }



}
