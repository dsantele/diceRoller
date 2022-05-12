package com.example.diceroller

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.not
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

  @Test
  fun myTest() {
    launchActivity<MainActivity>().use {
      onView(withId(R.id.button))
        .check(matches(withText("ROLL")))

      onView(withId(R.id.button)).perform(click())

      onView(withId(R.id.textView))
        .check(matches(not(withText(""))))
    }
  }
}
