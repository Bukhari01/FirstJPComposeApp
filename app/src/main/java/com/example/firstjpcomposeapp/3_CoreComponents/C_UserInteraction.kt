package com.example.firstjpcomposeapp.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartiallySelectable() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {
            Column {
                Text("This is a selectable text")
                Text("This is second Text")
                Text("This is the third Text")
                DisableSelection {
                    Text("But not this text")
                    Text("this is not selectable")
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewPartial() {
    PartiallySelectable()
}