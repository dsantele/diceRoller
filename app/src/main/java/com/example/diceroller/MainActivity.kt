package com.example.diceroller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  var progressBar: ProgressBar? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    progressBar = findViewById(R.id.progressBar)

    val rollButton: Button = findViewById(R.id.button)
    rollButton.setOnClickListener {
      progressBar?.visibility = View.VISIBLE
      val textView: TextView = findViewById(R.id.textView)
      Dado().rollDice { result ->
        textView.text = result.toString()
        progressBar?.visibility = View.INVISIBLE
      }
    }

    val requestButton: Button = findViewById(R.id.request)
    requestButton.setOnClickListener {
      progressBar?.visibility = View.VISIBLE
      MyRepository().getUsers { result ->
        val response: TextView = findViewById(R.id.response)
        response.text = result.toString()
        progressBar?.visibility = View.INVISIBLE
      }
    }
  }
}
