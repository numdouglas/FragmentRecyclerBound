package com.example.fragmentrecyclerbound

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel(){

     val heading= MutableLiveData<String>()

    init {
        Log.i("ViewModel","ViewModel Created!")
        //An example of a value that will automatically be set using the bound variable in layout resource
        heading.value="Demote"

    }

    fun getHeading():String?{
        return heading.value
    }


}
