package com.softlex.medicaljournal.android.ui.main

import androidx.annotation.StringRes
import com.softlex.medicaljournal.android.R

sealed class MainNavigationScreens(
    val route: String,
    @StringRes val stringResId: Int,
) {

    object Login : MainNavigationScreens("Login", R.string.navigation_login)

    object Bottom : MainNavigationScreens("Bottom", R.string.navigation_bottom)
}