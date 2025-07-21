package com.example.firstjpcomposeapp.`3_CoreComponents`

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun SimpleOutlinedTextField() {
    var text by remember {
        mutableStateOf("")
    }
}

