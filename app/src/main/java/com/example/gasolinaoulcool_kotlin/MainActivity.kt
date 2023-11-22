package com.example.gasolinaoulcool_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

lateinit var btn_Calcular: Button
lateinit var text_Gasolina: EditText
lateinit var text_Alcool: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Calcular = findViewById(R.id.btn_calcular)
        text_Gasolina = findViewById(R.id.text_Gasolina)
        text_Alcool = findViewById(R.id.text_Alcool)

        btn_Calcular.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            val gasolina = text_Gasolina.text.toString()
            val alcool = text_Alcool.text.toString()
            if (gasolina.isNotEmpty() && alcool.isNotEmpty()) {
                intent.putExtra("gasolina", gasolina.toDouble())
                intent.putExtra("alcool", alcool.toDouble())
            }
            startActivity(intent)
        }


    }
}


