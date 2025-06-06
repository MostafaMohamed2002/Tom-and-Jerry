package com.thechance.mostafadevo.tomandjerry.ui.screen.secretEpisodes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
fun SecretEpisodesScreen(modifier: Modifier = Modifier) {
    val mostwatched = listOf(
        MostWatchedSecretEpisodesData(
            image = R.drawable.episode_card,
            title = "Number 404 - The Cursed Cheese \uD83E\uDDC0"
        ),
        MostWatchedSecretEpisodesData(
            image = R.drawable.episodcardgreen,
            title = "Chase on the moon \uD83C\uDF15\n"
        ),
    )
    val popular = listOf(
        PopularCharacterData(
            title = "TOM",
            value = "Failed stalker",
            background = Color(0xFFFCF2C5),
            image = R.drawable.poptom,
        ),
        PopularCharacterData(
            title = "Jerry",
            value = "A scammer mouse",
            background = Color(0xFFFCC5E4),
            image = R.drawable.popjerry,
        ),
        PopularCharacterData(
            title = "Jerry",
            value = "Hungry mouse",
            background = Color(0xFFC5E7FC),
            image = R.drawable.poplittlejerry,
        ),
    )
    Box(modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color(0xFFA3DCFF), Color(0xFFEEF4F6)
                        )
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 600.dp)
                .background(
                     Color(0xFFEEF4F6)
                )
        )
        Column {
            SecretEpisodesHeader(
                modifier = Modifier.padding(
                    start = 16.dp, end = 16.dp, top = 16.dp
                )
            )
            Spacer(Modifier.size(8.dp))
            SecretEpisodesInfo(modifier = Modifier.padding(start = 16.dp, end = 16.dp))
            Spacer(Modifier.size(12.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Text(
                    text = "Most watched",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily(Font(R.font.roboto)),
                        fontWeight = FontWeight(600),
                        color = Color(0xDE1F1F1E),
                        letterSpacing = 0.25.sp,
                    )
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = "View all",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF035486),
                    )
                )
                Spacer(Modifier.size(4.dp))
                Image(
                    painter = painterResource(R.drawable.arrow_right_04),
                    contentDescription = null,

                    )

            }
            Spacer(Modifier.size(12.dp))
            LazyRow(
                contentPadding = PaddingValues(start = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(
                    mostwatched
                ) {
                    MostWatchedSecretEpisodes(mostWatchedSecretEpisodesData = it)
                }
            }
            Spacer(Modifier.size(24.dp))
            Text(
                text = "Popular character",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily(Font(R.font.roboto)),
                    fontWeight = FontWeight(600),
                    color = Color(0xDE1F1F1E),
                    letterSpacing = 0.25.sp,
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )
            Spacer(Modifier.size(12.dp))
            LazyRow(
                contentPadding = PaddingValues(start = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(popular) {
                    PopularCharacterSecretEpisodes(popularCharacterData = it)
                }
            }
        }

    }
}

@Preview
@Composable
fun SecretEpisodesScreenPreview() {
    SecretEpisodesScreen()
}

