package com.example.atividade_nomes12100161.dadosremotos

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val URL_BASE = "https://servicodados.ibge.gov.br/api/v2/censos/nomes/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(URL_BASE)
    .build()

val retrofitService : NomesApiService by lazy {
    retrofit.create(NomesApiService::class.java)
}