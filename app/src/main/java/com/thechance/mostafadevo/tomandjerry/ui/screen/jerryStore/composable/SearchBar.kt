package com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.mostafadevo.tomandjerry.R

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    value:String,
    onValueChange:() ->Unit,
    placeholder: String,
    @DrawableRes icon:Int
    ) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .height(50.dp)
            .width(272.dp)

    ) {
        TextField(
            value = value,
            onValueChange = { onValueChange() },
            modifier = Modifier.matchParentSize(),
            placeholder = {
                Text(
                    text = placeholder,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    modifier = Modifier.graphicsLayer {
                        translationY = -5f
                    }
                )
            },

            leadingIcon = {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(24.dp)
                )
            },

            colors = TextFieldDefaults.colors(
                // Set the background color
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,

                // Hide the indicator line
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),


            singleLine = true
        )
    }
}
@Preview()
@Composable
private fun SearchBarPreview() {
    SearchBar(
        value = "",
        onValueChange = {  },
        placeholder = "Search about Tom ...",
        icon = R.drawable.search_normal
    )

}