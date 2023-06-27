package com.example.atividade_paises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ActivityPais : AppCompatActivity() {

    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pais)

        image = findViewById(R.id.imagePaisLegal)
        title = intent.getStringExtra("name")
        image.setImageResource(intent.getIntExtra("flag",0))
    }
}