package com.example.pruebamycity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pruebamycity.data.DataLugar
import com.example.pruebamycity.models.Lugar

@Composable
fun LugarScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        LazyColumn (
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp, end = 16.dp),
        ){
            items(DataLugar.getLugares()) {
                Elemento(
                    navController = navController,
                    lugar = it,
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
    lugar: Lugar,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        onClick= {navController.navigate("Recomendacion_Screen/${lugar.nombreLugar}")}
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
                    .size(60.dp)
                    .padding(end = 9.dp),
                painter = painterResource(lugar.image),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                text= lugar.nombreLugar.displayName
            )
        }
    }
}


