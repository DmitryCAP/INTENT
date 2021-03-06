package com.bignerdranch.android.lernintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton=findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener{
            //val resultActivityIntent: Intent = Intent(this, ResultActivity::class.java)
           // resultActivityIntent.putExtra(HELLO_KEY,null as String?)
            //startActivity(resultActivityIntent)
            val link = Uri.parse("https://google.com")
            val openBrowserIntent: Intent = Intent(Intent.ACTION_VIEW, link)
            val chooser = Intent.createChooser(openBrowserIntent,"Browser")
            startActivity(chooser)

        }
    }
}