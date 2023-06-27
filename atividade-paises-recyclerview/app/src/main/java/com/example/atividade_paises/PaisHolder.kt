package com.example.atividade_paises

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PaisHolder(view: View) : RecyclerView.ViewHolder(view) {
    var countryName : TextView = view.findViewById(R.id.nomePais)
    var countryFlag : ImageView = view.findViewById(R.id.imagePais)
    var heart : ImageView = view.findViewById(R.id.imageCurtido)
}