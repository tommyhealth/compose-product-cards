package com.tommyhealth.composecards.presentation.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.content.res.Configuration
import com.tommyhealth.composecards.presentation.utils.chipStyle
import com.tommyhealth.composecards.ui.theme.Average
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

private const val STARS_COUNT = 5

@Composable
fun RatingChip(
    rating: Float,
    reviewCount: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.chipStyle(onClick = onClick, role = Role.Button)
    ) {
        repeat(STARS_COUNT) { index ->
            val fill = (rating - index).coerceIn(0f, 1f)

            Box {
                Icon(
                    imageVector = Icons.Default.StarBorder,
                    contentDescription = null,
                    tint = Average,
                    modifier = Modifier.size(16.dp),
                )
                if (fill > 0f) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Average,
                        modifier = Modifier
                            .size(16.dp)
                            .drawWithContent {
                                clipRect(right = this.size.width * fill) {
                                    this@drawWithContent.drawContent()
                                }
                            }
                    )
                }
            }
        }
        Spacer(Modifier.width(4.dp))
        Text(
            text = reviewCount,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onBackground,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingChipPreview() {
    ComposeProductCardsTheme {
        RatingChip(
            rating = 3.4f,
            reviewCount = "22",
            onClick = {}
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun RatingChipDarkPreview() {
    ComposeProductCardsTheme {
        RatingChip(
            rating = 3.4f,
            reviewCount = "22",
            onClick = {}
        )
    }
}