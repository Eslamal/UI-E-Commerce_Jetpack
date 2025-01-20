package com.example.ui_e_commerce_jetpack.domain.use_case.get_product

import com.example.ui_e_commerce_jetpack.common.Resource
import com.example.ui_e_commerce_jetpack.domain.model.ProductModel
import com.example.ui_e_commerce_jetpack.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(): Flow<Resource<List<ProductModel>>> = flow {
        try {
            emit(Resource.Loading())
            val products = repository.getProduct()?.map { it }
            emit(Resource.Success(data = products))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}