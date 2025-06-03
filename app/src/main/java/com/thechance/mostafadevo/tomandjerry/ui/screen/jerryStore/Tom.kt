package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore

import androidx.annotation.DrawableRes

data class Tom(
    val title: String,
    val subTitle: String,
    val oldPrice: Int,
    val newPrice: Int,
    @DrawableRes val tomImage: Int
)