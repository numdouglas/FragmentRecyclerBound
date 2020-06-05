package com.example.fragmentrecyclerbound.Screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentrecyclerbound.R
import kotlinx.android.synthetic.main.list_item.view.*

class HomeAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var people: List<Person> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return people.size
    }


    fun submitList(peopleList: List<Person>) {
        people = peopleList
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HomeViewHolder -> holder.bind(people.get(position))
        }
    }
}


    class HomeViewHolder constructor(
        itemView: View):RecyclerView.ViewHolder(itemView){

        val myName=itemView.my_name
        val myPhoto=itemView.photo
        val confirm=itemView.confirm


        fun bind(person: Person){
            myName.setText(person.myName)
            myPhoto.setImageResource(person.myphoto)
        }
    }
