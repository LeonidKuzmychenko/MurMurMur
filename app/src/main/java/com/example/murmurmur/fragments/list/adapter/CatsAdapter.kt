package com.example.murmurmur.fragments.list.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.murmurmur.R
import com.example.murmurmur.items.CatProfile
import java.text.SimpleDateFormat

class CatsAdapter(private val list: List<CatProfile>) :
    RecyclerView.Adapter<CatsAdapter.CatsViewHolder>() {

    class CatsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cat: TextView = itemView.findViewById(R.id.item_cat_profile_cat_name)
        val people: TextView = itemView.findViewById(R.id.item_cat_profile_people_name)
        val date: TextView = itemView.findViewById(R.id.item_cat_profile_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cat_profile, parent, false)
        return CatsViewHolder(view)
    }

    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: CatsViewHolder, pos: Int) {
        val context = holder.itemView.context
        val item = list[pos]
        val cat = context.getString(R.string.item_cat_profile_cat_name) + " " + item.nameCat
        val people = context.getString(R.string.item_cat_profile_people_name) + " " + item.namePeople
        val date = context.getString(R.string.item_cat_profile_date) + " " + SimpleDateFormat("dd/MM/yyy").format(item.date)

        holder.cat.text = cat
        holder.people.text = people
        holder.date.text = date
    }

    override fun getItemCount() = list.size

}