package com.example.compose_buttons_material3.m3Examples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.compose_buttons_material3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
    ) {
        val sheetState = rememberModalBottomSheetState()
        var isSheetOpen by rememberSaveable {
            mutableStateOf(false)
        }
        val scaffoldState = rememberBottomSheetScaffoldState()
        val scope = rememberCoroutineScope()

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {
                isSheetOpen = true
//                scope.launch {
//                    scaffoldState.bottomSheetState.expand()
//                }
            }) {
                Text(text = "Open Sheet")
            }
        }

//        BottomSheetScaffold(
//            scaffoldState = scaffoldState,
//            sheetContent = {
//                Image(
//                    painter = painterResource(
//                        id = R.drawable.image_
//                    ),
//                    contentDescription = null
//                )
//            },
//            sheetPeekHeight = 0.dp
//        ) {
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                Button(onClick = {
//                    scope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                }) {
//                    Text(text = "Open Sheet")
//                }
//            }
//        }

        if (isSheetOpen) {
            ModalBottomSheet(
                sheetState = sheetState,
                onDismissRequest = {
                    isSheetOpen = false
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_),
                    contentDescription = null
                )
            }
        }
    }
}