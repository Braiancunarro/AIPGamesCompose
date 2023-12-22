package com.aristidevs.aipgamescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aristidevs.aipgamescompose.ui.theme.AIPGamesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AIPGamesComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}


@Composable
fun app() {
    fondo()
}

@Composable
fun fondo() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.canchafutbolfondo),
            contentDescription = "fondo",
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )

        Formacion433()

    }
}

@Composable
fun Formacion442() {
    LazyColumn() {
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }

        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 85.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )


            }
        }
    }
}

@Composable
fun Formacion433() {
    LazyColumn() {
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }

        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )


            }
        }
        item { Spacer(modifier = Modifier.height(100.dp)) }
        item {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(32.dp))
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )


            }
        }
    }
}

@Preview
@Composable
fun fondoletras() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.cesped),
            contentDescription = "cesped",
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
    }
    tresletras()
}

@Composable
fun tresletras() {
    LazyColumn() {
        item {
            Box(
                modifier = Modifier.fillMaxSize().padding(start = 20.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "El Jugador contiene 3 letras",
                    color = Color.White,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
    }
}