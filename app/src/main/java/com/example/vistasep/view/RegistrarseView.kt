package com.example.vistasep.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun RegistrarseView(navController: NavHostController) {
    Scaffold(
        topBar = { SuperiorRegistrarse(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){
                ContenidoRegistrarse(navController)
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperiorRegistrarse(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = backgroundColor,
            titleContentColor = MaterialTheme.colorScheme.surface
        ),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { navController.navigate("login")}) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
            }
        },
    )
}

@Composable
fun ContenidoRegistrarse(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    val backgroundColor = Color(106, 57, 0)

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
            Text(
                text = "Regístrate",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Ingrese su correo electrónico",
                color = Color.White
            )
            TextField(
                value = email,
                onValueChange = { newEmail -> email = newEmail },
                placeholder = { Text("Correo electrónico") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Ingrese una contraseña",
                color = Color.White
            )
            TextField(
                value = password,
                onValueChange = { newPassword -> password = newPassword },
                placeholder = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Confirmar Contraseña",
                color = Color.White
            )
            TextField(
                value = confirmPassword,
                onValueChange = { newConfirmPassword -> confirmPassword = newConfirmPassword },
                placeholder = { Text("Confirmar contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    //al dar click, se crearia un nuevo usuario
                    //pero por ahora, solo vuelve a la vista anterior
                    navController.popBackStack()
                },
            ) {
                Text("Registrarse")
            }
        }
    }
}
