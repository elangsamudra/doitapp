package com.example.doitapp.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    val name: String,
    val image: String
):Parcelable
