package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemOfList(
    var imageSrc: Int,
    val imageTitle: String,
    val imageDesc: String
): Parcelable