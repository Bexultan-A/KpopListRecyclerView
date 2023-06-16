package com.example.kpoplist.model

import androidx.annotation.DrawableRes

data class Group(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val numberOfMembers: Int,
    val fandom: String
)
