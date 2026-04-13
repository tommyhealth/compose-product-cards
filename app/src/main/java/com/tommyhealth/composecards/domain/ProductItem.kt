package com.tommyhealth.composecards.domain

data class ProductItem(
    val id: String,
    val image: String,
    val title: String,
    val rating: Rating,
    val reliability: ReliabilityLevel,
    val isBestseller: Boolean,
    val isFavorite: Boolean,
    val price: Pricing,
    val isAvailable: Boolean,
    val availabilityBlock: List<AvailabilityBlock>,
)

data class Rating(
    val score: Float,
    val reviewCount: String,
)

enum class ReliabilityLevel {
    EXCELLENT,
    GOOD,
    AVERAGE,
    POOR,
}

data class Pricing(
    val current: String,
    val old: String? = null,
    val installment: String? = null,
)

data class AvailabilityBlock(
    val title: String,
    val subtitle: String,
)
