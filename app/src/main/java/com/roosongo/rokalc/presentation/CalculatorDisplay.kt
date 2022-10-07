package com.roosongo.rokalc.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorDisplay(
    expression: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        BasicTextField(
            value = expression, onValueChange = {},
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 80.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onSecondaryContainer,

                ),
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1
        )
    }
}