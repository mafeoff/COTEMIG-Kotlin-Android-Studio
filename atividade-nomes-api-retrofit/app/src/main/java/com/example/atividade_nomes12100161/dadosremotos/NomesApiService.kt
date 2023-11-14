package com.example.atividade_nomes12100161.dadosremotos

import retrofit2.http.GET
import retrofit2.http.Path

interface NomesApiService {

    //concatenar com a URL BASE com o que está dentro do método get

    @GET("{nome}")
    fun getFrequenciaNomePorDecada(@Path("nome") nome: String) : retrofit2.Call<List<RespostaNome>>
}