package com.example.wishlistapp

import com.example.wishlistapp.data.Wish

sealed class Screen(val route:String){
    object HomeScreen: Screen("home_screen")
    object AddScreen: Screen("add_screen")
}