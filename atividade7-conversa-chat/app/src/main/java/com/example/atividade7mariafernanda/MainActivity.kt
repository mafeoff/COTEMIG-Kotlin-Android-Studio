package com.example.atividade7mariafernanda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

data class Conversa(
    val autor: String,
    val ultimaConversa: String,
    val imagemAutor: Int,
    val horaConversa: String
)
