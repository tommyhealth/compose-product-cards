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
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun ProductCard(
    title: String,
    imageUrl: String,
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
            title = title,
            imageUrl = imageUrl
        )
    }
}

@Preview
@Composable
private fun ProductCardPreview() {
    ComposeProductCardsTheme(darkTheme = false) {
        ProductCard(
            title = "6.67\" Смартфон Xiaomi Redmi Note 14 128 ГБ черный",
            imageUrl = "",
        )
    }
}