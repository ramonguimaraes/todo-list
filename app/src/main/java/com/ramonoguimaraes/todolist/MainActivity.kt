package com.ramonoguimaraes.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ramonoguimaraes.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val lista = retornaTodo()

        mBinding.recyclerViewMain.adapter = TodoAdapter(lista)
        mBinding.recyclerViewMain.layoutManager = LinearLayoutManager(this)
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