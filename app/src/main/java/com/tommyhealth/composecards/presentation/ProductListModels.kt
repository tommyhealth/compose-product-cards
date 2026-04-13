package com.tommyhealth.composecards.presentation

import androidx.annotation.StringRes
import com.tommyhealth.composecards.R

data class ProductListUiState(
    val products: List<ProductUi> = emptyList(),
    val displayMode: DisplayMode = DisplayMode.LIST,
)

data class ProductUi(
    val id: String,
    val image: String,
    val title: String,
    val rating: RatingUi,
    val reliability: ReliabilityUi,
    @StringRes val bestsellerBadge: Int?,
    val isFavorite: Boolean,
    val isCompared: Boolean,
    val price: PriceUi,
    val availabilityBlocks: List<AvailabilityBlockUi>,
    val isAvailable: Boolean,
)

data class RatingUi(
    val score: Float,
    val reviewCount: String,
)

data class PriceUi(
    val current: String,
    val old: String?,
    val installment: String?,
)

data class AvailabilityBlockUi(
    val title: String,
    val subtitle: String,
)

enum class ReliabilityUi(@StringRes val text: Int) {
    EXCELLENT(R.string.reliability_excellent),
    GOOD(R.string.reliability_good),
    AVERAGE(R.string.reliability_average),
    POOR(R.string.reliability_poor),
}

enum class DisplayMode {
    LIST,
    GRID
}