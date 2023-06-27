package com.example.atividade_paises

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class favoritos : AppCompatActivity() {

    lateinit var rec: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rec = findViewById(R.id.recy)
        rec.layoutManager = LinearLayoutManager(this)
        rec.adapter = adapterFav(::change)
    }

    fun change(flag: Int,name: String){
        var intentvar: Intent = Intent(this,ActivityPais::class.java)
        intentvar.putExtra("flag", flag)
        intentvar.putExtra("name", name)
        startActivity(intentvar)
    }
}