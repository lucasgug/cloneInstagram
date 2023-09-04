package com.lucasgugliuzza.ejinstagram.profile

data class User(
   val username : String,
   val profileImageUrl: String,
   val followers : Int,
   val following :Int,
   val name: String,
   val description: String,
   val estudio: String,
   val ubicacion: String,
   val stories : List<Story>,
   val posts : List<String>

)

data class Story(
   val image :String,
   val text : String

)
