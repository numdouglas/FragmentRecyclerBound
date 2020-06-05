package com.example.fragmentrecyclerbound

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel(){

     val heading= MutableLiveData<String>()

    init {
        Log.i("ViewModel","ViewModel Created!")
        heading.value="Demote"

    }

    fun getHeading():String?{
        return heading.value
    }


}
