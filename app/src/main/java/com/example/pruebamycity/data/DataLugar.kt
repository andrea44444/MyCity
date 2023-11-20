package com.example.pruebamycity.data

import com.example.pruebamycity.R
import com.example.pruebamycity.models.Lugar
import com.example.pruebamycity.models.NombreLugar

object DataLugar {
    fun getLugares(): List<Lugar> {
        return listOf(
            Lugar(
                nombreLugar = NombreLugar.Bibliotecas,
                image = R.drawable.biblioteca,
            ),
            Lugar(
                nombreLugar = NombreLugar.CentrosComerciales,
                image = R.drawable.centrocomercial,
            ),
            Lugar(
                nombreLugar = NombreLugar.Museos,
                image = R.drawable.museo,
            ),
            Lugar(
                nombreLugar = NombreLugar.Parques,
                image = R.drawable.parque,
            ),
            Lugar(
                nombreLugar = NombreLugar.Restaurantes,
                image = R.drawable.restaurante,
            )
        )
    }
}