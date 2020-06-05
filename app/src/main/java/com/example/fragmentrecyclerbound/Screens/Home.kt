package com.example.fragmentrecyclerbound.Screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.fragmentrecyclerbound.R
import com.example.fragmentrecyclerbound.databinding.HomeBinding
import kotlinx.android.synthetic.main.home.*


class Home : androidx.fragment.app.Fragment(){

    private lateinit var binding: HomeBinding

    private lateinit var viewModel: HomeViewModel

    private lateinit var homeAdapter:HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel=ViewModelProvider.AndroidViewModelFactory.getInstance(activity!!.application).create(HomeViewModel::class.java)

        binding=DataBindingUtil.inflate(inflater, R.layout.home,container,false)

        //binding.button.setOnClickListener{viewModel.setNewWord()}

        //viewModel.word.observe(this, Observer { wordo -> binding.title.text=wordo })

        initRecyclerView()

        addDataSet()



        return binding.root
    }


    private fun addDataSet(){
        val data =DataSource.createPeopleData()
        homeAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        binding.recycler.apply {
            layoutManager=LinearLayoutManager(this@Home.context)
            homeAdapter= HomeAdapter()
            adapter=homeAdapter
        }
    }
}