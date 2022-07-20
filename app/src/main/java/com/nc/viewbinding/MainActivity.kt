package com.nc.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nc.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)

        setContentView(binding.root)
        binding.button.setOnClickListener {
            Toast.makeText(this," ${binding.text.text.toString()}",Toast.LENGTH_LONG).show()
            startActivity(Intent(this,MainActivity2::class.java))
        }


    }
}