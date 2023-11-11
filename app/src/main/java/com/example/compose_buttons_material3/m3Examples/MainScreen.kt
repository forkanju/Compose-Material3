package com.example.compose_buttons_material3.m3Examples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text("Submit")
        }

        ElevatedButton(onClick = { /*TODO*/ }) {
            Spacer(modifier = Modifier.width(8.dp))
            Text("Cancel")
        }

        ElevatedButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add to cart")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Add to cart")
        }

        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text("Open in browser")
        }

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Go Back")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Next")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text("Learn more")
        }
    }
}