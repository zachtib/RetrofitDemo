package com.zachtib.retrofitdemo

//{
//    "userId": 1,
//    "id": 2,
//    "title": "qui est esse",
//    "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
//}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)