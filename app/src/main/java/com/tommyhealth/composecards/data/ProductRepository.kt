package com.tommyhealth.composecards.data

import com.tommyhealth.composecards.domain.ProductItem

interface ProductRepository {
    fun getProducts(): List<ProductItem>
}