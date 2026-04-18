package com.tommyhealth.composecards.presentation.compose

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tommyhealth.composecards.R
import com.tommyhealth.composecards.presentation.utils.chipStyle
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme
import com.tommyhealth.composecards.ui.theme.Poor

@Composable
fun ReliabilityChip(
    title: String,
    @DrawableRes icon: Int,
    tint: Color,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.chipStyle()
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            tint = tint,
            modifier = Modifier.size(16.dp),
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onBackground,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ReliabilityChipPreview() {
    ComposeProductCardsTheme {
        ReliabilityChip(
            title = "Отличная надежность",
            icon = R.drawable.ic_check,
            tint = Poor
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ReliabilityChipDarkPreview() {
    ComposeProductCardsTheme {
        ReliabilityChip(
            title = "Отличная надежность",
            icon = R.drawable.ic_check,
            tint = Poor
        )
    }
}