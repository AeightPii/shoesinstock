package com.example.shoesinstock.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

import com.example.shoesinstock.R
import com.example.shoesinstock.model.Person
import kotlinx.android.synthetic.main.list_item.view.*

class PersonAdapter(var personList: ArrayList<Person>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Person) {
            itemView.name.text = person.name
            itemView.type.text = person.type
            itemView.code.text = person.code
            itemView.price.text = person.price
            itemView.photo.setImageResource(person.photo)
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return PersonViewHolder(view)
    }

    //............rec mr output ml count a yay a twat
    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])//array tae insert
    }


}