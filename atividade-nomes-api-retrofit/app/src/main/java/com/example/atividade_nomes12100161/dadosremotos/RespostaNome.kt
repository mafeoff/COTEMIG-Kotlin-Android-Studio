package com.example.atividade_nomes12100161.dadosremotos

import com.google.gson.annotations.SerializedName


//Apaga as chaves {} e susbtitui por parenteses ()

class RespostaNome (

        @SerializedName("nome") var nome: String,
        @SerializedName("res") var res: List<Frequencia>

    )

class Frequencia(

        @SerializedName("periodo") var periodo: String,
        @SerializedName("frequencia") var frequencia: String
)