package com.example.pruebamycity.models


import androidx.annotation.DrawableRes

enum class NombreLugar(val displayName: String) {
    Restaurantes("Restaurantes"),
    Parques("Parques"),
    CentrosComerciales("Centros Comerciales"),
    Museos("Museos"),
    Bibliotecas("Bibliotecas")
}
data class Lugar(
    val nombreLugar: NombreLugar,
    @DrawableRes val image: Int,
)