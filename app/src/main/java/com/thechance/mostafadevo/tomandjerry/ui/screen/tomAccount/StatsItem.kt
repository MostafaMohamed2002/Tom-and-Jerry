package com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.theme.black37
import com.thechance.mostafadevo.tomandjerry.ui.theme.black60
data class Stats(
    val label: String,
    val value: String,
    @DrawableRes val icon: Int,
    val backgroundColor: Color
)

@Composable
fun StatsItem(
    modifier: Modifier = Modifier,
    stats: Stats
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = stats.backgroundColor)
            .width(160.dp)
            .heightIn(56.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = stats.icon),
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        start = 12.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    )
                    .size(40.dp)
            )
            Spacer(Modifier.size(10.dp))
            Column {
                Text(
                    text = stats.label,
                    color = black60,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)
                )
                Text(
                    text = stats.value,
                    color = black37,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W500,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                )
            }
        }
    }
}

@Preview
@Composable
fun StatsItemPreview() {
    StatsItem(
        stats = Stats(
            backgroundColor = Color(0xffD0E5F0),
            label = "2M 12K",
            value = "No. of quarrels",
            icon = R.drawable.devil
        )
    )
}