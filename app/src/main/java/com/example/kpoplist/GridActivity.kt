package com.example.kpoplist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kpoplist.adapter.GroupAdapter
import com.example.kpoplist.constants.Layout
import com.example.kpoplist.databinding.ActivityGridBinding

class GridActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = GroupAdapter(
            applicationContext,
            Layout.GRID
        )

        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}