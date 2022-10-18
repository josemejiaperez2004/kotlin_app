package com.example.prueba_2.navigation

sealed class AppScreens (val route: String){
        object FirstScreen: AppScreens(route = "firstScreen")
        object SecondScreen: AppScreens(route = "SecondScreen")
        object ThirdScreen: AppScreens(route = "thirdScreen")
}