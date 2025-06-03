package com.thechance.mostafadevo.tomandjerry

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount.TomAccountScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
            ) { innerPadding ->
//                JerryStore(Modifier.statusBarsPadding().navigationBarsPadding())
//                TomKitchen(Modifier
//                    .statusBarsPadding()
//                    .navigationBarsPadding())
                TomAccountScreen(Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding())
            }
        }
    }
}

