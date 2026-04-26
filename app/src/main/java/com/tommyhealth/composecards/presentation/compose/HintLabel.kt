package com.tommyhealth.composecards.presentation.compose

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.presentation.BadgeUi
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme
import com.tommyhealth.composecards.ui.theme.Excellent

@Composable
fun HintLabel(
    badge: BadgeUi,
    modifier: Modifier = Modifier,
) {
    Text(
        text = badge.title,
        style = MaterialTheme.typography.bodySmall,
        color = badge.color,
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(badge.color.copy(alpha = 0.25f))
            .padding(horizontal = 6.dp, vertical = 2.dp),
    )
}

@Preview(showBackground = true)
@Composable
private fun HintLabelPreview() {
    ComposeProductCardsTheme {
        HintLabel(
            badge = BadgeUi(title = "Хит продаж", color = Excellent),
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HintLabelDarkPreview() {
    ComposeProductCardsTheme {
        HintLabel(
            badge = BadgeUi(title = "Хит продаж", color = Excellent),
        )
    }
}
