package com.lucasgugliuzza.ejinstagram.profile

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lucasgugliuzza.ejinstagram.profile.components.*


//EN ESTE PONGO TODOS LOS COMPONENTES Y LUEGO LO PASO A LA MAINACTIVITY
@Composable
fun ProfileScreen(){
    val user = User(
        username = "Lucas_Gugliuzza",
        profileImageUrl = "https://via.placeholder.com/200",
        followers = 388,
        following = 290,
        name = "Lucas Gugliuzza",
        description = "💻 Salvando a la humanidad escribiendo código",
        ubicacion = "🇦🇷 Buenos Aires | Argentina",
        estudio = "📕 Analista en Sistemas",
        stories = listOf(
            Story("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7JX-6jp6UXX6W7n3NTGfrYI7-zOXYfhVQBw&usqp=CAU" , "Tigre"),
            Story("https://toppng.com/uploads/preview/escudo-del-real-madrid-11551060158j7jgejcdbu.png" , "Real Madrid"),
            Story("https://upload.wikimedia.org/wikipedia/it/thumb/7/74/Manchester_City_stemma.svg/1200px-Manchester_City_stemma.svg.png" , "Manchester City"),
            Story("https://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/58.png" , "Chelsea"),
            Story("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Bayern_M%C3%BCnchen_Logo_%281996-2002%29.svg/800px-Bayern_M%C3%BCnchen_Logo_%281996-2002%29.svg.png" , "Bayer Munich"),
            Story("https://1000marcas.net/wp-content/uploads/2020/01/Juventus-logo.png" , "Juventus"),
            Story("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/FC_Internazionale_Milano_2021.svg/1200px-FC_Internazionale_Milano_2021.svg.png" , "Inter"),
            Story("https://yt3.googleusercontent.com/b2afDPo4wCeOz2GTASLnMRKCbs0BdmFtDlk0dbeCT1PnW6KGyZNLQbDKAKXb3dCHvmHh9Fzz_A=s900-c-k-c0x00ffffff-no-rj" , "Milan"),
            Story("https://upload.wikimedia.org/wikipedia/en/thumb/5/5c/Inter_Miami_CF_logo.svg/1200px-Inter_Miami_CF_logo.svg.png" , "Inter Miami"),

        ) ,
        posts = listOf(
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",

        )


    )

    val context = LocalContext.current

    Column {
        ProfileHeader(
            backClick = { showToast(context,"Back Button") },
            notificationsClick = { showToast(context,"Notifications") },
            optionClick = { showToast(context,"Options Button") },
            username = user.username
            )

        ProfileInformation(
            profileImageUrl = user.profileImageUrl,
            post = user.posts.size, //CANTIDAD DE POSTS
            followers = user.followers,
            following = user.following
        )

        ProfileDescription(
            name = user.name,
            description = user.description,
            estudio = user.estudio,
            ubicacion = user.ubicacion,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp,top = 4.dp, bottom = 2.dp)
        )
        ProfileAction(
            followClick = { showToast(context,"follow button") },
            messageClick = { showToast(context,"message button") },
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        )

        ProfileHistoryHighlight(
            stories = user.stories,
            modifier = Modifier.padding(start = 16.dp)

        )
        
        ProfilePost(images = user.posts)
    }

}
//CREO LA FUNCION PARA DEJAR UN MENSAJE POR CADA BOTON QUE APRETEMOS
private fun showToast(context: Context, clickedItem :String){
    Toast.makeText(context,"CLicked on $clickedItem",Toast.LENGTH_SHORT ).show()
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}