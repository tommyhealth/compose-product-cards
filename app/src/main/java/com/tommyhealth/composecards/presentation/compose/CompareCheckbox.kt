package com.tommyhealth.composecards.presentation.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import android.content.res.Configuration
import com.tommyhealth.composecards.R
import com.tommyhealth.composecards.presentation.utils.chipStyle
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun CompareCheckbox(
    checked: Boolean,
    onCheckedChange: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.chipStyle(onClick = onCheckedChange, role = Role.Checkbox)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(14.dp)
                .border(
                    width = 0.7.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = RoundedCornerShape(4.dp)
                ),
        ) {
            if (checked) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground,
                )
            }
        }
        Spacer(Modifier.width(4.dp))
        Text(
            text = stringResource(R.string.compare),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onBackground,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CompareCheckboxUncheckedPreview() {
    ComposeProductCardsTheme {
        CompareCheckbox(checked = false, onCheckedChange = {})
    }
}

@Preview(showBackground = true)
@Composable
private fun CompareCheckboxCheckedPreview() {
    ComposeProductCardsTheme {
        CompareCheckbox(checked = true, onCheckedChange = {})
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CompareCheckboxDarkPreview() {
    ComposeProductCardsTheme {
        CompareCheckbox(checked = true, onCheckedChange = {})
    }
}