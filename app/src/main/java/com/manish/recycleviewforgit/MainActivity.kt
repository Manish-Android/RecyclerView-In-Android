package com.manish.recycleviewforgit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview : RecyclerView
    lateinit var btn_grid : Button
    lateinit var btn_vertical : Button
    var listOfData  = arrayListOf<String>("")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfData.clear()
        listOfData.add("one")
        listOfData.add("two")
        listOfData.add("three")
        listOfData.add("four")
        listOfData.add("five")
        listOfData.add("six")
        listOfData.add("seven")
        listOfData.add("eight")
        listOfData.add("nine")
        listOfData.add("ten")
        listOfData.add("eleven")
        listOfData.add("twelve")
        listOfData.add("thirteen")
        listOfData.add("fourteen")
        listOfData.add("fifteen")
        listOfData.add("sixteen")
        listOfData.add("seventeen")
        listOfData.add("eighteen")
        listOfData.add("nineteen")
        listOfData.add("twenty")


        recyclerview = findViewById(R.id.recyclerview)
        btn_vertical = findViewById(R.id.btn_vertical)
        btn_grid = findViewById(R.id.btn_grid)

        btn_vertical.setOnClickListener {
            recyclerview.layoutManager = LinearLayoutManager(this@MainActivity,RecyclerView.VERTICAL,false)
            recyclerview.visibility = View.VISIBLE
            btn_vertical.visibility = View.GONE
            btn_grid.visibility = View.GONE

        }

        btn_grid.setOnClickListener {
            recyclerview.layoutManager = GridLayoutManager(this@MainActivity,2,RecyclerView.VERTICAL,false)
            recyclerview.visibility = View.VISIBLE
            btn_vertical.visibility = View.GONE
            btn_grid.visibility = View.GONE
        }
        recyclerview.adapter = RecAdapter(listOfData)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(recyclerview.isVisible)
        {
            recreate()

        }
    }
}