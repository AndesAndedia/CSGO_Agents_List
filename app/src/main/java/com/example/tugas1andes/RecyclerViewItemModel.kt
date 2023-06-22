package com.example.tugas1andes

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecyclerViewItemModel(
    @field : SerializedName("gambar")
    val gambar: Int,
    @field : SerializedName("judul")
    val judul: String,
    @field : SerializedName("deskripsi")
    val deskripsi: String,
    @field : SerializedName("tahun")
    val tahun: String
) : Parcelable

