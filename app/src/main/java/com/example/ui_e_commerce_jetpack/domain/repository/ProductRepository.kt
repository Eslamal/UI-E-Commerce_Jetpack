package com.example.ui_e_commerce_jetpack.domain.repository

import com.example.ui_e_commerce_jetpack.domain.model.ProductModel

interface ProductRepository {
    suspend fun getProduct(): List<ProductModel>? = null
    suspend fun getProductDetail(id: Int): ProductModel? = null
}