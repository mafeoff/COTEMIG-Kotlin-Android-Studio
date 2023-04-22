package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // declara variavel

    lateinit var editTextNome: EditText

    lateinit var editTextNascimento: EditText

    lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        editTextNome = findViewById(R.id.editTextNome)
        editTextNascimento = findViewById(R.id.editTextNascimento)
        btnCalcular = findViewById(R.id.btnCalcular)



        //erros
        if (editTextNome.text.toString() == "") {
            editTextNome.error = "Digite o nome"
        }

        //erros
        if (editTextNascimento.text.toString() == "") {
            editTextNascimento.error = "Digite o ano"
        }

        btnCalcular.setOnClickListener {

            //tem que declarar aas variaveis dentro do onClick

            var nome : String = editTextNome.text.toString()
            var ano : Int? = editTextNascimento.text.toString().toIntOrNull()

            if (ano != null) {

                var idade = 2023 - ano
                var mensagem = "Seu nome é $nome e você tem $idade anos."
                Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
            } else {
                editTextNascimento.error = "Ano de nascimento inválido."
            }

        }

    }
}
