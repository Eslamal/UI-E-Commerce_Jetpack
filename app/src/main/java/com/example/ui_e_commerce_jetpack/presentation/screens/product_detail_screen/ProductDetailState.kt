package com.example.ui_e_commerce_jetpack.presentation.screens.product_detail_screen

import com.example.ui_e_commerce_jetpack.domain.model.ProductModel


data class ProductDetailState(
    val isLoading: Boolean = false,
    val productDetail: ProductModel? = null,
    val errorMessage: String = ""
)