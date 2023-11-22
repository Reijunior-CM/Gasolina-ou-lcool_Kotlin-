package com.example.gasolinaoulcool_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

lateinit var text_PrecoG : EditText
lateinit var text_PrecoA : EditText
lateinit var text_resultado : TextView

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        text_PrecoA = findViewById(R.id.text_PrecoA)
        text_PrecoG = findViewById(R.id.text_PrecoG)
        text_resultado = findViewById(R.id.text_Resultado)

        val bundle = intent.extras
        if (bundle != null){
            val gasolina = bundle.getDouble("gasolina")
            val alcool = bundle.getDouble("alcool")

            val resultado = alcool / gasolina
            if (resultado < 0.7){
                text_resultado.text = "Melhor utilizar Gasolina"
            }else{
                text_resultado.text = "Melhor utilizar alcool"
            }
        }





    }

}