package com.example.pruebamycity.data

import com.example.pruebamycity.R
import com.example.pruebamycity.models.NombreLugar
import com.example.pruebamycity.models.Recomendacion


object DataRecomendacion {
    fun getRecomendaciones(): List<Recomendacion> {
        return listOf(
            Recomendacion(
                nombreLugar = NombreLugar.Bibliotecas,
                image = R.drawable.biblioteca1,
                nombreRecomendacion = "Biblioteca1",
                direccion = "C/San Alfa II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Bibliotecas,
                image = R.drawable.biblioteca2,
                nombreRecomendacion = "Biblioteca2",
                direccion = "C/San Delta II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Bibliotecas,
                image = R.drawable.biblioteca3,
                nombreRecomendacion = "Biblioteca3",
                direccion = "C/San Teodoro II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Bibliotecas,
                image = R.drawable.biblioteca4,
                nombreRecomendacion = "Biblioteca4",
                direccion = "C/San Miguel II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Restaurantes,
                image = R.drawable.restaurante1,
                nombreRecomendacion = "Restaurante1",
                direccion = "C/San Mateo II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Restaurantes,
                image = R.drawable.restaurante2,
                nombreRecomendacion = "Restaurante2",
                direccion = "C/San Julian II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Restaurantes,
                image = R.drawable.restaurante3,
                nombreRecomendacion = "Restaurante3",
                direccion = "C/San Antonio II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Restaurantes,
                image = R.drawable.restaurante4,
                nombreRecomendacion = "Restaurante4",
                direccion = "C/San Orense II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Museos,
                image = R.drawable.museo1,
                nombreRecomendacion = "Museo1",
                direccion = "C/Santo Domingo II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Museos,
                image = R.drawable.museo2,
                nombreRecomendacion = "Museo2",
                direccion = "C/Gran Via II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Museos,
                image = R.drawable.museo3,
                nombreRecomendacion = "Museo3",
                direccion = "C/San Simon II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Museos,
                image = R.drawable.museo4,
                nombreRecomendacion = "Museo4",
                direccion = "C/San Roberto II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.CentrosComerciales,
                image = R.drawable.centrocomercial1,
                    nombreRecomendacion = "Centro Comercial1",
                direccion = "C/Santa Luisa II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.CentrosComerciales,
                image = R.drawable.centrocomercial2,
                nombreRecomendacion = "Centro Comercial2",
                direccion = "C/San Alberto II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.CentrosComerciales,
                image = R.drawable.centrocomercial3,
                nombreRecomendacion = "Centro Comercial3",
                direccion = "C/San César II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.CentrosComerciales,
                image = R.drawable.centrocomercial4,
                nombreRecomendacion = "Centro Comercial4",
                direccion = "C/San Andrea II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Parques,
                image = R.drawable.parque1,
                nombreRecomendacion = "Parque1",
                direccion = "C/San Juan II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Parques,
                image = R.drawable.parque2,
                nombreRecomendacion = "Parque2",
                direccion = "C/San Pablo II",
                descripcion = R.string.dParque2
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Parques,
                image = R.drawable.parque3,
                nombreRecomendacion = "Parque3",
                direccion = "C/San Fernando II",
                descripcion = R.string.dParque1
            ),
            Recomendacion(
                nombreLugar = NombreLugar.Parques,
                image = R.drawable.parque4,
                nombreRecomendacion = "Parque4",
                direccion = "C/San Sol II",
                descripcion = R.string.dParque2
            ),
        )
    }
}