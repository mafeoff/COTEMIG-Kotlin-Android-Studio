package com.example.provaa999999

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonagemAdapter(var cliqueLista: (Personagem) -> Unit) : RecyclerView.Adapter<ViewHolderPersonagem>() {

    class Personagem(
        var nome: String,
        var ultimaLocalizacao: String,
        var vivo: Boolean,
        var raca: String,
        var primeiraAparicao: String,
        var imagem: Int
    )

    var personagems: List<Personagem> = listOf(
        Personagem("Birdperson", "Planet Squanch", true, "Alien", "Ricksy Business", R.drawable.birdperson),
        Personagem("Glen", "Interdimensional Cable", true, "Human", "Ricksy Minutes", R.drawable.glenn),
        Personagem("Million Ants", "Worldender's lair", false, "Animal", "Vindicators 3: The return of Worldender", R.drawable.millionants),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPersonagem {
        var view: View =

            LayoutInflater.from(parent.context).inflate(R.layout.item_personagem, parent, false)

        return ViewHolderPersonagem(view)
    }

    override fun getItemCount(): Int {
        return personagems.size
    }

    override fun onBindViewHolder(holder: ViewHolderPersonagem, position: Int) {
        holder.imageViewAvatar.setImageResource(personagems[position].imagem)
        holder.textViewNome.text = personagems[position].nome
        holder.textViewPrimeiraAparicao.text = personagems[position].primeiraAparicao
        holder.textViewUltimaLocalizacao.text = personagems[position].ultimaLocalizacao
        holder.textViewRaca.text = personagems[position].raca

        if (personagems[position].vivo) {
            holder.textViewVivo.text = "Vivo"
        } else {
            holder.textViewVivo.text = "Morto"
        }
        holder.itemView.setOnClickListener {
            cliqueLista.invoke(personagems[position])
        }
    }
}
