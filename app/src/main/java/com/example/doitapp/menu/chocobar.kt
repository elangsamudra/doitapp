package com.example.doitapp.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class getchocobar(
    val name: String = "",
//    val image: String,
    val harga: Int = 0,
    val stok: Int = 0,
    val url: String
):Parcelable