package com.tutorial.musicstreamingapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorial.musicstreamingapp.model.albulm

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        //HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxSize()
                .background(color = Color.Black)

        ) {
            Spacer(modifier = Modifier.width(10.dp))
            val PersonAcc = Image(
                painter = painterResource(id = R.drawable.account), contentDescription = null
            )
            Spacer(modifier = Modifier.width(140.dp))
            val AppLogo = Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(110.dp))
            val AppMenu = Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier
                .height(600.dp)
        ) {
            Column(
                modifier = Modifier
                    .width(325.dp)

            ) {
                Text(text = "songTitle" , modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 20.sp)
                Row(
                    modifier = Modifier
                        .height(300.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.naruto),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )

                }
                Row(modifier = Modifier.height(200.dp)) {
                    Column(modifier = Modifier.width(108.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.aot),
                            contentDescription = null
                        )

                    }

                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.ha),
                            contentDescription = null
                        )

                    }
                    Image(
                        painter = painterResource(id = R.drawable.miles),
                        contentDescription = null
                    )

                }
                Image(
                    painter = painterResource(id = R.drawable.naruto),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column (modifier = Modifier
                .fillMaxWidth(1f)
                .background(color = Color.Black)){
                Spacer(modifier = Modifier.height(50.dp))
                Row (){
                    val shuffle = Image(painter = painterResource(id = R.drawable.shuffle),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val previous = Image(painter = painterResource(id = R.drawable.previous),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val play = Image(painter = painterResource(id = R.drawable.play),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val next = Image(painter = painterResource(id = R.drawable.next),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(50.dp))
                Row (){
                    val artist = Image(painter = painterResource(id = R.drawable.artist),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(50.dp))
                Row (){
                    val like = Image(painter = painterResource(id = R.drawable.fav),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val addToPlay = Image(painter = painterResource(id = R.drawable.add),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val repeat = Image(painter = painterResource(id = R.drawable.repeat),
                        contentDescription = null)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (){
                    val queue = Image(painter = painterResource(id = R.drawable.queue),
                        contentDescription = null)
                }

            }


        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier.padding(10.dp)){
            val searcher = Image(painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier=Modifier.size(50.dp))
            OutlinedTextField(value = "search",
                onValueChange = { "search" },
                modifier = Modifier.weight(1f)
            )
        }

        Row {
            Spacer(modifier = Modifier.width(175.dp))
            val homei = Image(painter = painterResource(id = R.drawable.home),
                contentDescription = null, modifier=Modifier
                    .size(50.dp)
                )
        }
    }

}


    @Composable
    @Preview(showBackground = true)
    fun Apppreview() {
        HomeScreen()
    }

