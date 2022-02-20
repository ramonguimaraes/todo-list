package com.ramonoguimaraes.todolist

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ramonoguimaraes.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        val lista = arrayListOf<Todo>()
        val adapter = TodoAdapter(lista)

        val launchActivity = registerForActivityResult(StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val data = result?.data
                val todoTitle = data?.getStringExtra("intent_todo")
                lista.add(Todo(todoTitle!!, false))
                adapter.notifyDataSetChanged()
            }
        }

        mBinding.recyclerViewMain.adapter = adapter
        mBinding.recyclerViewMain.layoutManager = LinearLayoutManager(this)

        mBinding.floatingActionButton.setOnClickListener {
            val i = Intent(this, CadastroActivity::class.java)
            launchActivity.launch(i)
        }
    }
}
