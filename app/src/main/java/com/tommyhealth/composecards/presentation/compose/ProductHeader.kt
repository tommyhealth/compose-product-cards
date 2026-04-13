package com.tommyhealth.composecards.presentation.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import coil3.compose.AsyncImage
import com.tommyhealth.composecards.ui.theme.ComposeProductCardsTheme

@Composable
fun ProductHeader(
    title: String,
    image: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        AsyncImage(
            model = image.toUri(),
            contentDescription = null,
            placeholder = ColorPainter(Color.LightGray),
            error = ColorPainter(Color.LightGray),
            modifier = Modifier
                .width(100.dp)
                .aspectRatio(0.75f)
                .clip(RoundedCornerShape(8.dp)),
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = title,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview
@Composable
private fun ProductHeaderPreview() {
    ComposeProductCardsTheme(darkTheme = true) {
        ProductHeader(
            image = "file:///android_asset/img_1.png",
            title = "6.67\" Смартфон Xiaomi Redmi Note 14 128 ГБ черный",
        )
    }
}