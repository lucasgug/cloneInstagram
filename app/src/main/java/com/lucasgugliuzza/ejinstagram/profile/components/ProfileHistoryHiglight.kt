package com.lucasgugliuzza.ejinstagram.profile.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.lucasgugliuzza.ejinstagram.profile.Story

@Composable
fun ProfileHistoryHighlight(
    stories : List<Story>, //LISTA DE STORY
    modifier: Modifier = Modifier
) {
    LazyRow(modifier =  modifier) {
        items(stories){
            StoryItem(it)
            Spacer(modifier = modifier.width(8.dp))
        }
    }
}

@Composable
private fun StoryItem(
    story : Story , //USO STORY PARA CARGAR LA IMAGEN Y EL TEXT
    modifier: Modifier = Modifier

) {
    Column(
        modifier = modifier,
        horizontalAlignment =Alignment.CenterHorizontally
    ) {
        AsyncImage(  //SIRVE PARA PONER LA IMAGEN
            model = story.image ,
            contentDescription ="story image",
            contentScale = ContentScale.FillBounds , //ESCALA LA IMAGEN
            modifier = modifier
                .size(70.dp) //TAMAÑ0
                .clip(CircleShape) //FORMA

        )
        Text(text = story.text)
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileHistoryHighlightPreview() {
    ProfileHistoryHighlight( emptyList() )
}