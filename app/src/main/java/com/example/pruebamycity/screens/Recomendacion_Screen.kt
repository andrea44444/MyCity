package com.example.pruebamycity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.example.pruebamycity.models.Recomendacion

@Composable
fun RecomendacionScreen(navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val arguments = navBackStackEntry?.arguments
    val nombreLugar = arguments?.getString("nombreLugar")
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(DataRecomendacion.getRecomendaciones().filter { it.nombreLugar.toString()== nombreLugar }) {
            Elemento(
                navController = navController,
                recomendacion = it,
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Elemento(
    navController: NavHostController,
    recomendacion: Recomendacion,
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        onClick = { navController.navigate("Details_Screen/${recomendacion.nombreRecomendacion}") }
    ){
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(end = 20.dp),
                painter = painterResource(recomendacion.image),
                contentDescription = recomendacion.nombreRecomendacion
            )
            Column {
                Text(
                    fontSize = 20.sp,
                    text = recomendacion.nombreRecomendacion
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = recomendacion.direccion
                )
            }
        }
    }
}