package com.example.compose_buttons_material3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose_buttons_material3.m3Examples.BottomSheetExample
import com.example.compose_buttons_material3.ui.theme.ComposeButtonsMaterial3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeButtonsMaterial3Theme {
//                MainScreen()
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp)
//                ) {
//                    CheckBoxScreen()
//                    Spacer(modifier = Modifier.height(32.dp))
//                    SwitchComposable()
//                    Spacer(modifier = Modifier.height(32.dp))
//                    RadioButtonComposable()
//                }
//                TopAppBarExample()
//                BottomBarExample()
//                BottomNavigationExample()
//                NavigationRailExample()
//                NavigationDrawerExample()
                BottomSheetExample()
            }

        }
    }
}

