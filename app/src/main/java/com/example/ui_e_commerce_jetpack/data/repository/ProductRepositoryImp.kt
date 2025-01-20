package com.example.ui_e_commerce_jetpack.data.repository


import com.example.ui_e_commerce_jetpack.data.demo_db.DemoDB
import com.example.ui_e_commerce_jetpack.domain.model.ProductModel
import com.example.ui_e_commerce_jetpack.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val demoDB: DemoDB
) : ProductRepository {
    override suspend fun getProduct(): List<ProductModel> {
        return demoDB.getProduct()
    }

    override suspend fun getProductDetail(id: Int): ProductModel {
        return demoDB.getProduct()[id-1]
    }
}