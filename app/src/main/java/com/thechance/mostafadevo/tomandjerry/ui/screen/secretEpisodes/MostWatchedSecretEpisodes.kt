package com.thechance.mostafadevo.tomandjerry.ui.screen.secretEpisodes

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
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

data class MostWatchedSecretEpisodesData(
    @DrawableRes val image: Int,
    val title: String
)

@Composable
fun MostWatchedSecretEpisodes(
    modifier: Modifier = Modifier,
    mostWatchedSecretEpisodesData: MostWatchedSecretEpisodesData
) {
    Box(
        Modifier
            .border(
                width = 1.dp,
                color = Color(0x261F1F1E),
                shape = RoundedCornerShape(size = 16.dp)
            )
            .width(212.dp)
            .height(311.dp)
    ) {
        Image(
            painter = painterResource(id = mostWatchedSecretEpisodesData.image),
            contentDescription = "image description",
            modifier = Modifier.matchParentSize().clip(RoundedCornerShape(size = 16.dp))
        )
        Box(
            Modifier
                .align(Alignment.TopEnd)
                .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                .border(
                    width = 1.dp,
                    color = Color(0x80FFFFFF),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .width(48.dp)
                .height(48.dp)
                .background(color = Color(0x3DFFFFFF), shape = RoundedCornerShape(size = 12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.cheese),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = modifier.size(24.dp)
            )
        }
        Text(
            text = mostWatchedSecretEpisodesData.title,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.roboto)),
                fontWeight = FontWeight(600),
                color = Color(0xFFFFFFFF),
                letterSpacing = 0.25.sp,
            ), modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(
                    bottom = 12.dp,
                    start = 8.dp,
                    end = 8.dp
                )
        )
    }
}

@Preview
@Composable
fun MostWatchedSecretEpisodesPreview() {
    val mostWatchedSecretEpisodesData = MostWatchedSecretEpisodesData(
        image = R.drawable.episode_card,
        title = "Number 404 - The Cursed Cheese 🧀"
    )
    MostWatchedSecretEpisodes(mostWatchedSecretEpisodesData = mostWatchedSecretEpisodesData)
}

