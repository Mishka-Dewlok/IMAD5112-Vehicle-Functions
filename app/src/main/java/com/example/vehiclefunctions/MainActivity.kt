package com.example.vehiclefunctions

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Vehicle class
    class Vehicle(
        var type: String,
        var brand: String,
        var color: String,
        var sound: String
    )
    {
        // method
        fun describe(): String {

            return "My $type is a $color $brand that goes $sound!"

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtVehicle = findViewById<TextView>(R.id.textView)
        // create object
        val myVehicle = Vehicle(
            "car",
            "Toyota",
            "Red",
            "Vroom"
        )
        // call method
        val message = myVehicle.describe()
        // display message
        txtVehicle.text = message
    }
}