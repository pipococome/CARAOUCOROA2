package com.example.caraoucoroa

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TelaResultado : AppCompatActivity() {

    lateinit var resultadoDado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        resultadoDado = findViewById(R.id.resultadoDado)

        // Recebe o número sorteado da MainActivity
        val numeroSorteado = intent.getIntExtra("numero", 1)

        // Exibe a imagem correspondente ao número sorteado
        val resourceId = when (numeroSorteado) {
            1 -> R.drawable.dado_face_1
            2 -> R.drawable.dado_face_2
            3 -> R.drawable.dado_face_3
            4 -> R.drawable.dado_face_4
            5 -> R.drawable.dado_face_5
            6 -> R.drawable.dado_face_6
            else -> R.drawable.dado_face_1
        }

        resultadoDado.setImageResource(resourceId)
    }
}
