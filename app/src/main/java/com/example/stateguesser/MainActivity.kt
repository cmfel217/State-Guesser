package com.example.stateguesser

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

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
        val textAnswer = findViewById<TextView>(R.id.gtstextbox)
        val textInside: String = textAnswer.text.toString()
        val guessButton = findViewById<Button>(R.id.submitbutton)
        guessButton.setOnClickListener {
            if(textInside == "Arizona") imageViewPicture.setImageResource(R.drawable.download7)
        }
    }
     fun isVisible(v: Button){
        v.visibility = View.INVISIBLE
    }
}