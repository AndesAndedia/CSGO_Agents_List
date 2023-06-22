package com.example.tugas1andes

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecyclerViewItemModel(
    @field:SerializedName("id")
    val id: String,
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("rarity")
    val rarity: String,
    @field:SerializedName("image")
    val image: String
) : Parcelable
