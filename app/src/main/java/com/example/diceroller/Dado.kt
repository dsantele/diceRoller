package com.example.diceroller

import android.widget.TextView

class Dado {

    fun rollDice(): Int {
        val dice = Dice(12)
        return dice.roll()
    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}