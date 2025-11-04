package com.example.myfirstapp.Layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview()
@Composable
fun MyLayout() {
    MyLayouts()
}

@Composable
fun MyLayouts() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)

    ) {
        Row {
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .height(120.dp)
                    //.width(120.dp)
                    //.fillMaxWidth()
            )
            {
                Text(
                    text = "Soy una caja roja"
                )
            }
            Box(
                modifier = Modifier
                    .background(Color.Yellow)
                    .height(120.dp)
                    //.width(120.dp)
                    //.fillMaxWidth()
            )
            {
                Text(
                    text = "Soy una caja amarilla"
                )
            }
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .height(120.dp)
                    //.width(120.dp)
                    //.fillMaxWidth()
            )
            {
                Text(
                    text = "Soy una caja Blue"
                )
            }
        }
    }
}
