package com.nc.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nc.viewbinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var  binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            Toast.makeText(this," ${binding.name.text.toString()}",Toast.LENGTH_LONG).show()
            var fragmentmanager=supportFragmentManager
            var transection=fragmentmanager.beginTransaction()
            var myfragment=BlankFragment()
            transection.add(R.id.lauout,myfragment)
            transection.commit()
        }
    }
}