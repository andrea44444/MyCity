package com.example.pruebamycity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.pruebamycity.ui.theme.PruebaMyCityTheme
import androidx.navigation.compose.rememberNavController
import com.example.pruebamycity.screens.LugarScreen
import com.example.pruebamycity.screens.RecomendacionScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pruebamycity.data.NavRoutes
import com.example.pruebamycity.screens.Details_Screen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaMyCityTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainApp() {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    println(currentRoute)
    Scaffold(
        topBar = {
            when (currentRoute) {
                NavRoutes.MAIN_SCREEN -> {
                    TopAppBar(title = { Text(text = "My City") })
                }
                NavRoutes.SECOND_SCREEN -> {
                    TopAppBar(
                        title = { Text(text = "Lugares") },
                        navigationIcon = { BotonAtras(navController = navController)
                        }
                    )
                }
                NavRoutes.DETAILS_SCREEN -> {
                    TopAppBar(
                        title = { Text(text = "Recomendaciones") },
                        navigationIcon = { BotonAtras(navController = navController) }
                    )
                }
            }
        },
    ){ values ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(values),
        ){
            NavigationController(navController = navController)
        }
    }
}

@Composable
fun BotonAtras(navController: NavHostController){
    IconButton(onClick = { navController.navigateUp() }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back"
        )
    }
}

@Composable
fun NavigationController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavRoutes.MAIN_SCREEN) {
        composable(NavRoutes.MAIN_SCREEN) {
            LugarScreen(navController = navController)
        }
        composable(NavRoutes.SECOND_SCREEN) {
            RecomendacionScreen(navController = navController)
        }
        composable(NavRoutes.DETAILS_SCREEN) {
            Details_Screen(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaMyCityTheme {
        MainApp()
    }
}