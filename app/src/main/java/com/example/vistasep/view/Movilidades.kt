package com.example.vistasep.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun Movilidades(navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        var valor1 by remember { mutableStateOf("") }


        AsyncImage(
            model = "https://img.freepik.com/free-photo/traveler-hiking-mountains-while-having-his-essentials-backpack_23-2149118732.jpg?t=st=1714118012~exp=1714121612~hmac=cf4bda68714108cf2516196472a39e80a39bebb44091a43c1bd833b547f64db0&w=1060",
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(top = 50.dp),
        ){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                //elevation =  8.dp
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Movilidad",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Tipo:",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .width(130.dp)
                        )
                        Text(
                            text = "BUS",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .width(130.dp)
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = valor1,
                            onValueChange = { val1 -> valor1 = val1 },
                            label = { Text(text = "Ingrese la fecha de ida") },
                            placeholder = { Text(text = "DD/MM/AAAA") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Fecha"
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text(text = "Ingrese la fecha de llegada") },
                            placeholder = { Text(text = "DD/MM/AAAA") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Fecha"
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Movilidad",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Tipo:",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .width(130.dp)
                        )
                        Text(
                            text = "MINIVAN",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .width(130.dp)
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text(text = "Ingrese la fecha de ida") },
                            placeholder = { Text(text = "DD/MM/AAAA") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Fecha"
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text(text = "Ingrese la fecha de llegada") },
                            placeholder = { Text(text = "DD/MM/AAAA") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), // Cambiar KeyboardType.Number a KeyboardType.Text


                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Fecha"
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )
                    }
                }
            }

            Button(
                onClick = { navController.navigate("detalle") }, //Nos tiene que mandar a AsientosView
                modifier = Modifier
                    .width(150.dp)
                    .padding(start = 20.dp)
                .background(color = Color(43, 81, 75))
                ,

                ) {
                Text(text = "Siguiente")
            }
        }


    }
}