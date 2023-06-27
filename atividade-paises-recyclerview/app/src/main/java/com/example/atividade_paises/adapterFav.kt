package com.example.atividade_paises

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class adapterFav(val change : (banda: Int, nome:String) -> Unit) : RecyclerView.Adapter<PaisHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaisHolder {
        var view: View =LayoutInflater.from(parent.context).inflate(R.layout.lista,parent,false)
        return PaisHolder(view)
    }

    override fun getItemCount(): Int {
        return App.favoriteCountry.size
    }

    override fun onBindViewHolder(holder: PaisHolder, position: Int) {
        holder.countryFlag.setImageResource(App.favoriteCountry[position].flag)
        holder.countryName.text = App.favoriteCountry[position].name
        holder.heart.setImageResource(R.drawable.coracao1)

        if (App.favoriteCountry[position].curt){
            holder.heart.setImageResource(R.drawable.coracao2)
        } else {
            holder.heart.setImageResource(R.drawable.coracao1)
        }

        holder.heart.setOnClickListener{
            if (!App.favoriteCountry[position].curt){
                holder.heart.setImageResource(R.drawable.coracao2)
                App.favoriteCountry[position].curt = true
            } else {
                holder.heart.setImageResource(R.drawable.coracao1)
                App.favoriteCountry[position].curt = false
            }
        }

        holder.itemView.setOnClickListener{
            change.invoke(App.favoriteCountry[position].flag,App.favoriteCountry[position].name)
        }
    }

}