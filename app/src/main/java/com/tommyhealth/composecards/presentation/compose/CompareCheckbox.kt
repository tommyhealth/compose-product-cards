package com.tommyhealth.composecards.presentation.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import com.tommyhealth.composecards.R
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun CompareCheckbox(
    checked: Boolean,
    onCheckedChange: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable(onClick = onCheckedChange, role = Role.Checkbox)
            .border(0.7.dp, Color.LightGray, RoundedCornerShape(6.dp))
            .padding(horizontal = 4.dp, vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier
                .size(18.dp)
                .border(0.7.dp, Color.LightGray, RoundedCornerShape(4.dp)),
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
            fontSize = 15.sp,
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