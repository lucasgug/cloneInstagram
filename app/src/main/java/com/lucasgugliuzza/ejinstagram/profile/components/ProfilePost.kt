package com.lucasgugliuzza.ejinstagram.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfilePost(
    images: List<String>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(3)){
        items(images){
            PostItem(it)
        }
    }

}

@Composable
private fun PostItem(
    image :String,
    modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        AsyncImage(
            model = image,
            contentDescription = "post",
            modifier.padding(1.dp))
    }

}



@Preview(showBackground = true)
@Composable
fun ProfilePostPreview() {
    ProfilePost(emptyList())
}