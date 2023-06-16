package com.example.kpoplist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kpoplist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVertical.setOnClickListener { launchVertical() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.btnHorizontal.setOnClickListener { launchHorizontal() }

        // Launch the GridListActivity on gridBtn click
        binding.btnGrid.setOnClickListener { launchGrid() }

    }

    private fun launchVertical() {
        listIntent = Intent(this, VerticalActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent(this, HorizontalActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchGrid() {
        listIntent = Intent(this, GridActivity::class.java)
        startActivity(listIntent)
    }
}