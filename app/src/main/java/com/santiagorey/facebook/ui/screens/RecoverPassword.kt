package com.santiagorey.facebook.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RecoverPasswordScreen() {

    // Guarda lo que el usuario escribe en el campo de correo
    var email by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Título
        Text(
            text = "Recuperar contraseña",
            fontSize = 26.sp
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        // Campo para escribir el correo
        OutlinedTextField(
            value = email,

            onValueChange = {
                email = it
            },

            label = {
                Text("Pon aquí tu correo para recuperar")
            },

            modifier = Modifier.fillMaxWidth(),

            singleLine = true,

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        // Botón
        Button(
            onClick = {
                // Por ahora no hace nada
            },

            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = FacebookBlue
            )
        ) {

            Text(
                text = "Enviar recuperación"
            )
        }
    }
}