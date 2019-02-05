package com.zachtib.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// http://jsonplaceholder.typicode.com/   posts/2
interface TypicodeApi {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @GET("posts/{id}")
    fun getPostById(@Path("id") id: Int): Call<Post>
}