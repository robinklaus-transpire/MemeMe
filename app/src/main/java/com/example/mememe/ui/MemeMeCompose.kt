package com.example.mememe.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.mememe.ui.theme.LightGray
import com.example.mememe.ui.theme.Purple200

@Preview
@Composable
fun MemeMeScreen() {
    Scaffold() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(LightGray)) {

            Image(
                painter = rememberImagePainter("https://picsum.photos/200"),
                contentDescription = null,
                modifier = Modifier.size(128.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /* TODO */ }) {
                Text("Meme Me")
            }
        }
    }
}
