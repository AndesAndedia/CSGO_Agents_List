package com.example.tugas1andes

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecyclerViewItemModel(
    @field:SerializedName("Agents")
    val agent: List<listAgent>
) : Parcelable

