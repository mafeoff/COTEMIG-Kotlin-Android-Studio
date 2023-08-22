package com.example.mariafernandaferreirabraga12100161

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderPersonagem(view: View) : ViewHolder(view){

var Personagem : ImageView = view.findViewById(R.id.imgPersonagem)
var nome : TextView = view.findViewById(R.id.textoNome)
var Local : TextView = view.findViewById(R.id.textoLocal)
var Aparicao : TextView = view.findViewById(R.id.textoAparicao)}
