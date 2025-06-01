package com.thechance.mostafadevo.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.JerryStore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
            ) {innerPadding->
                JerryStore(Modifier.padding(innerPadding))
//                TomKitchen(Modifier.padding(innerPadding))
            }
        }
    }
}

