package com.example.ui_e_commerce_jetpack.presentation.graphs.detail_graph

sealed class DetailScreen( val route: String) {
    object CartScreen : DetailScreen("cart_screen")
    object NotificationScreen : DetailScreen("notification_screen")
    object ProductDetailScreen : DetailScreen("product_detail_screen")
}