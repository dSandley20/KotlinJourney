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

    /**
     * Challenge - In this challenge, you will customize the toast to show at the top instead of the bottom of the screen. To
                   change how the toast is displayed, use the Toast class’s setGravity method. Use Gravity.TOP for the
                   gravity value. Refer to the developer documentation at developer.android.com/reference/android/
                   widget/Toast.html#setGravity(int, int, int) for more details.
     */
    private fun showToast(text : Int){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0 , 0)
        toast.show()
    }
}