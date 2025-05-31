package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.Product

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    product: Product,
    onAddClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .height(235.dp)
            .width(160.dp)
            .then(modifier)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(219.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(8.dp)
                .align(Alignment.BottomCenter)

        ) {
            Column(
                modifier = Modifier.align(Alignment.BottomCenter),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(Modifier.size(8.dp))
                Column(
                    modifier = Modifier.height(81.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = product.title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Box(
                        Modifier.height(54.dp)
                    ) {
                        Text(
                            text = product.subTitle,
                            fontSize = 12.sp,
                            color = Color.Gray,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            textAlign = TextAlign.Center,
                        )
                    }
                }

                Spacer(Modifier.size(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    PriceInfo(
                        modifier = Modifier,
                        oldPrice = product.oldPrice,
                        newPrice = product.newPrice
                    )
                    Spacer(Modifier.size(8.dp))
                    AddToCartButton(onClick = onAddClick, modifier = Modifier.size(30.dp))
                }
            }
        }
        Image(
            painter = painterResource(product.tomImage),
            contentDescription = "Tom Image",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .size(100.dp),
        )
    }

}

@Composable
fun AddToCartButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        modifier = modifier
            .size(30.dp)
            .border(
                width = 1.dp, color = Color(0xFF03578A), shape = RoundedCornerShape(8.dp)
            )
            .clickable { onClick() }, contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(
                R.drawable.add_to_cart_icon
            ), contentDescription = "Add to cart button", modifier = Modifier.size(16.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun PriceInfo(
    modifier: Modifier = Modifier, oldPrice: Int, newPrice: Int
) {
    Box(
        modifier = modifier
            .height(30.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xffD0E5F0))
            .padding(horizontal = 10.dp, vertical = 6.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.money_bag_01),
                contentDescription = "Price Icon",
                modifier = Modifier.size(16.dp)
            )
            Spacer(Modifier.size(4.dp))
            if (oldPrice != newPrice) {
                Text(
                    text = "$oldPrice",
                    fontWeight = FontWeight.W500,
                    textDecoration = TextDecoration.LineThrough,
                    color = Color(0xFF03578A),
                    fontSize = 12.sp
                )
            }

            Text(
                text = " $newPrice cheeses",
                fontWeight = FontWeight.W500,
                color = Color(0xFF03578A)
                , fontSize = 12.sp,
            )

        }
    }
}

@Preview
@Composable
private fun ProductCardPrev() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ProductCard(
            product = Product(
                title = "Sport Tom",
                subTitle = "Disguises itself as a table.\n" +
                        "\n",
                oldPrice = 5,
                newPrice = 3,
                tomImage = R.drawable.spy_tom,
            ),
            onAddClick = {}
        )
    }

}