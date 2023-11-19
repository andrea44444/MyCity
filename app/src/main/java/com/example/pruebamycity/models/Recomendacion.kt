package com.example.pruebamycity.models

import androidx.annotation.DrawableRes

data class Recomendacion (
    val nombreLugar: NombreLugar,
    @DrawableRes val image: Int,
    val nombreRecomendacion: String,
    val direccion : String,
    var descripcion : String
)