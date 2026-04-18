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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme
import com.tommyhealth.composecards.ui.theme.Excellent

@Composable
fun HintLabel(
    text: String,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodySmall,
        color = textColor,
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
            .padding(horizontal = 6.dp, vertical = 2.dp),
    )
}

@Preview(showBackground = true)
@Composable
private fun HintLabelPreview() {
    ComposeProductCardsTheme {
        HintLabel(
            text = "Хит продаж",
            textColor = Excellent,
            backgroundColor = Excellent.copy(alpha = 0.25f),
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HintLabelDarkPreview() {
    ComposeProductCardsTheme {
        HintLabel(
            text = "Хит продаж",
            textColor = Excellent,
            backgroundColor = Excellent.copy(alpha = 0.25f),
        )
    }
}
