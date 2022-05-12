package com.example.diceroller

import retrofit2.http.GET

interface UserAPI {

  @GET("/public/v2/users")
  suspend fun listUsers(): List<User>

}