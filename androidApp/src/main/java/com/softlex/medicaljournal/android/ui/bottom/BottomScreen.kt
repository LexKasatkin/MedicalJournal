package com.softlex.medicaljournal.android.ui.bottom

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.softlex.medicaljournal.android.ui.BottomBar
import com.softlex.medicaljournal.android.ui.theme.colorContentSecondary

//private lateinit var selected: MutableState<RWEntry>

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomScreen() {

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Home,
        BottomNavigationScreens.Bookmark,
        BottomNavigationScreens.Latest,
        BottomNavigationScreens.Search
    )

    val navController = rememberNavController()
    navController.enableOnBackPressed(false)

    val coroutineScope = rememberCoroutineScope()
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberBottomSheetState(
            initialValue = BottomSheetValue.Collapsed
        )
    )

//    selected = remember { mutableStateOf(RWEntry()) }

    BottomSheetScaffold(
        sheetContent = {
//            HomeSheetContent(
//                coroutineScope = coroutineScope,
//                bottomSheetScaffoldState = bottomSheetScaffoldState,
//                item = selected,
//                onUpdateBookmarkdateBookmark = onUpdateBookmark,
//                onShareAsLink = onShareAsLink
//            )
        },
        sheetShape = RoundedCornerShape(
            topStart = 16.dp,
            topEnd = 16.dp
        ),
        sheetBackgroundColor = colorContentSecondary,
        scaffoldState = bottomSheetScaffoldState, sheetPeekHeight = 0.dp
    ) {

        Scaffold(
            topBar = {
//                MainTopAppBar()
            },
            bottomBar = {
                BottomBar(
                    navController = navController,
                    items = bottomNavigationItems
                )
            },
            content = { Text(text = it.toString()) }
        )
//            content = {
//                MainContent(
//                    navController = navController,
//                    coroutineScope = coroutineScope,
//                    bottomSheetScaffoldState = bottomSheetScaffoldState,
//                    selected = selected,
//                    feeds = feeds,
//                    bookmarks = bookmarks,
//                    onOpenEntry = onOpenEntry
//                )
//            }
    }
}