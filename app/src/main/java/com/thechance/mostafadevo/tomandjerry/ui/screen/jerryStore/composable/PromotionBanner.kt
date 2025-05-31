package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R

@Composable
fun PromotionBanner(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.height(108.dp)
    ){
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            Color(0xFF03446A),
                            Color(0xFF0685D0)
                        ),
                        tileMode = TileMode.Clamp
                    )
                )
                .fillMaxWidth()
                .height(92.dp)
                .align(Alignment.BottomCenter)
        ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
                .align(Alignment.CenterStart)
        ) {
            Text(
                text = "Buy 1 Tom and get 2 for free",
                color = Color.White,
                fontSize = 16.sp
            )
            Spacer(Modifier.size(8.dp))
            Text(
                text = "Adopt Tom! (Free Fail-Free\n Guarantee)",
                color = Color.White.copy(alpha = 0.8f),
                fontSize = 16.sp
            )
        }
        }
        Box(
            modifier = Modifier
                .graphicsLayer { rotationZ = -60f }
                .offset(x=9.dp,y=42.dp)
                .clip(RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp))
                .size(width =132.dp , height =110.dp )
                .align(Alignment.CenterEnd)
                .background(Color(0xFFFFFFFF).copy(alpha = 0.04f), shape = RoundedCornerShape(100))
        )
        Box(
            modifier = Modifier
                .graphicsLayer { rotationZ = -60f }
                .offset(x=5.dp,y=36.dp)
                .clip(RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp))
                .size(width =132.dp , height =110.dp )
                .align(Alignment.CenterEnd)
                .background(Color(0xFFFFFFFF).copy(alpha = 0.04f), shape = RoundedCornerShape(100))
        )
        Image(
            painter = painterResource(R.drawable.tom_with_money),
            contentDescription = "Tom with money",
            modifier = Modifier.size(
                height = 108.dp,
                width = 115.dp
            ).align(Alignment.CenterEnd),
            contentScale = ContentScale.Fit
        )

    }

}

@Preview
@Composable
private fun PromotionBannerPrev() {
        PromotionBanner()

}