package com.example.firstjpcomposeapp.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable

//Modifiers are available in all composables for e.g: Text, button, image, column, row etc
fun ModifierExample(){
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.Black),
        contentAlignment = Alignment.Center
    ){
        Box(
            //modifier = Modifier.fillMaxSize().background(color = Color.Blue)
            modifier = Modifier.size(300.dp,300.dp).background(color = Color.White),
            contentAlignment = Alignment.Center

        ) {
            Text("This is the text", modifier = Modifier.size(100.dp))
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun ShowMain(){
    ModifierExample()
}


