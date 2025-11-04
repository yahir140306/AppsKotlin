package com.example.myfirstapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.R

@Composable
fun App() {
    var contador by rememberSaveable { mutableStateOf(0) }

    LazyColumn(
        modifier = Modifier
            .padding(top = 35.dp, start = 20.dp, end = 20.dp)
            .fillMaxSize()
    ) {
        item {
            Text(
                text = "Mi App",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Green),
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )

            Image(
                painter = painterResource(id = R.drawable.goku),
                contentDescription = "Goku",
                modifier = Modifier.padding(top = 25.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.outline_1k_plus_24),
                    contentDescription = "Likes",
                    modifier = Modifier.clickable { contador++ }
                )
                Image(
                    painter = painterResource(id = R.drawable.sharp_heart_broken_24),
                    contentDescription = "Likes",
                    modifier = Modifier.clickable { contador-- }
                )
                Text(
                    text = contador.toString(),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(text = "Mi App", modifier = Modifier.background(Color.Red))
            Text(text = "Mi App")
            Text(text = "Mi App")
            Text(text = "Mi App")
            Text(text = "Mi App")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}
