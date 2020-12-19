package com.example.wazup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImageSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImageSecond = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clearDice() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "butt clicked", Toast.LENGTH_SHORT).show()
//        val textView: TextView = findViewById(R.id.result_text)
//        textView.text = randomInt.toString()
        val drawResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawResource)

        val drawResource2 = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageSecond.setImageResource(drawResource2)
    }

    private fun clearDice() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImageSecond.setImageResource(R.drawable.empty_dice)
    }
}