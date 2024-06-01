package com.hq.quanhqph33420_lab6.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hq.quanhqph33420_lab6.model.Seat
import com.hq.quanhqph33420_lab6.model.SeatStatus

@Preview
@Composable
fun PreviewSeat() {
    Row {
        SeatComposable(Seat('X', 1, SeatStatus.EMPTY))
        SeatComposable(Seat('Y', 1, SeatStatus.SELECTED))
        SeatComposable(Seat('Z', 1, SeatStatus.BOOKED))
    }
}