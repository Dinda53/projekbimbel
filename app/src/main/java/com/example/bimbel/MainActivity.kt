package com.example.bimbel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =  findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent1 = Intent (this, MainActivity2::class.java)
            startActivity(intent1)
        }





    }
}