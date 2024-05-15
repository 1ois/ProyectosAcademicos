package com.example.vistasep.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vistasep.R

@Composable
fun YapeView(navController: NavHostController) {
    Scaffold(
        topBar = { yapeSuperior(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){
                yapeContenido(navController)
            }
        },
        bottomBar = { yapeInferior(navController)},
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun yapeSuperior(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = backgroundColor,
            titleContentColor = MaterialTheme.colorScheme.surface
        ),
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { navController.navigate("elige") }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Volver")
                }
                Text("YAPE"
                    , fontSize = 56.sp
                    , fontWeight = FontWeight.Bold
                    ,color= Color.White
                )
                Spacer(Modifier.size(48.dp))
            }
        },
    )
}


@Composable
fun yapeContenido(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)
    Box(
        contentAlignment = Alignment.Center,
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

        Image(
            painter = painterResource(id = R.drawable.qr),
            contentDescription = "Descripción de la imagen",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.Center)
        )

        Button(
            onClick = { navController.navigate("Rexitosa") },
            modifier = Modifier.padding(32.dp).width(150.dp).height(50.dp).align(Alignment.BottomCenter)
        ) {
            Text("Siguiente", color = Color.White, fontSize = 20.sp)
        }

    }
}

@Composable
fun yapeInferior(navController: NavHostController) {
    BottomAppBar()
    {
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            val iconSize = 50.dp

            IconButton(onClick = { navController.navigate("reserva") }) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Localized description",
                    modifier = Modifier
                        .size(iconSize)
                )

            }
            IconButton(onClick = { navController.navigate("ruta") }) {
                Icon(
                    Icons.Filled.LocationOn,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(iconSize)
                )

            }
            IconButton(onClick = { navController.navigate("metodos") }) {
                Icon(
                    Icons.Filled.ShoppingCart,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(iconSize)
                )

            }
            IconButton(onClick = { navController.navigate("descuento") }) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(iconSize)
                )
            }
        }
    }
}