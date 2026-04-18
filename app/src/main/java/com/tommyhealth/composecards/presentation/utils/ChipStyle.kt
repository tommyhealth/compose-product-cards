package com.tommyhealth.composecards.presentation.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

private val ChipShape = RoundedCornerShape(6.dp)

@Composable
fun Modifier.chipStyle(
    onClick: (() -> Unit)? = null,
    role: Role? = null,
): Modifier = this
    .clip(shape = ChipShape)
    .then(if (onClick != null) Modifier.clickable(role = role, onClick = onClick) else Modifier)
    .border(
        width = 0.7.dp,
        color = MaterialTheme.colorScheme.outlineVariant,
        shape = ChipShape
    )
    .background(color = MaterialTheme.colorScheme.background)
    .padding(horizontal = 4.dp, vertical = 5.dp)