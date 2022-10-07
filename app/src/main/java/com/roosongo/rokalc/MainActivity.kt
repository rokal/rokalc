package com.roosongo.rokalc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.roosongo.rokalc.presentation.CalculatorScreen
import com.roosongo.rokalc.ui.theme.RokalcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Constants.BASE_URL
        setContent {
            RokalcTheme {
                CalculatorScreen()
            }
        }
    }
}


