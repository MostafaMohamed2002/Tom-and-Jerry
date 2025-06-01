package com.thechance.mostafadevo.tomandjerry.ui.screen.tomKitcken

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.thechance.mostafadevo.tomandjerry.ui.theme.black37
import com.thechance.mostafadevo.tomandjerry.ui.theme.black60


@Composable
fun DetailsContainer(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    title: String,
    subTitle: String

) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFD0E5F0)), contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
            Spacer(Modifier.size(12.dp))

            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = black60,
                letterSpacing = TextUnit(value = 0.5f,type = TextUnitType.Sp),
                lineHeight = TextUnit(value = 16f,type = TextUnitType.Sp),
                maxLines = 1
            )
            Spacer(Modifier.size(4.dp))
            Text(
                text = subTitle,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = black37,
                letterSpacing = TextUnit(value = 0.5f,type = TextUnitType.Sp),
                lineHeight = TextUnit(value = 16f,type = TextUnitType.Sp),
                maxLines = 1
            )
        }
    }
}

@Preview
@Composable
private fun DetailsContainerPrev() {
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(12.dp)
    ){
        DetailsContainer(
            modifier = Modifier.size(104.dp),
            icon = R.drawable.devil ,
            title = "1M 12K",
            subTitle = "No. of deaths",

            )
        DetailsContainer(
            modifier = Modifier.size(104.dp),
            icon = R.drawable.devil ,
            title = "1M 12K",
            subTitle = "No. of deaths"
        )
        DetailsContainer(
            modifier = Modifier.size(104.dp),
            icon = R.drawable.devil ,
            title = "1M 12K",
            subTitle = "No. of deaths"
        )
    }

}