package com.softlex.medicaljournal.android.ui.bottom

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.softlex.medicaljournal.android.R

sealed class BottomNavigationScreens(
    val route: String,
    @StringRes val stringResId: Int,
    @DrawableRes val drawResId: Int
) {

    object Home : BottomNavigationScreens("Home", R.string.navigation_home, android.R.drawable.ic_menu_always_landscape_portrait)

    object Bookmark :
        BottomNavigationScreens("Bookmark", R.string.navigation_bookmark, android.R.drawable.ic_menu_always_landscape_portrait)

    object Latest :
        BottomNavigationScreens("Latest", R.string.navigation_latest, android.R.drawable.ic_menu_always_landscape_portrait)

    object Search :
        BottomNavigationScreens("Search", R.string.navigation_search, android.R.drawable.ic_menu_always_landscape_portrait)
}