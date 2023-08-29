package com.example.provaa999999

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalhesPersonagemActivity : AppCompatActivity() {

    lateinit var imageViewAvatar: ImageView
    lateinit var textViewNome: TextView
    lateinit var textViewVivo: TextView
    lateinit var textViewRaca: TextView
    lateinit var textViewUltimaLocalizacao: TextView
    lateinit var textViewPrimeiraAparicao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_personagem)

        // inicializar variaveis
        imageViewAvatar = findViewById(R.id.imageViewAvatar)
        textViewNome = findViewById(R.id.textViewNome)
        textViewVivo = findViewById(R.id.textViewVivo)
        textViewRaca = findViewById(R.id.textViewRaca)
        textViewUltimaLocalizacao = findViewById(R.id.textViewUltimaLocalizacao)
        textViewPrimeiraAparicao = findViewById(R.id.textViewPrimeiraAparicao)

        var nome: String? = intent.getStringExtra("nome")
        var ultimaLocalizacao: String?  = intent.getStringExtra("ultimaLocalizacao")
        var vivo: Boolean = intent.getBooleanExtra("vivo", false)
        var primeiraAparicao: String? = intent.getStringExtra("primeiraAparicao")
        var raca: String? = intent.getStringExtra("raca")
        var imagem: Int = intent.getIntExtra("imagem", 0)

        imageViewAvatar.setImageResource(imagem)
        textViewNome.text =nome
        textViewPrimeiraAparicao.text = primeiraAparicao
        textViewUltimaLocalizacao.text = ultimaLocalizacao
        textViewRaca.text =raca

        if (vivo) {
            textViewVivo.text = "Vivo"
        } else {
            textViewVivo.text = "Morto"
        }
    }
}