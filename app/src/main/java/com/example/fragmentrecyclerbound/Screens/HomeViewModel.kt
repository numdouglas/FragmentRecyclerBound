package com.example.fragmentrecyclerbound.Screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class HomeViewModel:ViewModel(){

    var word=MutableLiveData<String>()


    init {
        word.value="Keynes"
    }

    fun setNewWord(){
        word.value="Marinus"
    }
}