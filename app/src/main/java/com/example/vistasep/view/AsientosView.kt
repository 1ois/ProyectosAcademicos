package com.example.vistasep.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vistasep.BotonBar
import com.example.vistasep.R

@Composable
fun AsientosView (navController: NavHostController) {
    Scaffold(
        topBar = { IconoDeNavegacion(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){
                AsientosContenido(navController)
            }
        },
        bottomBar = { BotonBar(navController) },
    )
}

@Composable
fun AsientosContenido(navController: NavHostController){
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
    }

    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.Transparent
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF8B4513)),
            contentAlignment = Alignment.TopCenter){

            Box(modifier = Modifier
                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                .height(200.dp)
                .width(350.dp)
                .border(BorderStroke(1.dp, Color.Gray), shape = RoundedCornerShape(8.dp))
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Precio: S/.35", style = TextStyle(color = Color.LightGray, fontSize = 35.sp, fontWeight = FontWeight.Bold),
                    )
                    Row {
                        Column() {
                            Box(modifier = Modifier
                                .size(40.dp)
                                .background(Color.White, shape = CircleShape)
                            )
                            Spacer(modifier = Modifier.size(5.dp))
                            Box(modifier = Modifier
                                .size(40.dp)
                                .background(Color.Black, shape = CircleShape)

                            ){
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = "Clear",
                                    tint = Color(0xFF8B4513), // Color del icono
                                    modifier = Modifier
                                        .size(30.dp) // Tamaño del icono
                                        .align(Alignment.Center)
                                )
                            }
                            Spacer(modifier = Modifier.size(5.dp))
                            Box(modifier = Modifier
                                .size(40.dp)
                                .background(Color.Black, shape = CircleShape)
                            ){
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = "Check",
                                    tint = Color(0xFF8B4513), // Color del icono
                                    modifier = Modifier
                                        .size(30.dp) // Tamaño del icono
                                        .align(Alignment.Center)
                                )
                            }
                        }
                        Column() {
                            Text(text = "Disponible", style = TextStyle(color = Color.LightGray, fontSize = 30.sp, fontWeight = FontWeight.Bold),
                                modifier = Modifier.padding(start = 50.dp)
                            )
                            Spacer(modifier = Modifier.size(5.dp))
                            Text(text = "Ocupado", style = TextStyle(color = Color.LightGray, fontSize = 30.sp, fontWeight = FontWeight.Bold),
                                modifier = Modifier.padding(start = 50.dp)
                            )
                            Spacer(modifier = Modifier.size(5.dp))
                            Text(text = "Tu asiento", style = TextStyle(color = Color.LightGray, fontSize = 30.sp, fontWeight = FontWeight.Bold),
                                modifier = Modifier.padding(start = 50.dp)
                            )
                        }
                    }

                }

            }

            Row(modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 70.dp)) {
                Column(modifier = Modifier.padding(end = 10.dp)) {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                }
                Column {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                }
                Spacer(modifier = Modifier.size(80.dp))
                Column(modifier = Modifier.padding(end = 10.dp)) {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                }
                Column {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .background(Color.White, shape = CircleShape)
                    )
                }
            }

            Box(modifier = Modifier
                .background(Color.Transparent)
                .align(Alignment.BottomEnd)
                .padding(bottom = 75.dp)
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Clear",
                    tint = Color(0xFFFFFFFF), // Color del icono
                    modifier = Modifier
                        .size(110.dp) // Tamaño del icono
                        .align(Alignment.Center)

                )
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconoDeNavegacion(navController: NavHostController) {

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

