package com.project.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button3)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            rollDice()

        }

    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()

        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        if (diceRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
        } else if ( diceRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
        } else if ( diceRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)
        } else if ( diceRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)
        } else if ( diceRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)
        } else {
            diceImage.setImageResource(R.drawable.dice_6)
        }

    }
}