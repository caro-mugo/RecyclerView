package com.carolinenyambura.fibonacciactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter(var numberList:List<Int>):RecyclerView.Adapter<NumberRecyclerViewAdapter.NumberViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.number_item_list,parent,false)
        return NumberViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
     holder.tvNumbers.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size

    }
    class NumberViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        var tvNumbers= itemView.findViewById<TextView>(R.id.tvNumbers)
    }


}