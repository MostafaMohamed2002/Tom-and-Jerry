package com.thechance.mostafadevo.tomandjerry.ui.screen.tomKitcken

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.PriceInfo
import com.thechance.mostafadevo.tomandjerry.ui.theme.black60
import com.thechance.mostafadevo.tomandjerry.ui.theme.black87
import com.thechance.mostafadevo.tomandjerry.ui.theme.white80
import com.thechance.mostafadevo.tomandjerry.ui.theme.white87

@Composable
fun TomKitchen(modifier: Modifier = Modifier) {
    val preparationMethodItems : List<Pair<Int,String>> =
        listOf(
            Pair(1,"Put the pasta in a toaster."),
            Pair(2,"Pour battery juice over it."),
            Pair(3,"Wait for the spark to ignite."),
            Pair(4,"Serve with an insulating glove."),
        )
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF79a4bd))
                .height(200.dp)
                .align(Alignment.TopCenter)
                .clipToBounds()
        ) {
            Box(
                modifier = Modifier
                    .graphicsLayer {
                        translationX = -100f
//                        translationY = -200f
                        rotationZ = 60f
                        scaleX = 3f
                        scaleY = 3f
                    }
                    .clip(RoundedCornerShape(20))
                    .size(100.dp)
                    .background(Color(0xFF6194b2))
                    .align(Alignment.TopStart)

            )
        }
        Box(
            modifier = Modifier
                .padding(top = 190.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(Color(0xffEEF4F6))
        ) {
            Column(
                modifier = Modifier
                    .matchParentSize()
                    .padding(16.dp),
            ) {
                //page content
                Spacer(Modifier.size(32.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Electric Tom pasta",
                            fontWeight = FontWeight.W500,
                            fontSize = 20.sp,
                            color = black87,
                            letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                        )
                        Spacer(Modifier.size(12.dp))
                        PriceInfo(
                            oldPrice = 5, newPrice = 5
                        )
                    }
                    Spacer(Modifier.weight(1f))
                    Icon(
                        painter = painterResource(R.drawable.heart),
                        contentDescription = "Heart",
                        modifier = Modifier.size(24.dp),
                        tint = Color.Unspecified

                    )
                }
                Spacer(Modifier.size(16.dp))
                //Details about meal
                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                    fontWeight = FontWeight.W500,
                    fontSize = 14.sp,
                    color = black60,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                )
                Spacer(Modifier.size(24.dp))
                //Details Section
                Text(
                    text = "Details",
                    fontWeight = FontWeight.W500,
                    fontSize = 18.sp,
                    color = black87,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                )
                Spacer(Modifier.size(8.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    DetailsContainer(
                        modifier = Modifier.weight(1f),
                        icon = R.drawable.temperature,
                        title = "1000 V",
                        subTitle = "Temperature",

                        )
                    DetailsContainer(
                        modifier = Modifier.weight(1f),
                        icon = R.drawable.timer_02,
                        title = "3 sparks",
                        subTitle = "Time"
                    )
                    DetailsContainer(
                        modifier = Modifier.weight(1f),
                        icon = R.drawable.devil,
                        title = "1M 12K",
                        subTitle = "No. of deaths"
                    )
                }
                Spacer(Modifier.size(24.dp))
                // Preparation Method Section
                Text(
                    text = "Preparation method",
                    fontWeight = FontWeight.W500,
                    fontSize = 18.sp,
                    color = black87,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                )
                LazyColumn(
                ) {
                    items(preparationMethodItems){
                        PreparationStep(
                            modifier = Modifier.padding(vertical = 8.dp),
                            numberOfStep = it.first,
                            stepText = it.second
                        )
                    }
                }

            }
        }
        //image of the meal
        Image(
            painter = painterResource(R.drawable.tomkitckenmeal),
            contentDescription = "Meal",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(220.dp)
                .align(Alignment.TopEnd)
                .graphicsLayer {
                    translationY = 40f
                    translationX = -50f
                })
        //text above the meal
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 50.dp, start = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ruler),
                    contentDescription = "ruler",
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.CenterVertically),
                    tint = Color.White
                )
                Spacer(Modifier.size(8.dp))
                Text(
                    text = "High tension",
                    fontWeight = FontWeight.W500,
                    fontSize = 16.sp,
                    color = white87,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)

                )
            }
            Spacer(Modifier.size(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.chef),
                    contentDescription = "cheff",
                    modifier = Modifier
                        .padding(start = 19.dp)
                        .size(24.dp)
                        .align(Alignment.CenterVertically),
                    tint = Color.White
                )
                Spacer(Modifier.size(8.dp))
                Text(
                    text = "Shocking foods",
                    fontWeight = FontWeight.W500,
                    fontSize = 16.sp,
                    color = white87,
                    letterSpacing = TextUnit(0.5f, TextUnitType.Sp)
                )
            }
        }
        //bottom action
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(86.dp)
                .background(Color.White)
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.Center
        ){
            //bottom button
            Box(
                modifier= Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xff226993))
                    .clickable {  }
                , contentAlignment = Alignment.Center
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Add to cart",
                        fontWeight = FontWeight.W500,
                        fontSize = 16.sp,
                        color = white87,
                        letterSpacing = TextUnit(0.5f, TextUnitType.Sp),
                        textAlign = TextAlign.Center,
                    )
                    Spacer(Modifier.size(8.dp))
                    Box(
                        modifier = Modifier.size(5.dp).clip(RoundedCornerShape(100)).background(
                            Color.White.copy(alpha = 38f)
                        )
                    )
                    Spacer(Modifier.size(8.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "3 cheeses",
                            fontWeight = FontWeight.W500,
                            fontSize = 14.sp,
                            color = Color(0xffFFFFFF),
                            letterSpacing = TextUnit(0.5f, TextUnitType.Sp),
                            textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "5 cheeses",
                            fontWeight = FontWeight.W500,
                            fontSize = 12.sp,
                            color = white80,
                            letterSpacing = TextUnit(0.5f, TextUnitType.Sp),
                            textAlign = TextAlign.Center,
                            textDecoration = TextDecoration.LineThrough
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun TomKitchenPrev() {
    TomKitchen()
}

@Composable
fun PreparationStep(
    modifier: Modifier = Modifier, numberOfStep: Int, stepText: String
) {
    Box(
        modifier = modifier
            .height(36.dp)
            .fillMaxWidth()
     ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .height(32.dp)
                .fillMaxWidth()
                .padding(start = 20.dp)
                .align(Alignment.Center)
                .background(Color.White),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = stepText,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp,
                color = black60,
                letterSpacing = TextUnit(0.5f, TextUnitType.Sp),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 24 .dp)
            )
        }
        //number box
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100))
                .size(36.dp)
                .background(Color.White)
                .border(
                    1.dp,
                    Color(0xffD0E5F0),
                    CircleShape
                ), contentAlignment = Alignment.Center
        ) {
            Text(
                text = numberOfStep.toString(),
                fontWeight = FontWeight.W500,
                fontSize = 12.sp,
                color = Color(0XFF035587),
                letterSpacing = TextUnit(0.5f, TextUnitType.Sp)
            )
        }

    }
}

@Preview
@Composable
private fun PreparationStepPrev() {
    PreparationStep(
        numberOfStep = 1, stepText = "Put the pasta in a toaster."
    )
}

