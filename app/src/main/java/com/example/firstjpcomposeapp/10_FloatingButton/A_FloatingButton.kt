package com.example.firstjpcomposeapp.`10_FloatingButton`

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ExtendedFloatingButton() {
    ExtendedFloatingActionButton(
        onClick = {
            // handle click
        },
        icon = {
            Icon(Icons.Default.Add, contentDescription = "Add")
        },
        text = {
            Text("This is a floating button")
        }
    )
}


@Preview(showSystemUi = true)
@Composable
fun Main(){
    ExtendedFloatingButton()
}