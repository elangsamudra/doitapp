package com.example.doitapp.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class addBigbar(
    val name: String,
    //val image: String,
    val harga: Int,
    val stok: Int
):Parcelable
