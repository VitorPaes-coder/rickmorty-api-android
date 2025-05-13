package com.example.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.Character
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory{
    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retroFitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCharacterService(): CharacterService{
        return retroFitFactory.create(CharacterService::class.java)
    }
}