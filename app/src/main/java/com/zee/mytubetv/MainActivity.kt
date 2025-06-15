package com.zee.mytubetv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.zee.mytubetv.ui.screens.YoutubeWV
import com.zee.mytubetv.ui.theme.MyTubeTVTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.setLayout(3840, 2160)
        setContent {
            MyTubeTVTheme {
               Box(modifier = Modifier.fillMaxSize()) { YoutubeWV() }
            }
        }
    }
}
