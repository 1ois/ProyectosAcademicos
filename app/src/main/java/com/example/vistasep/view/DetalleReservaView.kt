package com.example.vistasep.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vistasep.BotonBar

val AntColor = Color(106, 57, 0)
val Pasajeros = Color(225, 220, 118)
val White = Color.White



@Composable
fun DetalleReservaView(navController: NavHostController) {
    Scaffold( //Ahora haremos una barra de navegacion completa, los topbar, etc.
        topBar = { DetalleSuperior(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){ //llamamos al padding interno, asi no nos muestra errores el scaffold
                DetalleDeReservaPantalla(navController)//Contenido Interno
            }
        },
        bottomBar = { BotonBar(navController) },//llamamos a la barra inferior.
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetalleSuperior(navController: NavHostController) {
    val backgroundColor = Color(106, 57, 0)
    TopAppBar(//Aquí empezaremos a diseñar. Aca tmb importamos lo del opt
        colors = TopAppBarDefaults.topAppBarColors(//para colorear el fondo
            containerColor = backgroundColor, //coloreamos el fondo del top bar
            titleContentColor = MaterialTheme.colorScheme.surface //coloreamos el texto del titulo(el contenido de title)
        ),
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(), // Aseguramos que la fila tome todo el ancho disponible
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Distribuye los elementos uniformemente
            ) {
                IconButton(onClick = { navController.navigate("movilidad") }) { // Botón para volver atrás
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Volver")
                }
                Text("DETALLE DE RESERVA"
                    , fontSize = 28.sp
                    , fontWeight = FontWeight.Bold
                    ,color= Color.Yellow
                ) // El texto que queremos centrar
                Spacer(Modifier.size(48.dp)) // Un espaciador del mismo tamaño que el IconButton
            }
        },
    )
}

@Composable
fun DetalleDeReservaPantalla(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AntColor)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(bottom = 56.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))



            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = White, fontSize = 21.sp)) {
                        append("Fecha de ida: ")
                    }
                    withStyle(style = SpanStyle(color = Pasajeros, fontSize = 21.sp)) {
                        append("          21/05/2025")
                    }
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = White, fontSize = 21.sp)) {
                        append("Horario: ")
                    }
                    withStyle(style = SpanStyle(color = Pasajeros, fontSize = 21.sp)) {
                        append("                        10:30 PM")
                    }
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = White, fontSize = 21.sp)) {
                        append("Numero de Asientos ")
                    }
                    withStyle(style = SpanStyle(color = Pasajeros, fontSize = 21.sp)) {
                        append("              45")
                    }
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = White, fontSize = 21.sp)) {
                        append("Informacion de los Pasajeros:  ")
                    }
                }
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text("José Rodríguez", fontSize = 21.sp, color = Pasajeros)
            Text("Marco Altamirano", fontSize = 21.sp, color = Pasajeros)

            Spacer(modifier = Modifier.height(80.dp))

            Text("Importe Total: " +
                    "S/70.0", fontSize = 24.sp, color = White)
            Spacer(modifier = Modifier.height(70.dp))

            Button(
                onClick = { navController.navigate("elige") },
                modifier = Modifier
                    .width(200.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 8.dp)
            ) {
                Text("SIGUIENTE")
            }

            Spacer(modifier = Modifier.height(120.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Previous", color = Color.White)
                Text("2/3", color = Color.White)
                Text("Next", color = Color.White)
            }
        }
    }
}

