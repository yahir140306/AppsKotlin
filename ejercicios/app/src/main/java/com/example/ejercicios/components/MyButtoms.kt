package com.example.ejercicios.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicios.R

@Composable
fun MyButtons() {
    var nombre by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column (
        modifier = Modifier.padding(30.dp)
    ) {
        Titulos("My Buttons")
        Espacios(30)
        Image(
            painter = painterResource(id = R.drawable.utsh),
            contentDescription = "logo utsh"
        )
        Espacios(40)
        Contenido(
            "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    20, TextAlign.Center
        )
        Espacios(40)
        Titulos("Example")
        Espacios(20)
        Contenido(
            "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            22, TextAlign.Justify
        )
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {Text("Escribe tu nombre")}
        )

        Espacios(22)
        TextField(
            value = nombre,
            onValueChange = {nombre=it},
            placeholder = {Text(text = "Ingresa tu nombre")}
        )

        Contenido(nombre,20, TextAlign.Center)

        Button(onClick={
            Toast.makeText(context, "Le diste clic", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Button")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MyButtonsPreview() {
    MyButtons()
}