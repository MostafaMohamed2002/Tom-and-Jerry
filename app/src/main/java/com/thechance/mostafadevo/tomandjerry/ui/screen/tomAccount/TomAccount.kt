package com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.theme.black60
import com.thechance.mostafadevo.tomandjerry.ui.theme.white12
import com.thechance.mostafadevo.tomandjerry.ui.theme.white80


@Composable
fun TomAccountScreen(modifier: Modifier = Modifier) {
    val listOfStatsItems = listOf(
        Stats(
            label = "2M 12K",
            value = "No. of quarrels",
            icon = R.drawable.devil,
            backgroundColor = Color(0xffD0E5F0)
        ),
        Stats(
            label = "+500 h",
            value = "Chase time",
            icon = R.drawable.run,
            backgroundColor = Color(0xffDEEECD)
        ),
        Stats(
            label = "2M 12K",
            value = "Hunting times",
            icon = R.drawable.sad,
            backgroundColor = Color(0xffF2D9E7)
        ),
        Stats(
            label = "3M 7K",
            value = "Heartbroken",
            icon = R.drawable.heart_broken,
            backgroundColor = Color(0xffFAEDCF)
        ),
    )
    val listOfTomSettings = listOf(
        Pair("Change sleeping place", R.drawable.bed_single_02),
        Pair("Meow settings", R.drawable.cat),
        Pair("Password to open the fridge", R.drawable.fridge)
    )
    val listOfFavouriteFoods = listOf(
        Pair("Mouses", R.drawable.alert_01),
        Pair("Last stolen meal", R.drawable.hamburger_02),
        Pair("Change sleep mood", R.drawable.sleeping)
    )
    Box(modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .height(202.dp)
                .fillMaxWidth()
                .align(Alignment.TopCenter)

        ) {
            Image(
                painter = painterResource(id = R.drawable.background_container),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = modifier.matchParentSize()
            )
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 16.dp, bottom = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(R.drawable.tomaccount),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(64.dp)
                )
                Spacer(Modifier.size(4.dp))
                Text(
                    text = "Tom",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    letterSpacing = TextUnit(0f, TextUnitType.Sp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "specializes in failure!",
                    color = white80,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    letterSpacing = TextUnit(0f, TextUnitType.Sp),
                    textAlign = TextAlign.Center,
                )
                Spacer(Modifier.size(4.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp)
                        .clip(RoundedCornerShape(40.dp))
                        .background(white12)
                        .size(width = 97.dp, height = 25.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Edit foolishness",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W500,
                        letterSpacing = TextUnit(0f, TextUnitType.Sp),
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(Modifier.size(8.dp))

            }
        }
        Box(
            Modifier
                .padding(top = 180.dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))

                .background(Color(0xFFEEF4F6))
                .align(Alignment.TopCenter)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                item {
                    Spacer(Modifier.size(23.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        StatsItem(
                            modifier = Modifier.weight(1f),
                            stats = listOfStatsItems[0]
                        )
                        StatsItem(
                            modifier = Modifier.weight(1f),
                            stats = listOfStatsItems[1]
                        )
                    }
                    Spacer(Modifier.size(8.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        StatsItem(
                            modifier = Modifier.weight(1f),
                            stats = listOfStatsItems[2]
                        )
                        StatsItem(
                            modifier = Modifier.weight(1f),
                            stats = listOfStatsItems[3]
                        )
                    }
                    Spacer(Modifier.size(24.dp))
                }

                item {
                    SectionHeader(title = "Tom settings")
                    Spacer(Modifier.size(8.dp))
                }

                items(
                    items = listOfTomSettings,
                    key = { it.first }
                ) { setting ->
                    ListItem(
                        icon = setting.second,
                        text = setting.first
                    )
                    if (listOfTomSettings.last() != setting) {
                        Spacer(Modifier.height(12.dp))
                    }
                }

                item {
                    Spacer(Modifier.size(12.dp))
                    HorizontalDivider(
                        thickness = 1.dp,
                        color = Color(0x14001A1F)
                    )
                    Spacer(Modifier.size(12.dp))
                }

                item {
                    SectionHeader(title = "His favorite foods")
                    Spacer(Modifier.size(8.dp))
                }

                items(
                    items = listOfFavouriteFoods,
                    key = { it.first }
                ) { food ->
                    ListItem(
                        icon = food.second,
                        text = food.first
                    )
                    if (listOfFavouriteFoods.last() != food) {
                        Spacer(Modifier.height(12.dp))
                    }
                }

                item {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    ) {
                        Text(
                            text = "v.TomBeta",
                            color = black60,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            letterSpacing = TextUnit(0f, TextUnitType.Sp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }


        }
    }
}


@Preview
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen()
}