package com.example.ui_e_commerce_jetpack.presentation.graphs.detail_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.ui_e_commerce_jetpack.common.Constrains
import com.example.ui_e_commerce_jetpack.presentation.graphs.Graph
import com.example.ui_e_commerce_jetpack.presentation.screens.cart_screen.component.CartScreen
import com.example.ui_e_commerce_jetpack.presentation.screens.notification_screen.component.NotificationScreen
import com.example.ui_e_commerce_jetpack.presentation.screens.product_detail_screen.component.ProductDetailScreen


fun NavGraphBuilder.detailNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailScreen.ProductDetailScreen.route + "/{${Constrains.PRODUCT_ID_PARAM}}"
    ) {
        composable(DetailScreen.CartScreen.route) {
            CartScreen()
        }
        composable(DetailScreen.NotificationScreen.route) {
            NotificationScreen()
        }
        composable(DetailScreen.ProductDetailScreen.route + "/{productId}") {
            ProductDetailScreen() {
                navController.popBackStack()
            }
        }
    }
}