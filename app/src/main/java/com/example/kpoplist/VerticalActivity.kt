package com.example.kpoplist

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kpoplist.adapter.GroupAdapter
import com.example.kpoplist.constants.Layout
import com.example.kpoplist.databinding.ActivityVerticalBinding

class VerticalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = GroupAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}