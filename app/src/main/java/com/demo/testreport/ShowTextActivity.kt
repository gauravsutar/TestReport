package com.demo.testreport

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.testreport.databinding.ActivityShowTextBinding

class ShowTextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowTextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val message = intent.getStringExtra(KEY_EXTRA_MESSAGE)
        message.let {
            binding.txtMessage.text = message
        }
    }

    companion object {
        const val KEY_EXTRA_MESSAGE = "message"
    }
}
