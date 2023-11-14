package com.example.atividade_nomes12100161

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atividade_nomes12100161.dadosremotos.RespostaNome
import com.example.atividade_nomes12100161.dadosremotos.retrofitService
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var btnPesquisar: Button
    lateinit var editTextNome: EditText
    lateinit var RecyclerViewFrequencia: RecyclerView

    lateinit var frequenciaAdapter: FrequenciaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPesquisar = findViewById(R.id.btnPesquisar)
        editTextNome = findViewById(R.id.editTextNome)
        RecyclerViewFrequencia = findViewById(R.id.RecyclerViewFrequencia)

        frequenciaAdapter = FrequenciaAdapter ()
        RecyclerViewFrequencia.adapter = frequenciaAdapter
        RecyclerViewFrequencia.layoutManager = LinearLayoutManager(this)

        btnPesquisar.setOnClickListener {
            var NomeDigitado: String = editTextNome.text.toString()

                                                            //clicar no object e dar alt + enter e vai aparecer esses trem verde
            retrofitService.getFrequenciaNomePorDecada(NomeDigitado).enqueue(object  : retrofit2.Callback<List<RespostaNome>> {
                override fun onResponse(
                    call: Call<List<RespostaNome>>,
                    response: Response<List<RespostaNome>>
                ) {
                    if (response.isSuccessful) {
                        frequenciaAdapter.setNovaFrequencias(response.body()!![0].res)
                    }
                }

                override fun onFailure(call: Call<List<RespostaNome>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Sem internet", Toast.LENGTH_SHORT).show()
                }


            })
            }
        }



    }
