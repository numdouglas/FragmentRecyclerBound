package com.example.fragmentrecyclerbound.Screens

import androidx.lifecycle.ViewModel
import com.example.fragmentrecyclerbound.data.DataSource
import com.example.fragmentrecyclerbound.data.Person


class HomeViewModel:ViewModel(){

    val people:ArrayList<Person> =DataSource.createPeopleData()

    val anon:String="Anonymous"



}