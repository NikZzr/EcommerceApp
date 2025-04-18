package com.nicolasnino.ecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nicolasnino.ecommerceapp.ui.theme.EcommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcommerceAppTheme {
                val myNavController = rememberNavController()
                val myStartDestination: String "Login"
                NavHost(
                    navController = myNavController
                    startDestination = MyStartDestination,
                    modifier = Modifier.fillMaxSize()
                ){

                    composable("login"){
                        LoginScreen()
                    }
                    composable("register"){
                        RegisterScreen()
                    }
                    composable("home") {
                        HomeScreen()
                    }
                }

                }
            }
        }
    }


