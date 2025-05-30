package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.JerryStoreAppBar
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.JerryStoreNotificationIcon
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.ProductCard
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.PromotionBanner
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.SearchBar
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable.SettingsIcon

@Composable
fun JerryStore(modifier: Modifier = Modifier) {
    val listOfProducts: List<Product> = listOf(
        Product(
            title = "Sport Tom",
            subTitle = "He runs 1 meter... trips over his boot.\n",
            oldPrice = 5,
            newPrice = 3,
            tomImage = R.drawable.sport_tom
        ),
        Product(
            title = "Tom the lover",
            subTitle = "He loves one-sidedly... and is beaten by the other side.",
            oldPrice = 5,
            newPrice = 5,
            tomImage = R.drawable.tom_the_lover
        ),
        Product(
            title = "Tom the bomb",
            subTitle = "He blows himself up before Jerry can catch him.",
            oldPrice = 10,
            newPrice = 10,
            tomImage = R.drawable.tom_the_bomb
        ),
        Product(
            title = "Spy Tom",
            subTitle = "Disguises itself as a table.\n" + "\n",
            oldPrice = 12,
            newPrice = 12,
            tomImage = R.drawable.frozen_tom
        ),
        Product(
            title = "Frozen Tom",
            subTitle = "He was chasing Jerry, he froze after the first look\n",
            oldPrice = 10,
            newPrice = 10,
            tomImage = R.drawable.sleeping_tom
        ),
        Product(
            title = "Sleeping Tom",
            subTitle = "He doesn't chase anyone, he just snores in stereo.\n",
            oldPrice = 10,
            newPrice = 10,
            tomImage = R.drawable.spy_tom
        ),
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffEEF4F6))
            .then(modifier)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row {
                JerryStoreAppBar(
                    profileImage = R.drawable.profile_image_2,
                    userName = "Jerry"
                )
                Spacer(Modifier.weight(1f))
                JerryStoreNotificationIcon(
                    notificationCount = 3
                )
            }
            Spacer(Modifier.size(12.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                SearchBar(
                    modifier = Modifier.weight(1f),
                    value = "",
                    onValueChange = {  },
                    placeholder = "Search about Tom ...",
                    icon = R.drawable.search_normal
                )
                Spacer(Modifier.size(8.dp))
                SettingsIcon {  }
            }
            PromotionBanner()
            Spacer(Modifier.size(24.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cheap tom section", fontSize = 20.sp, fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = "View all ", fontSize = 12.sp, color = Color(0xFF03578A)
                )
                Spacer(Modifier.size(4.dp))
                Image(
                    painter = painterResource(R.drawable.arrow_right_04),
                    contentDescription = "Arrow Right",
                    modifier = Modifier.size(12.dp)
                )

            }
            Spacer(Modifier.size(8.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)

            ) {
                items(listOfProducts) { product ->
                    ProductCard(
                        product = product, onAddClick = { })
                }
            }

        }
    }
}

@Preview
@Composable
private fun JerryStorePrev() {
    JerryStore()
}

