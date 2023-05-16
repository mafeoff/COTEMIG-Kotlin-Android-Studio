package com.example.atividade_4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var inp:EditText;
    lateinit var btn:Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inp = findViewById(R.id.editTextTextPersonName)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            var name:String = inp.text.toString();
            if (name.isNotBlank()) {
                var intentvar: Intent = Intent(this, tela2::class.java)
                intentvar.putExtra("name", name)
                startActivity(intentvar)
            } else {inp.error = "Preencha o campo com um nome válido"}
        }
    }
}