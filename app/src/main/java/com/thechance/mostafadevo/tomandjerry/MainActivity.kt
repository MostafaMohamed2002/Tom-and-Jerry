package com.thechance.mostafadevo.tomandjerry

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.thechance.mostafadevo.tomandjerry.ui.screen.jerryStore.JerryStore
import com.thechance.mostafadevo.tomandjerry.ui.screen.tomAccount.TomAccountScreen
import com.thechance.mostafadevo.tomandjerry.ui.screen.tomKitcken.TomKitchen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Main Navigation")
        Spacer(modifier = Modifier.height(32.dp))

        // New Order: Store, Kitchen, Account
        Button(onClick = { navController.navigate(AppRoutes.JERRY_STORE) }) {
            Text("Go to Jerry's Store")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(AppRoutes.TOM_KITCHEN) }) {
            Text("Go to Tom's Kitchen")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(AppRoutes.TOM_ACCOUNT) }) {
            Text("Go to Tom's Account")
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold { innerPadding -> // innerPadding is provided by Scaffold
        NavHost(
            navController = navController,
            startDestination = AppRoutes.HOME, // Start with the HomeScreen
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                
            // .padding(innerPadding) // Apply padding from Scaffold if needed for content below AppBar/BottomBar
        ) {
            composable(AppRoutes.HOME) {
                HomeScreen(
                    navController = navController,
                    modifier = Modifier /*.padding(innerPadding)*/
                )
            }
            composable(AppRoutes.TOM_ACCOUNT) {
                TomAccountScreen(modifier = Modifier /*.padding(innerPadding)*/)
            }
            composable(AppRoutes.JERRY_STORE) {
                JerryStore(modifier = Modifier /*.padding(innerPadding)*/)
            }
            composable(AppRoutes.TOM_KITCHEN) {
                TomKitchen(modifier = Modifier /*.padding(innerPadding)*/)
            }
        }
    }
}

object AppRoutes {
    const val HOME = "home"
    const val TOM_ACCOUNT = "tom_account"
    const val JERRY_STORE = "jerry_store"
    const val TOM_KITCHEN = "tom_kitchen"
}

