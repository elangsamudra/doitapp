package com.example.doitapp.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.doitapp.R

class chococrunchactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chococrunchactivity)
        val data= intent.getStringExtra("data")!!
        Log.v("chococrunch", "datachococrunch"+data)

    }
}