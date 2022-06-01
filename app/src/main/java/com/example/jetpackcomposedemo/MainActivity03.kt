package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

class MainActivity03 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Andriod", "Jetpack Compose"))
        }
    }

    @Composable
    fun MessageCard(msg: Message) {
       Row {
           Image(
               painter = painterResource(id = R.drawable.img),
               contentDescription = null,
               Modifier.width(Dp(150F))
           )
           Column{
               Text(text = msg.author)
               Text(text = msg.body)
           }
       }
    }

}

