package com.example.atividade_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class tela4 : AppCompatActivity() {

    lateinit var nome:TextView;
    lateinit var ano:TextView;
    lateinit var cidade:TextView;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        nome = findViewById(R.id.nomeUsuario);
        ano = findViewById(R.id.anoUsuario);
        cidade = findViewById(R.id.cidadeUsuario);

        nome.text = intent.getStringExtra("name");
        ano.text = "Ano: " + intent.getIntExtra("ano", 0).toString();
        cidade.text = "Cidade: " + intent.getStringExtra("cidade");
    }
}
