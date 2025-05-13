package com.example.rickandmorty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory{
    private val BASE_URL = " https://rickandmortyapi.com/api/"

    private val retroFitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
}