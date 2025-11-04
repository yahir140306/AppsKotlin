package com.example.ejercicios.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun LitrosLechePreview() {
    LitrosLeche()
}

@Composable
fun LitrosLeche() {
    var cantidadLitros by remember { mutableStateOf("") }
    var precioGalon by remember { mutableStateOf("") }
    var totalGalones by remember { mutableStateOf(0.0) }
    var totalPago by remember { mutableStateOf(0.0) }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Titulos("Litros de Leche")
        Espacios(20)
        OutlinedTextField(
            value = cantidadLitros,
            onValueChange = { cantidadLitros = it },
            label = { Text("Ingrese cantidad de litros") }
        )
        Espacios(10)
        OutlinedTextField(
            value = precioGalon,
            onValueChange = { precioGalon = it },
            label = { Text("Ingrese cantidad del precio ") }
        )
        Espacios(10)

        Button(
            onClick = {
                val litros = cantidadLitros.toDoubleOrNull() ?: 0.0
                val precio = precioGalon.toDoubleOrNull() ?: 0.0
                totalGalones = litros / 3.785
                totalPago = totalGalones * precio
            }
        ) {
            Text("Calcular")
        }

        Espacios(20)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Contenido("Litros: ", 18 , TextAlign.Left)
                Contenido(cantidadLitros, 18, TextAlign.Left)
            }
            Espacios(8)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Contenido("Galones: ", 18 , TextAlign.Left)
                Contenido(totalGalones.toString(), 18, TextAlign.Left)
            }
            Espacios(8)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Contenido("Precio Galón: ", 18 , TextAlign.Left)
                Contenido(precioGalon, 18, TextAlign.Left)
            }
            Espacios(8)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Contenido("Total a Pagar: ", 18 , TextAlign.Left)
                Contenido(totalPago.toString(), 22, TextAlign.Left)
            }
            Espacios(8)
        }

    }
}
