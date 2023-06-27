package com.example.atividade_paises

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class Pais (
    var flag: Int,
    var name: String,
    var curt: Boolean
)

class adapterPais(val change : (flag: Int, name:String) -> Unit) : RecyclerView.Adapter<PaisHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaisHolder {
        var view: View =LayoutInflater.from(parent.context).inflate(R.layout.lista,parent,false)
        return PaisHolder(view)
    }

    override fun getItemCount(): Int {
        return App.country.size
    }

    override fun onBindViewHolder(holder: PaisHolder, position: Int) {
        holder.countryFlag.setImageResource(App.country[position].flag)
        holder.countryName.text = App.country[position].name
        holder.heart.setImageResource(R.drawable.coracao1)

        if (App.country[position].curt){
            holder.heart.setImageResource(R.drawable.coracao2)
        } else {
            holder.heart.setImageResource(R.drawable.coracao1)
        }

        holder.heart.setOnClickListener{
            if (!App.country[position].curt){
                holder.heart.setImageResource(R.drawable.coracao2)
                App.country[position].curt = true
            } else {
                holder.heart.setImageResource(R.drawable.coracao1)
                App.country[position].curt = false
            }
        }

        holder.itemView.setOnClickListener{
            change.invoke(App.country[position].flag,App.country[position].name)
        }
    }

}