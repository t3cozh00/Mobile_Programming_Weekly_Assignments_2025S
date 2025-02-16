package com.example.topbar.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.topbar.ui.topbars.MainTopBar

@Composable
fun MainScreen(navController: NavController){
    Scaffold(
        topBar = { MainTopBar("Myapp", navController) },
    ){ innerPadding ->
        Text(text = "Home Screen", modifier = Modifier.padding(innerPadding))
    }
}