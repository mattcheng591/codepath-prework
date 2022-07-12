package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


//Kotlin file handles user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //Tap a button to change color of the text
        //1. Add a button

        //Get a reference to button
        //2. Set up logic to know when user has pressed the button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handle button tap
            //3. Change color of the text
            Log.i("Matthew", "Tapped on button")
            //1.Get a reference to the text view
            //2.Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.white))
        }

        //Tap a button to change the color of background view
        findViewById<Button>(R.id.button_background).setOnClickListener {
            Log.i("Matt", "Background button has been tapped")
            findViewById<ConstraintLayout>(R.id.layout).setBackgroundResource(R.color.teal_200)
        }

        findViewById<Button>(R.id.button_text).setOnClickListener {
            Log.i("Textclicked","Text button has been tapped")

            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
        }
    }
}