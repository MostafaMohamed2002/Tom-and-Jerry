package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R


@Composable
fun JerryStoreNotificationIcon(modifier: Modifier = Modifier, notificationCount : Int) {
    Box(
        modifier = Modifier.then(modifier)
            .size(44.dp, 44.dp)
    ) {
        //image box
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0x1F1F1E26),
                    shape = RoundedCornerShape(12.dp)
                )
                .size(40.dp, 40.dp)
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.notification_01),
                contentDescription = "Notification Icon",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(8.dp)
            )

        }
        //notifications badge
        if (notificationCount !=0){
            Box(
                modifier = Modifier
                    .size(14.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = (-2).dp, y = (-4).dp)
                    .clip(
                        RoundedCornerShape(100)
                    )
                    .background(Color(0xFF03578A)),
            ) {
                Text(
                    text = notificationCount.toString(),
                    modifier = Modifier.align(Alignment.Center),
                    color = Color.White,
                    fontSize = 9.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
        }

    }
}

@Preview
@Composable
private fun JerryStoreNotificationIconPreview() {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        JerryStoreNotificationIcon(
            notificationCount = 3
        )
    }
}