package com.example.topbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.topbar.ui.screens.InfoScreen
import com.example.topbar.ui.screens.MainScreen
import com.example.topbar.ui.screens.SettingScreen
import com.example.topbar.ui.theme.TopBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopBarTheme {
                ScaffoldApp()
            }
        }
    }
}

@Composable
fun ScaffoldApp(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ){
        composable(route ="home") { MainScreen(navController)}
        composable(route ="info") { InfoScreen(navController) }
        composable(route ="settings") { SettingScreen(navController)}

    }
}