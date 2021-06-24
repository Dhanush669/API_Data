package com.devgd.apidata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var apiAdapter: ApiAdapter
    private lateinit var apiViewModel: ApiViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        apiViewModel = ViewModelProvider(
                this,
                ApiViewModelFactory(application)
        ).get(ApiViewModel::class.java)
        apiViewModel.getData().observe(this, Observer {
            apiAdapter= ApiAdapter(it)
            val layoutManager = LinearLayoutManager(applicationContext)
            recyclerView.layoutManager = layoutManager
            recyclerView.itemAnimator = DefaultItemAnimator()
            recyclerView.adapter = apiAdapter
        })

    }

    }