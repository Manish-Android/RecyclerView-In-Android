package com.manish.recycleviewforgit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(val list: ArrayList<String>) :
    RecyclerView.Adapter<RecAdapter.viewHolder>() {
    class viewHolder(view : View) : RecyclerView.ViewHolder(view) {

        var data = view.findViewById<TextView>(R.id.text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.raw_demo, parent, false)
        return viewHolder(view)

    }

    override fun getItemCount(): Int {
       return  list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       holder.data.text = list[position]
    }
}