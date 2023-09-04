package com.lucasgugliuzza.ejinstagram.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun ProfileAction(
    followClick : () -> Unit,
    messageClick : () ->  Unit,
    modifier : Modifier = Modifier
){
    Row(modifier = modifier.fillMaxWidth()) {

        ProfileButton(onClick =  followClick, text = "Seguir",
            modifier = modifier
                .weight(1f)
        )

        Spacer(modifier = modifier.width(8.dp))

        ProfileButton(onClick =  messageClick , text = "Mensaje",
            modifier = modifier
                .weight(1f)
        )


    }

}

@Composable
private fun ProfileButton(modifier: Modifier = Modifier, onClick: () -> Unit, text: String) {
    Button(onClick = onClick ,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
        shape = RoundedCornerShape(10.dp),
        modifier =  modifier
    ) {
        Text(text = text )
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileActionPreview(){
    ProfileAction({},{})
}