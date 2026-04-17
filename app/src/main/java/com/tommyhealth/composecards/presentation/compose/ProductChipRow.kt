package com.tommyhealth.composecards.presentation.compose

import android.content.res.Configuration
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.presentation.RatingUi
import com.tommyhealth.composecards.presentation.ReliabilityUi
import com.tommyhealth.composecards.presentation.products
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun ProductChipRow(
    isCompared: Boolean,
    rating: RatingUi,
    reliability: ReliabilityUi,
    onCheckedChange: () -> Unit,
    onRatingClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.horizontalScroll(rememberScrollState())
    ) {
        CompareCheckbox(
            checked = isCompared,
            onCheckedChange = onCheckedChange,
        )
        Spacer(Modifier.width(8.dp))
        RatingChip(
            rating = rating.score,
            reviewCount = rating.reviewCount,
            onClick = onRatingClick,
        )
        Spacer(Modifier.width(8.dp))
        ReliabilityChip(
            title = reliability.title,
            icon = reliability.iconRes,
            tint = reliability.iconTint,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductChipRowPreview() {
    ComposeProductCardsTheme {
        val product = products[0]
        ProductChipRow(
            isCompared = product.isCompared,
            rating = product.rating,
            reliability = product.reliability,
            onCheckedChange = {},
            onRatingClick = {},
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ProductChipRowDarkPreview() {
    ComposeProductCardsTheme {
        val product = products[1]
        ProductChipRow(
            isCompared = product.isCompared,
            rating = product.rating,
            reliability = product.reliability,
            onCheckedChange = {},
            onRatingClick = {},
        )
    }
}
