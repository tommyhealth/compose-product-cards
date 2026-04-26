package com.tommyhealth.composecards.presentation.compose

import android.content.res.Configuration
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.presentation.ProductUi
import com.tommyhealth.composecards.presentation.products
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun ProductCard(
    product: ProductUi,
    onCompareChange: () -> Unit,
    onRatingClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 12.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            ProductHeader(
                imageUrl = product.imageUrl,
                title = product.title,
                badges = product.badges,
            )
            Spacer(Modifier.height(12.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier.horizontalScroll(rememberScrollState())
            ) {
                CompareCheckbox(
                    checked = product.isCompared,
                    onCheckedChange = onCompareChange,
                )
                if (product.rating != null) {
                    RatingChip(
                        rating = product.rating,
                        onClick = onRatingClick,
                    )
                }
                if (product.reliability != null) {
                    ReliabilityChip(
                        reliability = product.reliability,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ProductCardPreview() {
    ComposeProductCardsTheme {
        ProductCard(
            product = products[0],
            onCompareChange = {},
            onRatingClick = {},
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ProductCardDarkPreview() {
    ComposeProductCardsTheme {
        ProductCard(
            product = products[1],
            onCompareChange = {},
            onRatingClick = {},
        )
    }
}