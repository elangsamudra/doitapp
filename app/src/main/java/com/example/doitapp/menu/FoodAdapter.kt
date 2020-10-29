package com.example.doitapp.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_food.view.imgFood
import kotlinx.android.synthetic.main.item_food.view.txtFoodName


class FoodAdapter(private val food: List<Food>,
                    private val adapterOnClick:  (Food)-> Unit) : RecyclerView.Adapter<FoodAdapter.FoodHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FoodAdapter.FoodHolder {
        return FoodHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_food, viewGroup, false))
    }

    override fun getItemCount(): Int = food.size

    override fun onBindViewHolder(holder: FoodAdapter.FoodHolder, position: Int) {
        holder.bindFood(food[position])
    }

    inner class FoodHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bindFood(food: Food){
            itemView.apply {
                txtFoodName.text = food.name
                Picasso.get().load(food.image).into(imgFood)

                setOnClickListener {
                    adapterOnClick(food)
                }
            }
        }
    }
}