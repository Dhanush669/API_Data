package com.devgd.apidata

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

internal class ApiAdapter(private var apidata: List<ApiModelClass>) :
    RecyclerView.Adapter<ApiAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.textv1)
        var title1: TextView = view.findViewById(R.id.textv2)
        var title2: TextView = view.findViewById(R.id.textv3)
        var title3: TextView = view.findViewById(R.id.textv4)
        var title4: TextView = view.findViewById(R.id.textv5)
        var title5: TextView = view.findViewById(R.id.textv6)
        var title6: TextView = view.findViewById(R.id.textv7)
        var title7: TextView = view.findViewById(R.id.textv8)
        var title8: TextView = view.findViewById(R.id.textv9)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_layout, parent, false)
        return MyViewHolder(itemView)
    }
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = apidata[position]
        holder.title.setText(data.getExcId())
        holder.title1.setText(data.getSymbol())
        holder.title2.setText(data.getPriceUnc())
        holder.title3.setText(data.getPrice())
        holder.title4.setText(data.getChange())
        holder.title5.setText(data.getSpread())
        holder.title6.setText(data.getVolume())
        holder.title7.setText(data.getStatus())
        holder.title8.setText(data.getTime())
    }
    override fun getItemCount(): Int {
        return apidata.size
    }
}