package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * ROLL DICE
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        // Create new dice
        val dice = Dice(6)

        // update the screen
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        diceImage.setImageResource(diceName(dice.roll()))
        diceImage2.setImageResource(diceName(dice.roll()))
    }
    fun diceName(numberDice:Int): Int{
        when (numberDice){
            1 -> return R.drawable.dice_1
            2 -> return R.drawable.dice_2
            3 -> return R.drawable.dice_3
            4 -> return R.drawable.dice_4
            5 -> return R.drawable.dice_5
            else -> return R.drawable.dice_6
        }
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}