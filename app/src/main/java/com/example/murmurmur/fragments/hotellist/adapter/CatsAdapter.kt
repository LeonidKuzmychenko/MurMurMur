package com.example.murmurmur.fragments.hotellist.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.murmurmur.R
import com.example.murmurmur.fragments.edit.HotelInfoFragmentDirections
import com.example.murmurmur.fragments.hotellist.HotelListFragment
import com.example.murmurmur.fragments.hotellist.HotelListFragmentDirections
import com.example.murmurmur.items.CatProfile
import java.text.SimpleDateFormat

class CatsAdapter : RecyclerView.Adapter<CatsAdapter.CatsViewHolder>() {

    private var list: List<CatProfile> = listOf()

    class CatsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val container: View = itemView.findViewById(R.id.item_cat_profile)
        val cat: TextView = itemView.findViewById(R.id.item_cat_profile_cat_name)
        val people: TextView = itemView.findViewById(R.id.item_cat_profile_people_name)
        val date: TextView = itemView.findViewById(R.id.item_cat_profile_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cat_profile, parent, false)
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

        holder.container.setOnClickListener {
//            val action = Hotel.actionSubCategoryFragmentToProductsFragment(title, catId, filterItem)
//            val action = SubCategoryFragmentDirections.actionSubCategoryFragmentToProductsFragment(title, catId, filterItem)
//            Navigation.findNavController(item).navigate(action)

            val action = HotelListFragmentDirections.actionHotelListFragmentToHotelInfoFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount() = list.size

    fun setList(list: List<CatProfile>) {
        this.list = list
        notifyDataSetChanged()
    }
}