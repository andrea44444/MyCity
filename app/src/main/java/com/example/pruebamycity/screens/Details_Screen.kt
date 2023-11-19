package com.example.pruebamycity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pruebamycity.data.DataRecomendacion

@Composable
fun Details_Screen(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val arguments = navBackStackEntry?.arguments
    val nombreRecomendacion = arguments?.getString("nombreRecomendacion")
    val recomendacion = DataRecomendacion.getRecomendaciones().find {
        it.nombreRecomendacion == nombreRecomendacion
    }?: DataRecomendacion.getRecomendaciones()[0]
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                modifier = Modifier

                    .padding(end = 9.dp),
                painter = painterResource(recomendacion.image),
                contentDescription = null
            )

            Text(
                fontSize = 20.sp,
                text= recomendacion.nombreRecomendacion
            )

            Text(
                text= recomendacion.direccion
            )
        }
    }
}