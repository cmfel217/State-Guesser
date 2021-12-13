package com.example.stateguesser

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set variable stateImage equal to the imageview
        val startButton = findViewById<Button>(R.id.button)
        val imageViewPicture = findViewById<ImageView>(R.id.imageView)
        startButton.setOnClickListener {
            isVisible(startButton)
            imageViewPicture.setImageResource(R.drawable.download5)
        }
    }
     fun isVisible(v: Button){
        v.visibility = View.INVISIBLE
    }
}