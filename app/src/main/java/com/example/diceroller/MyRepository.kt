package com.example.diceroller

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRepository {

  fun getUsers(onFinish: (users: List<User>) -> Unit) {
    MainScope().launch {
      val retrofit = Retrofit.Builder()
        .baseUrl("https://gorest.co.in")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

      val userApi = retrofit.create(UserAPI::class.java)
      onFinish(userApi.listUsers())
    }
  }
}