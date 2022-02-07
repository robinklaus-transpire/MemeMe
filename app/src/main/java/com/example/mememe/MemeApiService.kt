package com.example.mememe

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MemeApi {

    @GET("gimme")
    suspend fun getMemeImage(): Call<List<String>>

    companion object {
        private val BASE_URL = "https://meme-api.herokuapp.com/"

        fun create(): MemeApi {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(MemeApi::class.java
            )
        }
    }
}