@file:OptIn(ExperimentalFoundationApi::class)

package com.techflix.insta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.techflix.insta.ui.MainScreen
import com.techflix.insta.ui.theme.InstaTheme
import androidx.compose.foundation.ExperimentalFoundationApi

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContent {
            InstaTheme() {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainScreen()
                }
            }
        }
    }
}