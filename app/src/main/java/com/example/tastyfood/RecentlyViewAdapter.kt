package com.example.tastyfood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyfood.Model.recentItem
import kotlinx.android.synthetic.main.recentlylayout.view.*

class RecentlyViewAdapter(var items:ArrayList<recentItem>): RecyclerView.Adapter<RecentlyViewAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener() {
                val intent = Intent(itemView.context, RecentProductDetails::class.java)
                intent.putExtra("title",itemView.)
            }
                //itemView.context.startActivity(intent)
            }
        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentlyViewAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.recentlylayout, parent, false)

        return RecentlyViewAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecentlyViewAdapter.ViewHolder, position: Int) {
       holder.itemView.product_name.text=items.get(position).title
        holder.itemView.description.text=items.get(position).description
        holder.itemView.price.text=items.get(position).price
        holder.itemView.qty.text=items.get(position).quamtity
        holder.itemView.unit.text=items.get(position).Unit
        holder.itemView.recent_layout.setBackgroundResource(items.get(position).img2)




        //holder.itemView.setOnClickListener(){
            //val intent=Intent(this,RecentProductDetails::class.java)
        ///}



    }

    override fun getItemCount(): Int {
        return items.size
    }
}