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
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.vistasep.BotonBar
import com.example.vistasep.R

@Composable
fun ReservaView(navController: NavHostController) {
    Scaffold(
        topBar = { miBarraSuperior(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){
                miContenido(navController)
            }
        },
        bottomBar = { BotonBar(navController) },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun miBarraSuperior(navController: NavHostController) {
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
fun miContenido(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Image(
            painter = painterResource(id = R.drawable.caminos),
            contentDescription = "Descripción de la imagen",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(400.dp)
                .align(Alignment.Center)
                .alpha(0.3f)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(horizontal = 32.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Reservar Viaje", fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            val labels = listOf("Origen:", "Destino:", "Fecha:")
            labels.forEach { label ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = label,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.width(100.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .weight(1f)
                            .height(56.dp),
                        singleLine = true
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

            Button(
                onClick = {
                    navController.navigate("movilidad")
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Reservar")
            }

            Text("Viajes Reservados",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier.align(Alignment.Start))

            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Viajes Recientes",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.cusco),
                    contentDescription = "Viaje 1",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(80.dp))
                Image(
                    painter = painterResource(id = R.drawable.lima),
                    contentDescription = "Viaje 2",
                    modifier = Modifier.size(100.dp)
                )
            }
        }
    }
}

