package com.ramonoguimaraes.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val btnSalvar: Button = findViewById(R.id.button_save)
        btnSalvar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(
                "intent_todo",
                findViewById<EditText>(R.id.editText_todo_title).text.toString()
            )

            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
