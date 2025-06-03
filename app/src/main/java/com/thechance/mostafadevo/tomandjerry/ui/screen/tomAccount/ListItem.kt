package com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.theme.black87

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    text: String
) {
    Box(
        modifier
            .height(40.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .size(40.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(icon),
                    contentDescription = null,
                    modifier = Modifier.padding(8.dp).size(24.dp)
                    )
            }
            Spacer(Modifier.size(8.dp))
            Text(
                text = text,
                color = black87,
                fontSize = 16.sp,
                fontWeight = FontWeight.W500,
                letterSpacing = TextUnit(0f, TextUnitType.Sp),
                textAlign = TextAlign.Right
            )
        }
    }
}

@Preview
@Composable
fun ListItemPreview() {
    ListItem(
        icon = R.drawable.bed_single_02,
        text = "Change sleeping place"
    )
}