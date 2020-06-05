package com.example.fragmentrecyclerbound

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentrecyclerbound.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel=ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(MainActivityViewModel::class.java)

        viewModel.heading.observe(this,
            androidx.lifecycle.Observer { titlus -> binding.nomNom.text = viewModel.getHeading() })
    }
}




//data class Headings(val name:String="")