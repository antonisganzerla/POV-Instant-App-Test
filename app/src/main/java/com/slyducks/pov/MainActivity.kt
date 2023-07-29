package com.slyducks.pov

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val textView: TextView by lazy { findViewById(R.id.textView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data: Uri? = intent?.data

        data?.let {
            textView.text = data.toString()
        }
    }
}