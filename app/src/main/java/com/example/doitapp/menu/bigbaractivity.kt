package com.example.doitapp.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.doitapp.R

class bigbaractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bigbaractivity)

        val data= intent.getStringExtra("data")!!
        Log.v("bigbar", "databigbar"+data)
    }
}