package com.hq.quanhqph33420_lab6.screens

import androidx.compose.runtime.Composable

@Composable
fun Bai2() {
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}