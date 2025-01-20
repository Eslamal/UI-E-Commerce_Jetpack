package com.example.ui_e_commerce_jetpack.presentation.graphs.root_graph

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ui_e_commerce_jetpack.presentation.graphs.Graph
import com.example.ui_e_commerce_jetpack.presentation.graphs.auth_graph.authNavGraph

import com.example.ui_e_commerce_jetpack.presentation.screens.home_screen.component.HomeScreen


@Composable
fun RootNavigationGraph(navHostController: NavHostController, context: Context) {
    NavHost(
        navController = navHostController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION,
    ) {
        authNavGraph(navHostController, context)
        composable(route = Graph.HOME) {
            HomeScreen()
        }


    }
}