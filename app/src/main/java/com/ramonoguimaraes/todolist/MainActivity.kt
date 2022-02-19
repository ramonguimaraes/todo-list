package com.ramonoguimaraes.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = retornaTodo()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_main)
        recyclerView.adapter = TodoAdapter(lista)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun retornaTodo(): List<Todo>{
        return listOf<Todo>(
            Todo("Titulo 1",false),
            Todo("Titulo 2",false),
            Todo("Titulo 3",false),
            Todo("Titulo 4",false),
            Todo("Titulo 5",false),
            Todo("Titulo 6",false),
            Todo("Titulo 7",false),
        )
    }
}