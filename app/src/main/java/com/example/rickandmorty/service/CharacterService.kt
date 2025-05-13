package com.example.rickandmorty.service

import android.telecom.Call
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.http.GET

interface CharacterService {

    @GET("character")
    fun listAllCharacters(): retrofit2.Call<Result>

    fun getCharacterById(id: Int)
}