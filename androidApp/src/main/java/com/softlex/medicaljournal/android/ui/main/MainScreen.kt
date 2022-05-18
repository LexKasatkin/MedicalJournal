package com.softlex.medicaljournal.android.ui.main

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.softlex.medicaljournal.android.ui.LoginScreen
import com.softlex.medicaljournal.android.ui.bottom.BottomScreen


@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = MainNavigationScreens.Login.route) {
        composable(MainNavigationScreens.Login.route) {
            LoginScreen()
        }
        composable(MainNavigationScreens.Bottom.route) {
            BottomScreen()
        }
    }
    Button(onClick = {
        if (navController.currentDestination?.route == MainNavigationScreens.Login.route)
            navController.navigate(MainNavigationScreens.Bottom.route)
        else
            navController.navigate(MainNavigationScreens.Login.route)

    }) {
        Text(text = "Bottom")
    }
}