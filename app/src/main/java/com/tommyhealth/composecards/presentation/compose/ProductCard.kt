package com.tommyhealth.composecards.presentation.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.presentation.PriceUi
import com.tommyhealth.composecards.presentation.ProductUi
import com.tommyhealth.composecards.presentation.RatingUi
import com.tommyhealth.composecards.presentation.ReliabilityUi
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme
import kotlinx.collections.immutable.persistentListOf

@Composable
fun ProductCard(
    product: ProductUi,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 12.dp)
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        ProductHeader(
            title = product.title,
            image = product.image
        )
    }
}

@Preview
@Composable
private fun ProductCardPreview() {
    ComposeProductCardsTheme(darkTheme = false) {
        ProductCard(
            product = ProductUi(
                id = "1",
                image = "g",
                title = "6.67\" Смартфон Xiaomi Redmi Note 14 128 ГБ черный",
                rating = RatingUi(score = 4.5f, reviewCount = "3.2k"),
                reliability = ReliabilityUi.EXCELLENT,
                bestsellerBadge = null,
                isFavorite = false,
                isCompared = false,
                price = PriceUi(
                    current = "12 799 ₽",
                    old = null,
                    installment = "от 1 248 ₽/мес.",
                ),
                availabilityBlocks = persistentListOf(),
                isAvailable = true,
            )
        )
    }
}