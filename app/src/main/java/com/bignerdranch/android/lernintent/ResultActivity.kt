package com.bignerdranch.android.lernintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val HELLO_KEY = "hello"

class ResultActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        helloTextView=findViewById(R.id.hello_text_view)

        val helloValue: String? = intent.extras?.getString(HELLO_KEY,"Hello")
        helloTextView.text = helloValue

    }
}