package com.example.provaa999999

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewPersonagems: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializar as variaveis
        recyclerViewPersonagems = findViewById(R.id.recyclerViewPersonagems)

        // configurar adapter
        recyclerViewPersonagems.adapter = PersonagemAdapter(::aoClicarNaLista)
        recyclerViewPersonagems.layoutManager = LinearLayoutManager(this)
    }

    fun aoClicarNaLista(personagem: PersonagemAdapter.Personagem) {
        var intentNavegacao : Intent = Intent(this, DetalhesPersonagemActivity::class.java)

        intentNavegacao.putExtra("nome", personagem.nome)
        intentNavegacao.putExtra("ultimaLocalizacao", personagem.ultimaLocalizacao)
        intentNavegacao.putExtra("vivo", personagem.vivo)
        intentNavegacao.putExtra("raca", personagem.raca)
        intentNavegacao.putExtra("primeiraAparicao", personagem.primeiraAparicao)
        intentNavegacao.putExtra("imagem", personagem.imagem)

        startActivity(intentNavegacao)
    }
}