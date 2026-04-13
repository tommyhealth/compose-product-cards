package com.tommyhealth.composecards.presentation

import com.tommyhealth.composecards.R
import com.tommyhealth.composecards.domain.AvailabilityBlock
import com.tommyhealth.composecards.domain.Pricing
import com.tommyhealth.composecards.domain.ProductItem
import com.tommyhealth.composecards.domain.Rating
import com.tommyhealth.composecards.domain.ReliabilityLevel
import kotlinx.collections.immutable.toImmutableList

fun ProductItem.toUi(): ProductUi = ProductUi(
    id = id,
    image = image,
    title = title,
    rating = rating.toUi(),
    reliability = reliability.toUi(),
    bestsellerBadge = if (isBestseller) R.string.product_badge_bestseller else null,
    isFavorite = isFavorite,
    isCompared = false,
    price = price.toUi(),
    availabilityBlocks = availabilityBlock.map { it.toUi() }.toImmutableList(),
    isAvailable = isAvailable,
)

private fun Rating.toUi(): RatingUi = RatingUi(
    score = score,
    reviewCount = reviewCount,
)


private fun ReliabilityLevel.toUi(): ReliabilityUi = when (this) {
    ReliabilityLevel.EXCELLENT -> ReliabilityUi.EXCELLENT
    ReliabilityLevel.GOOD -> ReliabilityUi.GOOD
    ReliabilityLevel.AVERAGE -> ReliabilityUi.AVERAGE
    ReliabilityLevel.POOR -> ReliabilityUi.POOR
}

private fun Pricing.toUi(): PriceUi = PriceUi(
    current = current,
    old = old,
    installment = installment,
)

private fun AvailabilityBlock.toUi(): AvailabilityBlockUi = AvailabilityBlockUi(
    title = title,
    subtitle = subtitle,
)
