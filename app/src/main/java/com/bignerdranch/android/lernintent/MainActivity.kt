package com.bignerdranch.android.lernintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton=findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener{
            val resultActivityIntent: Intent = Intent(this, ResultActivity::class.java)
            startActivity(resultActivityIntent)
        }
    }
}