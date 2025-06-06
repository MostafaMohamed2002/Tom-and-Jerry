package com.thechance.mostafadevo.tomandjerry.ui.screen.secretEpisodes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R


@Composable
fun SecretEpisodesInfo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(178.dp)
    ) {
        Row {
            Column(
                modifier = Modifier
                    .padding(
                        top = 33.dp,
                        bottom = 33.dp,
                    )
                    .width(216.dp)
            ) {
                Text(
                    text = "Deleted episodes of Tom and Jerry!",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily(Font(R.font.roboto)),
                        fontWeight = FontWeight(600),
                        color = Color(0xDE1F1F1E),
                        letterSpacing = 0.25.sp,
                    )
                )
                Spacer(Modifier.size(12.dp))
                Text(
                    text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily(Font(R.font.roboto)),
                        fontWeight = FontWeight(400),
                        color = Color(0x991F1F1E),
                        letterSpacing = 0.25.sp,
                    )
                )
            }
            Spacer(Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.tomholdingjerry),
                contentDescription = "image description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(112.dp)
                    .height(178.dp)
            )
        }
    }
}

@Preview
@Composable
fun SecretEpisodesInfoPreview() {
    SecretEpisodesInfo()
}