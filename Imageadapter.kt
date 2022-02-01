package com.example.codingassignment

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.codingassignment.datasource.rawdata
import com.example.codingassignment.model.imgclass

class Imageadapter (): RecyclerView.Adapter<Imageadapter.ItemViewHolder>(){
    class ItemViewHolder( view: View) : RecyclerView.ViewHolder(view) {
        val imageView:ImageView = view.findViewById<ImageView>(R.id.imagelist)
    }

    private val gg= rawdata().returnlist()
    override fun getItemCount(): Int {
        return gg.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_image, parent, false)

        return ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = gg[position]
        holder.imageView.setImageResource(item.imgid)
    }


}