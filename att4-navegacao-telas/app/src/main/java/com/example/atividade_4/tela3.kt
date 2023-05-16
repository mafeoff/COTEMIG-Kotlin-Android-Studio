package com.example.atividade_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class tela3 : AppCompatActivity() {

    lateinit var inp: EditText;
    lateinit var btn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        inp = findViewById(R.id.editTextTextPersonName3)
        btn = findViewById(R.id.button3)


        btn.setOnClickListener {
            var cidade:String = inp.text.toString();
            if (cidade.isNotBlank()) {
                var intentvar: Intent = Intent(this, tela4::class.java)
                intentvar.putExtra("cidade", cidade)
                intentvar.putExtra("ano", intent.getIntExtra("ano", 0))
                intentvar.putExtra("name", intent.getStringExtra("name"))
                startActivity(intentvar)
            } else {inp.error = "Preencha o campo com uma cidade válida"}
        }
    }
}