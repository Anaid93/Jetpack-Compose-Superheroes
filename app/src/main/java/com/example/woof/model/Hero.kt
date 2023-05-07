package com.example.woof.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Hero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val realName: Int,
    @StringRes val superpowers : Int
)

