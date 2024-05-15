package com.example.vistasep.view


import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun RutasView(navController:NavHostController) {
    Scaffold(
        //topBar = { Tollbar()},
        bottomBar = {

            BottomAppBar()
            {
                Row(horizontalArrangement = Arrangement.SpaceEvenly, // Alinea los elementos de manera uniforme
                    modifier = Modifier.fillMaxWidth()) {


                    val iconSize = 50.dp // Tamaño de los iconos


                    //boton1
                    IconButton(onClick = { navController.navigate("reserva") }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                            modifier = Modifier
                                .size(iconSize)
                        )

                    }
                    //boton2
                    IconButton(onClick = { navController.navigate("ruta") }) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }
                    //boton3
                    IconButton(onClick = { navController.navigate("descuento") }) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }
                    //boton4
                    IconButton(onClick = { navController.navigate("metodos") }) {
                        Icon(
                            Icons.Filled.AccountCircle,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }

                }
            }


        },
        //el contenedor dentro
        content = { imagen2(navController)}
    )


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun imagen2(navController:NavHostController){
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)){
        Column{
            Box(contentAlignment = Alignment.Center,modifier= Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(26.dp)
                .clip(RoundedCornerShape(20.dp))

                .border(4.dp, Color.Black, RoundedCornerShape(20.dp))
                //.background(Color.Gray)
            ){

                Column {
                    Spacer(modifier = Modifier.size(10.dp))
                    //la parte top del primer cuadrado
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(
                            model = "https://img.freepik.com/foto-gratis/hermosa-escena-dibujos-animados-personajes-anime_23-2151035157.jpg?size=626&ext=jpg&ga=GA1.1.672697106.1715126400&semt=sph",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier= Modifier
                                .size(70.dp)
                                .border(2.dp, Color.Black, RoundedCornerShape(30.dp))
                                .clip(RoundedCornerShape(30.dp))

                        )
                        Text("Tus paraderos disponibles son",color= Color.Black, fontSize =10.sp, modifier = Modifier.padding(start = 10.dp))
                    }





                    //texfiel dentro del cuadro
                    var Desde by remember{ mutableStateOf("") }
                    var Hasta by remember{ mutableStateOf("") }

                    OutlinedTextField(value = Desde,
                        onValueChange = { newDesde -> Desde = newDesde }
                        , label = { Text("Desde:")},
                        placeholder = { Text("Ingrese el Lugar de origen  ")},
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Place,contentDescription = null) }
                        , keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Text))



                    Spacer(modifier = Modifier.size(20.dp))

                    OutlinedTextField(value = Hasta
                        , onValueChange = {newHasta ->Hasta =newHasta}
                        ,label={ Text("Hasta:")}
                        , placeholder = { Text("Ingrese un lugar de destino")}
                        ,  leadingIcon ={Icon(imageVector = Icons.Default.Place,contentDescription = null)}
                        , keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Text))
                    //,modifier=Modifier.padding(start=10.dp)





                    Spacer(modifier = Modifier.size(5.dp))

                    //boton
                    Button(onClick ={navController.navigate("main")},
                        shape = RoundedCornerShape(0.dp)
                        , modifier = Modifier.align(Alignment.End)
                    ) {
                        Text("Buscar")

                    }



                }
            }
            Box(contentAlignment = Alignment.TopCenter,modifier = Modifier.fillMaxSize().padding(26.dp)){

                //inicio
                var IntrudicirText by remember { mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = IntrudicirText,
                    onValueChange = { newText -> IntrudicirText = newText },
                    readOnly = true,
                    label = { Text("  Este TextField no mostrará el dato") },
                    modifier=Modifier.height(300.dp).fillMaxWidth()
                )

                //finlal


            }


        }

    }

}