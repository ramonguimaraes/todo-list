package com.ramonoguimaraes.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ramonoguimaraes.todolist.databinding.MainItemLayoutBinding

class TodoAdapter(private val todoList: List<Todo>): RecyclerView.Adapter<TodoAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: MainItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun binding(todo: Todo){
            with(binding) {
                textViewItemTitle.text = todo.title
                // TODO: Implementar checkBox
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MainItemLayoutBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding(todoList[position])
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}