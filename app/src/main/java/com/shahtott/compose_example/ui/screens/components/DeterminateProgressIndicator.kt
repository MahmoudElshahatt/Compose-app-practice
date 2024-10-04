package com.shahtott.compose_example.ui.screens.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DeterminateProgressIndicator(progress: Float) {
    val normalizedProgress = progress.coerceIn(0f, 100f) / 100f

    LinearProgressIndicator(
        progress = normalizedProgress,
        modifier = Modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(CircleShape),
        color = Color(0xFF7750e7),
        trackColor = Color(0xFFdedde3)
    )
}
