package com.example.userlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.userlistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userList = listOf(
            User("Ahmad Khan", "https://i.pravatar.cc/150?img=1", "ahmad@gmail.com"),
            User("Sara Ali", "https://i.pravatar.cc/150?img=2", "sara@gmail.com"),
            User("Bilal Ahmed", "https://i.pravatar.cc/150?img=3", "bilal@gmail.com"),
            User("Fatima Noor", "https://i.pravatar.cc/150?img=4", "fatima@gmail.com"),
            User("Usman Malik", "https://i.pravatar.cc/150?img=5", "usman@gmail.com")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = UserAdapter(userList)
    }
}