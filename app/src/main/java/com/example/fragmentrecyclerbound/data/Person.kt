package com.example.fragmentrecyclerbound.data

import com.example.fragmentrecyclerbound.R

data class Person(
    var myName:String,
    var myphoto:Int,
    var myConfirmation:Int
)


class DataSource(){
companion object{

    fun createPeopleData():ArrayList<Person>{
        val list=ArrayList<Person>()

        list.add(
            Person(
                "Jeff",
                R.id.photo,
                R.id.confirm
            )
        )

        list.add(
            Person(
                "Brad",
                R.id.photo,
                R.id.confirm
            )
        )

        list.add(
            Person(
                "Killos",
                R.id.photo,
                R.id.confirm
            )
        )

        list.add(
            Person(
                "Larry",
                R.id.photo,
                R.id.confirm
            )
        )

        list.add(
            Person(
                "Wiles",
                R.id.photo,
                R.id.confirm
            )
        )

        list.add(
            Person(
                "Mojan",
                R.id.photo,
                R.id.confirm
            )
        )

    return list
    }

}

}