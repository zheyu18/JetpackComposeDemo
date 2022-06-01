package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

class MainActivity02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Andriod", "Jetpack Compose"))
        }
    }

    @Composable
    fun MessageCard(msg: Message) {
        Text(text = msg.author)
        Text(text = msg.body)
    }


}

data class Message(val author: String, val body: String)

