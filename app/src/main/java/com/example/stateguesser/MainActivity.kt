package com.example.stateguesser

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set variable stateImage equal to the imageview
        var stateImage = findViewById<ImageView>(R.id.imageView)
        stateImage.setOnClickListener{

        }
    }
}