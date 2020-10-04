package com.example.tastyfood

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.trendinglayout.view.*

class TrendingAdapter():RecyclerView.Adapter<TrendingAdapter.ViewHolder>(

) {

    val trendingfood= arrayOf(R.drawable.discountberry,R.drawable.discountbrocoli,R.drawable.discountberry,R.drawable.discountmeat,R.drawable.discountbrocoli)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            //
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.trendinglayout, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.discountImage.setImageResource(trendingfood[position])
    }

    override fun getItemCount(): Int {
        return trendingfood.size

    }
}

