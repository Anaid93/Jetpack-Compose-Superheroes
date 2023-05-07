package com.example.woof.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.woof.data.HeroRepository.heroes
import com.example.woof.ui.theme.screens.HeroItem
import com.example.woof.ui.theme.screens.HeroTopAppBar


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun  HeroApp() {
    Scaffold(
        topBar = { HeroTopAppBar()}
    ) {
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
            items(heroes){
                    hero -> HeroItem(hero)
            }
        }

    }
}

