package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)



        Handler().postDelayed(

            {
                startActivity(Intent(this@MainActivity, CREATESHOP::class.java))
                finish()

                if (auth.currentUser != null){
                    startActivity(Intent(this@MainActivity, Homepage::class.java))
                    finish()

                }else{
                    val intent = Intent(this@MainActivity,LoginActivity::class.java)
                    startActivity(intent)
                }

            },
            2000

        )






    }
}

