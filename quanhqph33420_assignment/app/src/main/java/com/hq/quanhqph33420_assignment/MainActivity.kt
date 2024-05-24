package com.hq.quanhqph33420_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hq.quanhqph33420_assignment.screens.AssignmentApp
import com.hq.quanhqph33420_assignment.ui.theme.Quanhqph33420_assignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quanhqph33420_assignmentTheme {
                AssignmentApp()
            }
        }
    }
}