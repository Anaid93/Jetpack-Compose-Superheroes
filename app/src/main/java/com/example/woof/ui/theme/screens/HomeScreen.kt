package com.example.woof.ui.theme.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.woof.R
import com.example.woof.model.Hero
import com.example.woof.ui.theme.HeroApp
import com.example.woof.ui.theme.WoofTheme

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    WoofTheme {
        HeroApp()
    }
}

@Preview(showSystemUi = true)
@Composable
fun DarkThemePreview() {
    WoofTheme(darkTheme = true) {
        HeroApp()
    }
}

@Composable
fun HeroItem(hero: Hero, modifier: Modifier = Modifier){
    Card(
        modifier = modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp)),
        elevation = 4.dp)

    {
        var expanded by remember { mutableStateOf(false) }
        Column(
            modifier = modifier.animateContentSize(animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
            )
        ) {
            Row(modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 72.dp))
            {
                HeroImage(heroIcon = hero.imageResourceId)
                HeroInformation(hero.name, hero.realName)
                Spacer(Modifier.weight(1f))
                HeroItemButton(expanded = expanded,
                    onClick = { expanded = !expanded })
            }
            if(expanded){
                HeroMoreInfo(hero.superpowers)
            }

        }
    }
}

@Composable
fun HeroImage(@DrawableRes heroIcon:Int, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(72.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(heroIcon),
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.FillWidth)
    }
}

@Composable
fun HeroInformation(heroName:Int, heroRealName:Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 16.dp, top = 8.dp)) {
        Text(
            text = stringResource(heroName),
            style = MaterialTheme.typography.h3
        )
        Text(
            text = stringResource(heroRealName),
            style = MaterialTheme.typography.body1)
    }
}

@Composable
fun HeroTopAppBar(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxWidth()
        .size(56.dp),
        contentAlignment = Alignment.Center)
    {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1
        )

    }
}

@Composable
private fun HeroItemButton(
    expanded:Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon(imageVector = if(expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = MaterialTheme.colors.secondary,
            contentDescription = stringResource(R.string.expand_button_content_description)
        )
    }

}

@Composable
fun HeroMoreInfo(
    @StringRes heroMoreInfo:Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(
        start = 16.dp,
        top = 8.dp,
        bottom = 16.dp,
        end = 16.dp))
    {
        Text(text = stringResource(R.string.superpowers),
            style = MaterialTheme.typography.h3)

        Text(text = stringResource(heroMoreInfo),
            style = MaterialTheme.typography.body1)
    }

}