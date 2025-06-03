package com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.ui.theme.black87

@Composable
fun SectionHeader(modifier: Modifier = Modifier, title: String) {
    Text(
        text = title,
        color = black87,
        fontSize = 20.sp,
        fontWeight = FontWeight.W700,
        letterSpacing = TextUnit(0f, TextUnitType.Sp),
        textAlign = TextAlign.Start
    )
}