package com.example.doitapp.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.doitapp.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add_product.*
import kotlin.properties.Delegates

class AddProductActivity : AppCompatActivity() {
    lateinit var myRef : DatabaseReference
    lateinit var nama: String
    var stok by Delegates.notNull<Int>()
    var harga by Delegates.notNull<Int>()
    lateinit var kategori: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val database = FirebaseDatabase.getInstance()

        // ganti model chocobar dan yang lain.
        val arrayUser = arrayListOf<getchocobar>()


        btn_save.setOnClickListener {
            nama = et_nama.text.toString()
            harga = et_harga.text.toString().toInt()
            stok = et_stok.text.toString().toInt()
            kategori = et_kategori.text.toString()
            myRef = FirebaseDatabase.getInstance().reference
                .child(kategori)
            getchocobar(nama,harga,stok)

        }
    }

    private fun getchocobar(nama: String, harga: Int, stok: Int){
        val chocobar = getchocobar(
            nama,
            stok,
            harga
        )
        myRef.setValue(chocobar)
    }
}