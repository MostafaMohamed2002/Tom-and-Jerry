package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore

import androidx.annotation.DrawableRes

data class Product(
    val title: String,
    val subTitle: String,
    val oldPrice: Int,
    val newPrice: Int,
    @DrawableRes val tomImage: Int
)