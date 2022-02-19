package com.ramonoguimaraes.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(private val todoList: List<Todo>): RecyclerView.Adapter<TodoAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun binding(todo: Todo){
            val title = itemView.findViewById<TextView>(R.id.textView_item_title)
            val checkBox = itemView.findViewById<CheckBox>(R.id.checkbox_item_check)

            title.text = todo.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding(todoList[position])
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}