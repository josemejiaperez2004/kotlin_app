package com.example.prueba_2.screens
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox

import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prueba_2.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.AccountBox,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable{
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Primera Pantalla")
            }
        }
            ){
        BodyContent(navController)
    }
}
@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Pantalla Inicial")
        Button(onClick = {
             navController.navigate(route = AppScreens.SecondScreen.route)
        }){
            Text(text = "Ir segunda pantalla")
            }
        Button(onClick = {
            navController.navigate(route = AppScreens.ThirdScreen.route)
        }){
            Text(text = "Ir Tercera pantalla")
        }

      }
}


