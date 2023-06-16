package com.example.kpoplist.data

import com.example.kpoplist.R
import com.example.kpoplist.model.Group

object Datasource {

    val groups: List<Group> = listOf(
        Group(R.drawable.aespa,
            "AESPA",
            4,
            "MY"
        ),
        Group(
            R.drawable.ive,
            "IVE",
            6,
            "DIVE"
        ),
        Group(
            R.drawable.blackpink,
            "BLACKPINK",
            4,
            "BLINK"
        ),
        Group(
            R.drawable.itzy,
            "ITZY",
            5,
            "MIDZY"
        ),
        Group(
            R.drawable.nmixx,
            "NMIXX",
            6,
            "NSWER"
        ),
        Group(
            R.drawable.lesserafim,
            "LESSERAFIM",
            5,
            "FEARNOT"
        ),
        Group(
            R.drawable.twice,
            "TWICE",
            9,
            "ONCE"
        ),
        Group(
            R.drawable.straykids,
            "STRAYKIDS",
            8,
            "STAY"
        ),
        Group(
            R.drawable.gide,
            "(G)-IDLE",
            5,
            "NEVERLAND"
        )
    )
}