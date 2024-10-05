package com.example.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var botaoJogar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        botaoJogar = findViewById(R.id.botaoJogar)

        botaoJogar.setOnClickListener {

        val intent = Intent(applicationContext, TelaResultado::class.java)

        //sorteio entre 0 e 1
            val numero = Random.nextInt(2)


        intent.putExtra("numero", numero )

        startActivity(intent)


        }

    }
}