package com.example.doitapp.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.doitapp.R
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_menu_bigbar.*

class MenuBigbarActivity : AppCompatActivity() {
    val database = FirebaseDatabase.getInstance()
    val myRef = database.getReference("Bigbar")
    val arrayUser = arrayListOf<addBigbar>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bigbar)

    }
    private fun addingBigbar(name: String, harga: Int, stok: Int){
        val bigbar = addBigbar(
            name,
            harga,
            stok

        )
        myRef.push().setValue(bigbar)
    }
}