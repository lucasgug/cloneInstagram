package com.lucasgugliuzza.ejinstagram.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ProfileDescription(
    name:String,
    description:String,
    estudio:String,
    ubicacion:String,
    modifier: Modifier = Modifier){

    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = name , fontWeight = FontWeight.Bold, fontSize = 12.sp)
        Text(text = description,fontSize = 12.sp )
        Text(text = estudio ,fontSize = 12.sp)
        Text(text = ubicacion,fontSize = 12.sp )
    }



}





@Preview(showBackground = true)
@Composable
fun ProfileDescriptionPreview(){
    ProfileDescription("","","","")
}