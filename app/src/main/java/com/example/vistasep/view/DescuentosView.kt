package com.example.vistasep.view

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.vistasep.BotonBar

@Composable
fun DescuentosView(navController: NavHostController) {
    Scaffold( //Ahora haremos una barra de navegacion completa, los topbar, etc.
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){ //llamamos al padding interno, asi no nos muestra errores el scaffold
                DescuentosViewContenido(navController)//Contenido Interno
            }
        },
        bottomBar = { BotonBar(navController) },//llamamos a la barra inferior.
    )
}

@Composable
fun DescuentosViewContenido(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(235, 254, 255))
    ) {

        Row (
            modifier = Modifier.fillMaxWidth()
                .height(80.dp)
                .background(Color(255, 216, 0, 255)),
            verticalAlignment = Alignment.CenterVertically

        ){
            Text(
                text = "Descuentos / Promociones",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(126, 58, 25, 255)

                ),
                modifier = Modifier
                    .fillMaxWidth() // Ajustar el ancho del texto al ancho del Row
                    .align(Alignment.CenterVertically), // Centrado vertical
                textAlign = TextAlign.Center // Centrado horizontal
            )
        }




        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp)
                .padding(16.dp)
            //contentAlignment = Alignment.Center,
            //verticalArrangement = Arrangement.Center
        ) {

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(10.dp))

                    ) {
                        AsyncImage(
                            model = "https://www.peru.travel/contenido/experiencia/imagen/es/67/1.1/visita%20al%20canon%20del%20colca.jpg",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color(12, 66, 114, 107))
                                    .padding(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = null,
                                    modifier = Modifier.size(ButtonDefaults.IconSize)
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .padding(15.dp)
                                .align(Alignment.BottomCenter)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(12, 66, 114, 107))
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Cañon de Colca",
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Place,
                                            contentDescription = null,
                                            modifier = Modifier.size(ButtonDefaults.IconSize)
                                        )
                                        Text(
                                            text = "Arequipa, Lima, Perú",
                                            style = TextStyle(fontSize = 16.sp, color = Color.White),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }
                                }
                                Column {
                                    Text(
                                        text = "Paquete",
                                        style = TextStyle(fontSize = 16.sp, color = Color.White),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Text(
                                            text = "s/.",
                                            style = TextStyle(fontSize = 16.sp),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                            , color = Color.Gray
                                        )
                                        Text(
                                            text = "230",
                                            style = TextStyle(
                                                fontSize = 24.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }

                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                }
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(10.dp))

                    ) {
                        AsyncImage(
                            model = "https://whatatrip.pe/wp-content/uploads/2023/06/miraflores-view.png",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color(12, 66, 114, 107))
                                    .padding(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = null,
                                    modifier = Modifier.size(ButtonDefaults.IconSize)
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .padding(15.dp)
                                .align(Alignment.BottomCenter)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(12, 66, 114, 107))
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Lima",
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Place,
                                            contentDescription = null,
                                            modifier = Modifier.size(ButtonDefaults.IconSize)
                                        )
                                        Text(
                                            text = "Lima, Perú",
                                            style = TextStyle(
                                                fontSize = 16.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }
                                }
                                Column {
                                    Text(
                                        text = "Paquete",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Text(
                                            text = "s/.",
                                            style = TextStyle(fontSize = 16.sp),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                            , color = Color.Gray
                                        )
                                        Text(
                                            text = "150",
                                            style = TextStyle(
                                                fontSize = 24.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }

                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                }
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(10.dp))

                    ) {
                        AsyncImage(
                            model = "https://media.tacdn.com/media/attractions-splice-spp-674x446/06/6b/98/c9.jpg",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color(12, 66, 114, 107))
                                    .padding(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = null,
                                    modifier = Modifier.size(ButtonDefaults.IconSize)
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .padding(15.dp)
                                .align(Alignment.BottomCenter)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(12, 66, 114, 107))
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Machu Picchu",
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Place,
                                            contentDescription = null,
                                            modifier = Modifier.size(ButtonDefaults.IconSize)
                                        )
                                        Text(
                                            text = "Cuzco, Perú",
                                            style = TextStyle(
                                                fontSize = 16.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }
                                }
                                Column {
                                    Text(
                                        text = "Paquete",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Text(
                                            text = "s/.",
                                            style = TextStyle(fontSize = 16.sp),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                            , color = Color.Gray
                                        )
                                        Text(
                                            text = "430",
                                            style = TextStyle(
                                                fontSize = 24.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }

                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                }
                item {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(10.dp))

                    ) {
                        AsyncImage(
                            model = "https://portal.andina.pe/EDPfotografia3/Thumbnail/2022/06/29/000879496W.jpg",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color(12, 66, 114, 107))
                                    .padding(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = null,
                                    modifier = Modifier.size(ButtonDefaults.IconSize)
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .padding(15.dp)
                                .align(Alignment.BottomCenter)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(12, 66, 114, 107))
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Ucayali",
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Icon(
                                            imageVector = Icons.Default.Place,
                                            contentDescription = null,
                                            modifier = Modifier.size(ButtonDefaults.IconSize)
                                        )
                                        Text(
                                            text = "Pucallpa, Perú",
                                            style = TextStyle(
                                                fontSize = 16.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }
                                }
                                Column {
                                    Text(
                                        text = "Paquete",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier
                                        //.padding(bottom = 8.dp)
                                    )
                                    Row {
                                        Text(
                                            text = "s/.",
                                            style = TextStyle(fontSize = 16.sp),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                            , color = Color.Gray
                                        )
                                        Text(
                                            text = "530",
                                            style = TextStyle(
                                                fontSize = 24.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White
                                            ),
                                            modifier = Modifier
                                            //.padding(bottom = 8.dp)
                                        )
                                    }

                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                }

            }

        }
    }
    /*
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()){
            Button(onClick = {
                navController.navigate("p3")
            }) {
                Text(text = "Pantalla11")
            }
        }*/

}

