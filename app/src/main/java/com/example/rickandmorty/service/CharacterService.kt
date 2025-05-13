package com.example.rickandmorty.service

import android.telecom.Call
import br.senai.sp.jandira.rickandmorty.model.Character
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun listAllCharacters(): retrofit2.Call<Result>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): retrofit2.Call<Character>

    @POST("character")
    fun insert(@Body character: Character): retrofit2.Call<Character>

    @PUT("character/{id}")
    fun update(@Body character: Character): retrofit2.Call<Character>
}