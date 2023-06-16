package com.example.kpoplist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kpoplist.adapter.GroupAdapter
import com.example.kpoplist.constants.Layout
import com.example.kpoplist.databinding.ActivityHorizontalBinding

class HorizontalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = GroupAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}