package com.softlex.medicaljournal.android.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.softlex.medicaljournal.android.R

private val fontSizeLarge = 23.sp
private val fontSizeMedium = 19.sp
private val fontSizeMediumSmall = 17.sp
private val fontSizeBigSmall = 16.sp
private val fontSizeSmall = 15.sp
private val fontSizeExtraSmall = 14.sp
private val fontSizeTiny = 12.sp

val Typography = Typography(
    h1 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Bold,
        fontSize = fontSizeSmall
    ),

    h2 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Normal,
        fontSize = fontSizeExtraSmall
    ),

    h3 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Bold,
        fontSize = fontSizeTiny
    ),

    h4 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Bold,
        fontSize = fontSizeMedium
    ),

    body1 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Normal,
        fontSize = fontSizeBigSmall
    ),

    body2 = TextStyle(
        color = colorAccent,
        fontWeight = FontWeight.Bold,
        fontSize = fontSizeExtraSmall
    ),

    subtitle1 = TextStyle(
        color = colorPrimary,
        fontSize = fontSizeExtraSmall
    ),

    subtitle2 = TextStyle(
        color = colorPrimary,
        fontSize = fontSizeExtraSmall
    )
)