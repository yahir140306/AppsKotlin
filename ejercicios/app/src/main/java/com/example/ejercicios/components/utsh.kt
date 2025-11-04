package com.example.ejercicios.componentsimport

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.material3.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicios.R
import com.example.ejercicios.components.Contenido
import com.example.ejercicios.components.Espacios

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun UtshPreview() {
    Utsh()
}

@Composable
fun Utsh() {
    var nombre by remember { mutableStateOf("") }
    val context = LocalContext.current
    var follow by remember { mutableStateOf("Seguir") }

    Column(
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.utsh),
                contentDescription = "logo utsh",
            )

            Text(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                text = "UTSH",
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Espacios(10)
                OutlinedTextField(
                    value = nombre,
                    onValueChange = {nombre = it},
                    label = {Text("Buscar usuario")}
                )

                Contenido(nombre,20, TextAlign.Center)
                Espacios(10)

                Espacios(10)
                Image(
                    painter = painterResource(id = R.drawable.persona),
                    contentDescription = "logo persona",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(250.dp)
                        .clip(CircleShape)
                )

                Text(
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Ma. del Carmen \n Guzmán Grez",
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Text(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 15.dp),
                    textDecoration = TextDecoration.Underline,
                    text = "CEO Fundador \n 4°DSM-Solutions"
                )

                Button (
                    onClick = {
                        if (follow == "Seguir") {
                            follow = "Dejar de seguir"
                            Toast.makeText(context, "Lo dejaste de seguir", Toast.LENGTH_SHORT).show()
                            Toast.makeText(context, "Buscar a $nombre", Toast.LENGTH_SHORT).show()

                        } else {
                            follow = "Seguir"
                            Toast.makeText(context, "Lo estas seguiendo", Toast.LENGTH_SHORT).show()
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue
                    )
                ) {
                    Text(text = follow)
                }
            }
        }
    }
}
