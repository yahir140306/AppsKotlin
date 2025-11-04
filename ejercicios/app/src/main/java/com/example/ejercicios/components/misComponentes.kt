package com.example.ejercicios.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Text (
// textAlign = TextAlign.Center
// modifier = Modifier.fillMaxSize
// )

@Composable
fun Titulos(text: String) {
    Text(
        text = text,
        fontSize = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth().padding(40.dp)
    )
}

@Composable
fun Contenido(text: String, size: Int, align: TextAlign) {
    Text(
        text = text,
        fontSize = size.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = align,
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    )
}

@Composable
fun Espacios(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}