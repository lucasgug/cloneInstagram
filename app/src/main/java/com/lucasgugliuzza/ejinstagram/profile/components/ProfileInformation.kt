package com.lucasgugliuzza.ejinstagram.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    profileImageUrl :String,
    followers:Int,
    following:Int,
    post:Int,
    modifier: Modifier = Modifier

){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically) {
        //Pongo Image circular
        AsyncImage(
            model = profileImageUrl ,
            contentDescription = "profile Image",
            modifier = modifier.clip(CircleShape) )


        ProfileInformationItem(post,"Publicaciones")
        ProfileInformationItem(followers,"Seguidores")
        ProfileInformationItem(following,"Seguidos")
    }

}


@Composable
private  fun ProfileInformationItem(
    amout : Int,
    type:String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = amout.toString(), fontWeight = FontWeight.Bold)
        Text(text = type , fontWeight = FontWeight.Light )
    }

}





@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview(){
    ProfileInformation("",0,0,0)
}