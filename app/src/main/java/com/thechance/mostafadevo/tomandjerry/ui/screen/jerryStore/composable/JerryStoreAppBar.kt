package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R

@Composable
fun JerryStoreAppBar(
    modifier: Modifier = Modifier,
    @DrawableRes profileImage: Int,
    userName: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(profileImage),
            contentDescription = "Profile Image App",
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
        )

        Spacer(Modifier.size(8.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 4.5.dp, bottom = 4.5.dp)
        ) {

            Text(
                text = "Hi, $userName \uD83D\uDC4B\uD83C\uDFFB",
                fontWeight = FontWeight.W500,
                fontSize = 14.sp,
                style = TextStyle(
                    lineHeight = 1.em
                ),
                color = Color.Black
            )
            Spacer(Modifier.size(2.dp))
            Text(
                text = "Which Tom do you want to buy?",
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                color = Color(0xFFA5A6A4),
                style = TextStyle(
                    lineHeight = 1.em
                ),
            )

        }
    }
}

@Preview
@Composable
private fun JerryStoreAppBarPreview() {
    JerryStoreAppBar(
        modifier = Modifier,
        profileImage = R.drawable.profile_image_2,
        userName = "Jerry"
    )
}

