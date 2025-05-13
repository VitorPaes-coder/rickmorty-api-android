package br.senai.sp.jandira.rickandmorty.model

data class Character(
    var id: Int = 0,
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var image: String = "",
)