package com.example.pruebamycity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pruebamycity.data.DataRecomendacion
import com.example.pruebamycity.models.Recomendacion

@Composable
fun RecomendacionScreen(navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val arguments = navBackStackEntry?.arguments
    val nombreLugar = arguments?.getString("nombreLugar")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn (
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp, end = 16.dp),
        ){
            items(DataRecomendacion.getRecomendaciones().filter { it.nombreLugar.toString()== nombreLugar }) {
                Elemento(
                    navController = navController,
                    recomendacion = it,
                    modifier = Modifier.padding(vertical = 20.dp),
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Elemento(
    navController: NavHostController,
    recomendacion: Recomendacion,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        onClick= {navController.navigate("Details_Screen/${recomendacion.nombreRecomendacion}")}
    ){
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                modifier = modifier
                    .size(100.dp)
                    .padding(end = 9.dp),
                painter = painterResource(recomendacion.image),
                contentDescription = null
            )
            Column {
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
}