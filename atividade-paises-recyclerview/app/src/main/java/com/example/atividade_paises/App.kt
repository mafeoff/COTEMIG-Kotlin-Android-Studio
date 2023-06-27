package com.example.atividade_paises

import android.app.Application

class App: Application() {

    companion object {
        var country: List<Pais> = listOf(
            Pais(R.drawable.brazil,"Brazil", false),
            Pais(R.drawable.argentina,"Argentina",false),
            Pais(R.drawable.unitedstates,"Estados Unidos",false),
        )

        val favoriteCountry get() = country.filter { it.curt }
    }
}