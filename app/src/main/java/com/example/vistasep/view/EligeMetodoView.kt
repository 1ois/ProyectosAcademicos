 package com.example.vistasep.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.ButtonDefaults
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
import com.example.vistasep.BotonBar
import com.example.vistasep.R

@Composable
fun EligeMetodoView(navController: NavHostController) {
    Scaffold( //Ahora haremos una barra de navegacion completa, los topbar, etc.
        topBar = { EligeSuperior(navController) },
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){ //llamamos al padding interno, asi no nos muestra errores el scaffold
                EligeContenido(navController)//Contenido Interno
            }
        },
        bottomBar = { BotonBar(navController) },//llamamos a la barra inferior.
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EligeSuperior(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0) // Un color oscuro para el fondo
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = backgroundColor, // Coloreamos el fondo del top bar
            titleContentColor = MaterialTheme.colorScheme.surface // Coloreamos el texto del título
        ),
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(), // Aseguramos que la fila tome todo el ancho disponible
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Distribuye los elementos uniformemente
            ) {
                IconButton(onClick = { navController.navigate("detalle") }) { // Botón para volver atrás
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Volver")
                }
                Text("Método de Pago"
                    , fontSize = 25.sp
                    , fontWeight = FontWeight.Bold
                    ,color= Color(225, 171, 7)
                ) // El texto que queremos centrar
                Spacer(Modifier.size(48.dp)) // Un espaciador del mismo tamaño que el IconButton
            }
        }
    )
}



@Composable
fun EligeContenido(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        val tranparente= ButtonDefaults.buttonColors(Color.White.copy(0.5f))
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
            modifier = Modifier.padding(horizontal = 32.dp, vertical = 64.dp)
        ) {
            Button(
                onClick = { navController.navigate("metodos") },
                modifier = Modifier.padding(32.dp).width(150.dp).height(50.dp)
                ,colors = tranparente
            ) {
                Text("TARJETA", color = Color.White, fontSize = 20.sp)
            }
            Button(
                onClick = { navController.navigate("yape") },
                modifier = Modifier.padding(32.dp).width(150.dp).height(50.dp)
                ,colors = tranparente
            ) {
                Text("YAPE", color = Color.White, fontSize = 20.sp)
            }
            Button(
                onClick = { navController.navigate("plin") },
                modifier = Modifier.padding(32.dp).width(150.dp).height(50.dp)
                ,colors = tranparente
            ) {
                Text("PLIN", color = Color.White, fontSize = 20.sp)
            }
        }
    }
}

