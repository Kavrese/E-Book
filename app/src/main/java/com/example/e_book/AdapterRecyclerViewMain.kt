package com.example.e_book

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterRecyclerViewMain(val listModels: List<ModelBook>): RecyclerView.Adapter<AdapterRecyclerViewMain.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.ava_book)
        val name = itemView.findViewById<TextView>(R.id.book)
        val author = itemView.findViewById<TextView>(R.id.author)
        val rate = itemView.findViewById<TextView>(R.id.rate)
        val tag = itemView.findViewById<TextView>(R.id.tag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listModels[position].img)
            .into(holder.img)
        holder.author.text = "by " + listModels[position].author
        holder.name.text = listModels[position].nameBook
        holder.rate.text = listModels[position].rateString
        holder.tag.text = listModels[position].tag

        holder.itemView.setOnClickListener {
            ToNextScreen.model = listModels[position]
            holder.itemView.context.startActivity(Intent(holder.itemView.context, BookActivity::class.java))
        }
    }

    override fun getItemCount(): Int = listModels.size
}