package com.example.firstjpcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstjpcomposeapp.`2_FundamentalConcepts`.AccessStringResource
import com.example.firstjpcomposeapp.`2_FundamentalConcepts`.Greeting
import com.example.firstjpcomposeapp.`3_CoreComponents`.PartiallySelectable
import com.example.firstjpcomposeapp.`5_BottomSheet`.PartialBottomSheet
import com.example.firstjpcomposeapp.ui.theme.FirstJPComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstJPComposeAppTheme {
                PartialBottomSheet()

            }
        }
    }
}

