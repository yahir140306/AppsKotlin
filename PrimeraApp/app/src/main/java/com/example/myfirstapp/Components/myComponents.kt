package com.example.myfirstapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)

@Composable
fun MyComponentPreview() {
    MyComponent("Laura")
}


@Composable
fun MyComponent(nombre: String) {
    Text(
        text = "Saludos $nombre",
        modifier = Modifier
            .padding(top = 200.dp)
            .fillMaxWidth()
            .background(Color.Red),
        letterSpacing = 12.sp,
        fontSize = 30.sp,
        textAlign = TextAlign.Center

    )
}