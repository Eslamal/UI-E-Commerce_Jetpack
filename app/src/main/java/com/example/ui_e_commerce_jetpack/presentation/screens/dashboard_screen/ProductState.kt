package com.example.ui_e_commerce_jetpack.presentation.screens.dashboard_screen

import com.example.ui_e_commerce_jetpack.domain.model.ProductModel


data class ProductState(
    val isLoading: Boolean = false,
    val product: List<ProductModel>? = null,
    val errorMessage: String = ""
)
