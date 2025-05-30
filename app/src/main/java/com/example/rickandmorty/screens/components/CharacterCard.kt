package com.example.rickandmorty.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.rickandmorty.R
import com.example.rickandmorty.screens.HomeScreen

@Composable
fun CharacterCard(
    name: String = "Sem  nome",
    species: String = "Species",
    status: String = "Status",
    image: String
){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ){
        Row (
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Card (
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 8.dp),
                shape = CircleShape
            ){
                AsyncImage(
                    model = image,
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Column (
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ){

                Text(
                    text = name,
                    fontSize = 26.sp
                )
                Text(
                    text = species
                )
                Text(
                    text = status
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CharacterCardPreview(){
    CharacterCard(
        name = "Summer",
        species = "Human",
        status = "Alive",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
    )
}
