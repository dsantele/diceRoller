package com.example.diceroller

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Dado {

  fun rollDice(onFinish: (result: Int) -> Unit) {
    MainScope().launch {
      val dice = Dice(12)
      delay(5000)
      onFinish(dice.roll())
    }
  }

  class Dice(private val numSides: Int) {

    fun roll(): Int {
      return (1..numSides).random()
    }
  }
}