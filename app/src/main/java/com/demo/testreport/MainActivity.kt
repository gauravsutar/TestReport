package com.demo.testreport

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.demo.testreport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChangeText.setOnClickListener(this)
        binding.btnChangeActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val txt = binding.edtInput.text.toString()
        when (v?.id) {
            R.id.btnChangeText ->
                binding.txtToBeChanged.text = txt
            R.id.btnChangeActivity -> {
                val intent = Intent(this, ShowTextActivity::class.java)
                intent.putExtra(ShowTextActivity.KEY_EXTRA_MESSAGE, txt)
                startActivity(intent)
            }
        }
    }
}
