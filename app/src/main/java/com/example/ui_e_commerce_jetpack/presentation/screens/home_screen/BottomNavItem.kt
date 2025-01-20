package com.example.ui_e_commerce_jetpack.presentation.screens.home_screen

import com.example.ui_e_commerce_jetpack.R
import com.example.ui_e_commerce_jetpack.presentation.graphs.home_graph.ShopHomeScreen

sealed class BottomNavItem(val tittle: String, val icon: Int, val route: String) {
    object HomeNav : BottomNavItem(
        tittle = "Home",
        icon = R.drawable.shop_icon,
        route = ShopHomeScreen.DashboardScreen.route
    )

    object FavouriteNav : BottomNavItem(
        tittle = "Favourite",
        icon = R.drawable.heart_icon,
        route = ShopHomeScreen.FavouriteScreen.route
    )

    object ChatNav : BottomNavItem(
        tittle = "Chat",
        icon = R.drawable.chat_bubble_icon,
        route = ShopHomeScreen.ConversationScreen.route
    )

    object ProfileNav : BottomNavItem(
        tittle = "Profile",
        icon = R.drawable.user_icon,
        route = ShopHomeScreen.ProfileScreen.route
    )
}
