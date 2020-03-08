package com.example.shoesinstock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoesinstock.adapter.PersonAdapter
import com.example.shoesinstock.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personArray=ArrayList<Person>()
        personArray.add(Person("Nike Aldorado","Sport","001",R.drawable.shoe,"$750"))
        personArray.add(Person("Aerosoft","Mountain Hail","002",R.drawable.allblsho,"$800"))
        personArray.add(Person("Nike Aldorado","Sport","001",R.drawable.shoe,"$750"))
        personArray.add(Person("Aerosoft","Mountain Hail","002",R.drawable.shoe,"$800"))
        personArray.add(Person("Nike Aldorado","Sport","001",R.drawable.shoe,"$750"))
        personArray.add(Person("Aerosoft","Mountain Hail","002",R.drawable.shoe,"$800"))
        var personAdapter= PersonAdapter(personArray)

        //recyclerView.layoutManager= LinearLayoutManager(this)
        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
         recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=personAdapter
    }
}
