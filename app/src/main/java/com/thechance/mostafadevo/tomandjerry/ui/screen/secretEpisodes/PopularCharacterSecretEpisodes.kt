package com.thechance.mostafadevo.tomandjerry.ui.screen.secretEpisodes

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R

data class PopularCharacterData(
    @DrawableRes val image: Int, val title: String, val value: String, val background: Color
)

@Composable
fun PopularCharacterSecretEpisodes(
    modifier: Modifier = Modifier, popularCharacterData: PopularCharacterData
) {
    Box(
        modifier.size(
            width = 140.dp, height = 128.dp
        )
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(104.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(popularCharacterData.background)
        )
        Image(
            painter = painterResource(id = popularCharacterData.image),
            contentDescription = "image description",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.TopCenter)
        )
        Text(
            text = popularCharacterData.title,
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic)),
                fontWeight = FontWeight(500),
                color = Color(0xDE1F1F1E),
                textAlign = TextAlign.Center,
                letterSpacing = 0.25.sp,
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 72.dp, start = 26.dp, end = 26.dp)
        )
        Text(
            text = popularCharacterData.value,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic)),
                fontWeight = FontWeight(400),
                color = Color(0x991F1F1E),
                textAlign = TextAlign.Center,
                letterSpacing = 0.25.sp,
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 96.dp, bottom = 12.dp)

        )
    }
}

@Preview
@Composable
fun PopularCharacterSecretEpisodesPreview() {
    val popularCharacterData = PopularCharacterData(
        image = R.drawable.poptom,
        title = "Tom",
        value = "Failed stalker",
        background = Color.Yellow
    )
    PopularCharacterSecretEpisodes(popularCharacterData = popularCharacterData)
}