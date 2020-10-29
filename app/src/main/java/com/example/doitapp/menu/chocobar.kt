package com.example.doitapp.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class getchocobar(
    val name: String,
    val image: String,
    val harga: String,
    val stok: String,
    val url: String
):Parcelable