package com.example.wazup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countDice() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "butt clicked", Toast.LENGTH_SHORT).show()
        val textView: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        textView.text = randomInt.toString()
    }

    private fun countDice() {
        val textView: TextView = findViewById(R.id.result_text)
        val viewVal: Int? = textView.text.toString().toIntOrNull()

        if (viewVal == null) {
            textView.text = "1"
        } else {
            var toInt = viewVal.toInt()
            if (toInt < 6) {
                textView.text = (++toInt).toString()
            }
        }
    }
}