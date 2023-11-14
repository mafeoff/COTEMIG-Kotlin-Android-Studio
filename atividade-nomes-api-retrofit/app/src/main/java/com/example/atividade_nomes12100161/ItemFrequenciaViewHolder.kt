package com.example.atividade_nomes12100161

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemFrequenciaViewHolder(view : View): RecyclerView.ViewHolder(view) {

    var txtPeriodo: TextView =  view.findViewById(R.id.txtPeriodo)
    var txtFrequencia: TextView = view.findViewById(R.id.txtFrequencia)
}