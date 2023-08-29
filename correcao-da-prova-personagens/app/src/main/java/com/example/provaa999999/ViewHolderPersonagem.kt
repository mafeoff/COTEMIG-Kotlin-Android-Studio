package com.example.provaa999999

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderPersonagem (view: View) : RecyclerView.ViewHolder(view) {
    var imageViewAvatar : ImageView = view.findViewById(R.id.imageViewAvatar)
    var textViewNome: TextView = view.findViewById(R.id.textViewNome)
    var textViewVivo: TextView = view.findViewById(R.id.textViewVivo)
    var textViewRaca: TextView = view.findViewById(R.id.textViewRaca)
    var textViewUltimaLocalizacao: TextView = view.findViewById(R.id.textViewUltimaLocalizacao)
    var textViewPrimeiraAparicao: TextView = view.findViewById(R.id.textViewPrimeiraAparicao)
}
