package com.example.atividade_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class tela2 : AppCompatActivity() {

    lateinit var inp: EditText;
    lateinit var btn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        inp = findViewById(R.id.editTextTextPersonName2)
        btn = findViewById(R.id.button2)


        btn.setOnClickListener {
            var ano: Int? = inp.text.toString().toIntOrNull();
            if (ano!=null) {
                var intentvar: Intent = Intent(this, tela3::class.java)
                intentvar.putExtra("ano", ano)
                intentvar.putExtra("name", intent.getStringExtra("name"))
                startActivity(intentvar)
            } else {inp.error = "Preencha o campo com um ano válido"}
        }
    }
}