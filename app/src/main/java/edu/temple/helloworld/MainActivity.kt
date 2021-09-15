package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Text = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.Button).setOnClickListener({Text.text = "You clicked the button"})
    }
}