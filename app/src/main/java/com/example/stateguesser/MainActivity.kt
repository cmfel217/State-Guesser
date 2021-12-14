package com.example.stateguesser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

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
        val guessButton = findViewById<Button>(R.id.submitbutton)
        val gtsTextView = findViewById<TextView>(R.id.gtstextbox)
        val pointTextView = findViewById<TextView>(R.id.PointTextView)
        guessButton.setOnClickListener {
            if(gtsTextView.text.toString() == "Arizona")
            {
                imageViewPicture.setImageResource(R.drawable.download7)
                gtsTextView.text = ""
                pointTextView.text = 100.toString()
            }
            else
            {
                imageViewPicture.setImageResource(R.drawable.download7)
                gtsTextView.text = ""
                pointTextView.text = "-100"
            }
        }
    }
     private fun isVisible(v: Button){
        v.visibility = View.INVISIBLE
    }
}