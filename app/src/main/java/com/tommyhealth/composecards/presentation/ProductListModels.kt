package com.tommyhealth.composecards.presentation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class ProductListUiState(
    val products: ImmutableList<ProductUi> = persistentListOf(),
    val displayMode: DisplayMode = DisplayMode.LIST,
)

data class ProductUi(
    val id: String,
    val imageUrl: String,
    val title: String,
    val rating: RatingUi,
    val reliability: ReliabilityUi,
    val badge: BadgeUi?,
    val isFavorite: Boolean,
    val isCompared: Boolean,
    val price: PriceUi,
    val availabilityBlocks: ImmutableList<AvailabilityBlockUi>,
    val isAvailable: Boolean,
)

data class RatingUi(
    val score: Float,
    val reviewCount: String,
)

data class PriceUi(
    val price: String,
    val oldPrice: String?,
    val installment: String?,
)

data class AvailabilityBlockUi(
    val title: String,
    val subtitle: String,
)

data class ReliabilityUi(
    val title: String,
    @DrawableRes val iconRes: Int,
    val iconTint: Color,
)

data class BadgeUi(
    val title: String,
    val color: Color,
)

enum class DisplayMode {
    LIST,
    GRID
}