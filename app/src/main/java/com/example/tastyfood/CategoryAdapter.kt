package com.example.tastyfood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.categorylayout.view.*
import kotlinx.android.synthetic.main.trendinglayout.view.*

class CategoryAdapter(): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    val categoryList= arrayOf(R.drawable.ic_cookies,R.drawable.ic_home_fish,R.drawable.ic_desert,R.drawable.ic_egg,R.drawable.ic_desert)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            //
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.categorylayout, parent, false)

        return CategoryAdapter.ViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return categoryList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.categoryImage.setImageResource(categoryList[position])
    }
}
