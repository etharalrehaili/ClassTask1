package com.example.w1d1

import android.os.Bundle
import android.util.Log
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
import com.example.w1d1.ui.theme.W1D1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("create", "onCreate: ")
        enableEdgeToEdge()
        setContent {
            W1D1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "World",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("destroy", "onDestroy: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart", "onRestart: ")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    W1D1Theme {
        Greeting("World")
    }
}