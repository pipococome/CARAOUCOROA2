package com.example.caraoucoroa

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaResultado : AppCompatActivity() {

    lateinit var imagemResultado: ImageView
    lateinit var botaoVoltar: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imagemResultado = findViewById(R.id.imagemResultado)
        botaoVoltar = findViewById(R.id.botaoVoltar)

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if(numero == 0){
            imagemResultado.setImageResource(R.drawable.moeda_cara)

        }else{

            imagemResultado.setImageResource(R.drawable.moeda_coroa)

        }

        botaoVoltar.setOnClickListener {
            finish()
        }


    }
}