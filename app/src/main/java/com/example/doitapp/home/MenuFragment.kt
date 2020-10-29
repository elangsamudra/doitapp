package com.example.doitapp.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doitapp.R
import com.example.doitapp.menu.*
import kotlinx.android.synthetic.main.fragment_menu.*


class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val listfood = listOf(
            Food(name = "BIG BAR", image ="https://id.pinterest.com/pin/295548794297725770/?nic_v2=1a13YWogC"),
            Food(name = "KURMOND", image = "@drawable/kurmond"),
            Food(name = "CHOCO CRUNCH", image = "@drawable/chocochruncy")
        )

        val bigbarAdapter = FoodAdapter(listfood){food ->
            startActivity(Intent(context, bigbaractivity::class.java)
                .putExtra("data",food.name))


            //Toast.makeText(context, "food clicked ${food.name}", Toast.LENGTH_SHORT).show()
        }

        val kurmondAdapter = FoodAdapter(listfood) { food ->
            startActivity(
                Intent(context, kurmondactivity::class.java)
                    .putExtra("data", food.name)
            )

        }

        val chococrunchAdapter = FoodAdapter(listfood) {food ->
            startActivity(Intent(context, chococrunchactivity::class.java)
                .putExtra("data",food.name))
        }
            rView.apply {
            layoutManager = GridLayoutManager(context, 3)
            layoutManager = LinearLayoutManager(context)
                adapter = bigbarAdapter
                adapter = kurmondAdapter
                adapter = chococrunchAdapter
        }
    }

}

