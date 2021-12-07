package com.example.kotlinjourney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting buttons to variables for easier access
        val btnTrue = findViewById<Button>(R.id.BtnTrue)
        val btnFalse = findViewById<Button>(R.id.BtnFalse)

        btnTrue.setOnClickListener {
            showToast(R.string.correct_toast)
        }

        btnFalse.setOnClickListener {
            showToast(R.string.incorrect_toast)
        }
    }
    private fun showToast(text : Int){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0 , 0)
        toast.show()
    }
}