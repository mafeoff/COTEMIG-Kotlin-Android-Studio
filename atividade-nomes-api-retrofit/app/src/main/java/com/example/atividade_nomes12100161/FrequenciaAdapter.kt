package com.example.atividade_nomes12100161

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atividade_nomes12100161.dadosremotos.Frequencia

class FrequenciaAdapter : RecyclerView.Adapter<ItemFrequenciaViewHolder>() {

    var frequencias : List<Frequencia> = listOf()

    fun setNovaFrequencias(novasFrequencias: List<Frequencia>){

        frequencias = novasFrequencias
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemFrequenciaViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_frequencia,parent, false)
        return ItemFrequenciaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  frequencias.size
    }

    override fun onBindViewHolder(holder: ItemFrequenciaViewHolder, position: Int) {
        holder.txtFrequencia.text = frequencias[position].frequencia
        holder.txtPeriodo.text = frequencias[position].periodo
    }
}