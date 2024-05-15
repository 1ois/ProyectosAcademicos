package com.example.vistasep.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.vistasep.R


@Composable
fun LoginView(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val backgroundColor = Color(106,57,0)

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(horizontal = 32.dp, vertical = 64.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.caminos),
                contentDescription = "Descripción de la imagen",
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "¡Bienvenido!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text("Usuario:",fontSize = 22.sp, color = Color.White)

                Spacer(modifier = Modifier.width(8.dp))

                TextField(
                    value = username,
                    onValueChange = { newUsername -> username = newUsername },
                    singleLine = true,
                    modifier = Modifier.weight(0.5f)
                        .padding(start = 37 .dp)
                        .height(56.dp)
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Contraseña:",fontSize = 22.sp, color = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = password,
                    onValueChange = { newPassword -> password = newPassword },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    singleLine = true,
                    modifier = Modifier
                        .height(56.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    navController.navigate("reserva")
                },
            ) {
                Text("Iniciar sesión")
            }

        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(32.dp)
        ) {
            TextButton(
                onClick = {
                    navController.navigate("recuperar")
                },
            ) {
                Text("¿Olvidaste tu contraseña?", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(
                onClick = {
                    navController.navigate("registrarse")
                },
            ) {
                Text("Regístrate Aquí", color = Color.White)
            }
        }
    }
}