package com.example.firstjpcomposeapp.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

//Filled Button




@Composable
fun FilledButtonSample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val context = LocalContext.current
        Button(
            onClick = {
                Toast.makeText(context,"Button is clicked",Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Filled Button")
        }
    }
}





@Preview(showSystemUi = true)
@Composable
fun PreviewFilled(){
    FilledButtonSample()
}
