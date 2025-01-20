package com.example.ui_e_commerce_jetpack.presentation.screens.home_screen.component

import android.annotation.SuppressLint
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ui_e_commerce_jetpack.presentation.graphs.detail_graph.DetailScreen
import com.example.ui_e_commerce_jetpack.presentation.graphs.home_graph.HomeNavGraph


@SuppressLint("RememberReturnType")
@Composable
fun HomeScreen(
    navController: NavHostController = rememberNavController(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    boxScrollState: ScrollState = rememberScrollState(),
) {

    //topBar visibility state
    val topBarVisibilityState = remember {
        mutableStateOf(true)
    }


    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(
                navController = navController,
                isVisible = topBarVisibilityState.value,
                searchCharSequence = {

                },
                onCartIconClick = {
                    navController.navigate(DetailScreen.CartScreen.route)
                },
                onNotificationIconClick = {
                    navController.navigate(DetailScreen.NotificationScreen.route)
                })
        },
        bottomBar = {
            NavigationBar(navController = navController) { isVisible ->
                topBarVisibilityState.value = isVisible
            }
        }

    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(boxScrollState)
        ) {
            HomeNavGraph(navHostController = navController)
        }
    }
}