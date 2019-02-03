package com.zachtib.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var postAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postAdapter = PostAdapter()

        recyclerView.adapter = postAdapter
        recyclerView.layoutManager = LinearLayoutManager(baseContext)

        // TODO: Load Posts from API and populate the Adapter

        postAdapter.updatePosts(TODO())
    }
}
