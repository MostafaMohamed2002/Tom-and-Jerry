package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.mostafadevo.tomandjerry.R

@Composable
fun SettingsIcon(modifier: Modifier = Modifier , onClick : () -> Unit) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF03578A))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.filter_horizontal),
            contentDescription = "Settings",
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview
@Composable
private fun SettingsIconPreview() {
    SettingsIcon(onClick = {})
}