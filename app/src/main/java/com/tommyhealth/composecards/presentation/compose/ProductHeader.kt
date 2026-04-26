package com.tommyhealth.composecards.presentation.compose

import android.content.res.Configuration
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.tommyhealth.composecards.presentation.BadgeUi
import com.tommyhealth.composecards.presentation.products
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme
import kotlinx.collections.immutable.ImmutableList

private val ImageWidth = 100.dp
private const val ImageAspectRatio = 0.75f

@Composable
fun ProductHeader(
    imageUrl: String,
    title: String,
    badges: ImmutableList<BadgeUi>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = title,
            placeholder = ColorPainter(MaterialTheme.colorScheme.surfaceVariant),
            error = ColorPainter(MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier
                .width(ImageWidth)
                .aspectRatio(ImageAspectRatio)
                .clip(RoundedCornerShape(8.dp)),
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.fillMaxHeight()) {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onBackground
            )
            if (badges.isNotEmpty()) {
                Spacer(Modifier.weight(1f))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                        .padding(bottom = 2.dp),
                ) {
                    badges.forEach { badge ->
                        HintLabel(badge = badge)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductHeaderPreview() {
    val product = products[0]
    ComposeProductCardsTheme {
        ProductHeader(
            imageUrl = product.imageUrl,
            title = product.title,
            badges = product.badges,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductHeaderWithBadgePreview() {
    val product = products[1]
    ComposeProductCardsTheme {
        ProductHeader(
            imageUrl = product.imageUrl,
            title = product.title,
            badges = product.badges,
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ProductHeaderDarkPreview() {
    val product = products[1]
    ComposeProductCardsTheme {
        ProductHeader(
            imageUrl = product.imageUrl,
            title = product.title,
            badges = product.badges,
        )
    }
}
