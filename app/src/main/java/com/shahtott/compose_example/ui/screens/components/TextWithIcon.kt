package com.shahtott.compose_example.ui.screens.components

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shahtott.compose_example.ui.theme.colorGrayText

@Composable
fun TextWithIcon(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFF636365)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            color = colorGrayText,
            style = MaterialTheme.typography.titleMedium
                .copy(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
        )
    }
}