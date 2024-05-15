package com.example.vistasep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vistasep.ui.theme.VistasEPTheme
import com.example.vistasep.view.AsientosView
import com.example.vistasep.view.CuentaView
import com.example.vistasep.view.DescuentosView
import com.example.vistasep.view.DetalleReservaView
import com.example.vistasep.view.EligeMetodoView
import com.example.vistasep.view.LoginView
import com.example.vistasep.view.MetododePago
import com.example.vistasep.view.Movilidades
import com.example.vistasep.view.PlinView
import com.example.vistasep.view.RecuperarContraView

import com.example.vistasep.view.RegistrarseView
import com.example.vistasep.view.ReservaExitosaView
import com.example.vistasep.view.ReservaView
import com.example.vistasep.view.RutasView
import com.example.vistasep.view.YapeView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VistasEPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //controller
                    val navController = rememberNavController( )
                    NavHost(navController = navController, startDestination = "login") {//aca indicamos la vista de arranque como string, cualquier nombre no cambia nada
                        composable("login") { LoginView(navController) }
                        composable("recuperar") { RecuperarContraView(navController) }
                        composable("registrarse") { RegistrarseView(navController) }
                        composable("reserva") { ReservaView(navController) }
                        composable("Rexitosa") { ReservaExitosaView(navController) }
                        composable("movilidad") { Movilidades(navController) }
                        composable("descuento") { DescuentosView(navController) }
                        composable("metodos") { MetododePago(navController) }
                        composable("ruta") { RutasView(navController) }
                        composable("detalle") { DetalleReservaView(navController) }
                        composable("elige") { EligeMetodoView(navController) }
                        composable("yape") { YapeView(navController) }
                        composable("plin") { PlinView(navController) }
                        composable("cuenta") { CuentaView(navController) }
                        composable("asientos") { AsientosView(navController) }
                    }
                }
            }
        }
    }
}
@Composable
fun BotonBar(navController: NavHostController) {
    BottomAppBar()
    {
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {

            val iconSize = 50.dp

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
            IconButton(onClick = { navController.navigate("cuenta") }) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(iconSize)
                )

            }

        }
    }
}

@Composable
fun FondoCaminosInca() {
    Box(modifier = Modifier.fillMaxSize().background(Color(106, 57, 0))) {
        Image(
            painter = painterResource(id = R.drawable.caminos),
            contentDescription = "Descripción de la imagen",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(400.dp)
                .align(Alignment.Center)
            // .alpha(0.1f)
        )
    }
}