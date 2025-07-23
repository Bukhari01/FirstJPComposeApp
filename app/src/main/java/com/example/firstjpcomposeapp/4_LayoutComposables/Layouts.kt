package com.example.firstjpcomposeapp.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//Column allows you to place its children in a vertical sequence.

@Composable
fun ColumnExample() {
        Column(
            modifier = Modifier.fillMaxWidth().background(Color.Green).padding(30.dp),
            //horizontalAlignment = Alignment.End
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text("Hello 1")
            Text("Hello 2")
            Text("Hello 3")
            Text("Hello 4")
            Text("Hello 5")
        }
    }




@Preview(showSystemUi = true)
@Composable
fun Show(){
    ColumnExample()
}
