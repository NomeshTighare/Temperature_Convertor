package com.example.temperatureconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.temp)
        val btn  = findViewById<Button>(R.id.btn)
        val ans1 = findViewById<TextView>(R.id.show1)


        btn.setOnClickListener{
            val val1= num1.text.toString().toFloat()
            val f= (val1 * 9/5)+32
            ans1.text=f.toString()

        }

    }
}