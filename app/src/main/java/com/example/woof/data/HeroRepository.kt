package com.example.woof.data

import com.example.woof.R
import com.example.woof.model.Hero

object HeroRepository {
    val heroes = listOf(
        Hero(R.drawable.deadpool, R.string.deadpool, R.string.deadpool_name, R.string.deadpool_powers),
        Hero(R.drawable.namor, R.string.namor, R.string.namor_name, R.string.namor_powers),
        Hero(R.drawable.ghost, R.string.ghost, R.string.ghost_name, R.string.ghost_powers),
        Hero(R.drawable.moon, R.string.moon, R.string.moon_name, R.string.moon_powers),
        Hero(R.drawable.hawkeye, R.string.hawkeye, R.string.hawkeye_name, R.string.hawkeye_powers),
        Hero(R.drawable.blade, R.string.blade, R.string.blade_name, R.string.blade_powers),
        Hero(R.drawable.strange, R.string.strange, R.string.strange_name, R.string.strange_powers),
        Hero(R.drawable.vision, R.string.vision, R.string.vision_name, R.string.vision_powers),
        Hero(R.drawable.widow, R.string.widow, R.string.widow_name, R.string.widow_powers),
        Hero(R.drawable.daredevil, R.string.daredevil, R.string.daredevil_name, R.string.daredevil_powers),
        Hero(R.drawable.panther, R.string.panther, R.string.panther_name, R.string.panther_powers),
        Hero(R.drawable.hulk, R.string.hulk, R.string.hulk_name, R.string.hulk_powers)
    )
}
