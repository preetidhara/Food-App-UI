package com.example.tastyfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tastyfood.Model.recentItem
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition


class MainActivity : AppCompatActivity() {

    companion object{
        val Intent_Parceable="Obejct_intent"
    }

    lateinit var fruitList:ArrayList<recentItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        trendingadapter()

        categoryadapter()



        RecentView()

        //val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //firstRecycleview.layoutManager = layoutManager
        //val adapter = TrendingAdapter()
        //firstRecycleview.adapter = adapter




    }



    private fun RecentView() {
        fruitList= ArrayList()
        addFruits()


    }

    private fun addFruits() {
        fruitList.add(recentItem("Watermelon", "Watermelon has high water content and also provides some fiber.", "₹ 80", "1", "KG", R.drawable.card4, R.drawable.b4))
        fruitList.add(recentItem("Papaya", "Papayas are spherical or pear-shaped fruits that can be as long as 20 inches.", "₹ 85", "1", "KG", R.drawable.card3, R.drawable.b3))
        fruitList.add(recentItem("Strawberry", "The strawberry is a highly nutritious fruit, loaded with vitamin C.", "₹ 30", "1" ,"KG", R.drawable.card2, R.drawable.b1))
        fruitList.add(recentItem("Kiwi", "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.", "₹ 30", "1", "PC", R.drawable.card1, R.drawable.b2))
        fruitList.add(recentItem("Watermelon", "Watermelon has high water content and also provides some fiber.", "₹ 80", "1", "KG", R.drawable.card4, R.drawable.b4))
        recentviewAdapter()
    }

    private fun recentviewAdapter() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        thirdRecycleview.layoutManager = layoutManager
        //val adapter = RecentlyViewAdapter()
        thirdRecycleview.adapter = RecentlyViewAdapter(fruitList)
    }

    private fun categoryadapter() {
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        SecondRecycleview.layoutManager = layoutManager
        val adapter = CategoryAdapter()
        SecondRecycleview.adapter = adapter
    }

    private fun trendingadapter() {
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        firstRecycleview.layoutManager = layoutManager
        val adapter = TrendingAdapter()
        firstRecycleview.adapter = adapter
    }


}