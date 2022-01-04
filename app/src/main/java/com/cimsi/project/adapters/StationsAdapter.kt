package com.cimsi.project.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.cimsi.project.R
import com.cimsi.project.model.FavStation

internal class StationsAdapter(private var itemsList: List<FavStation>) :
    RecyclerView.Adapter<StationsAdapter.MyViewHolder>() {

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.item_station_name_text_view)
        var address: TextView = view.findViewById(R.id.item_station_address_text_view)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fav_station, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.name.text = item.name
        holder.address.text = item.address
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}