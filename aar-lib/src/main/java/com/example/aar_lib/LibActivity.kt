package com.example.aar_lib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aar_lib.databinding.ActivityLibBinding

class LibActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLibBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLibBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
