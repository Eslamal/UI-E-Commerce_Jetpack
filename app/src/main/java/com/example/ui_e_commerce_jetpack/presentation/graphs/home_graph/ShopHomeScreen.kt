package com.example.ui_e_commerce_jetpack.presentation.graphs.home_graph

sealed class ShopHomeScreen(val route: String) {
    object DashboardScreen : ShopHomeScreen("dashboard_screen")
    object ConversationScreen : ShopHomeScreen("conversation_screen")
    object ProfileScreen : ShopHomeScreen("profile_screen")
    object FavouriteScreen : ShopHomeScreen("favourite_screen")
}
