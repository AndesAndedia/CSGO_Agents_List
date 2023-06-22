package com.example.tugas1andes

import android.icu.text.LocaleDisplayNames.UiListItem
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.tugas1andes.databinding.
import com.squareup.picasso.Picasso


class Adapter : RecyclerView.Adapter<Adapter.ViewHolderCustom>() {
    private var listData = mutableListOf<RecyclerViewItemModel>()

    class ViewHolderCustom(private val binding: RecycleViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(item: RecyclerViewItemModel) {
            with(binding) {
                Picasso.get().load(item.image).into(gambarItem)
                judulItem.text = item.name
                deskripsiItem.text = item.description
                rarityItem.text = item.rarity
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCustom {
        val binding = RecycleViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderCustom(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderCustom, position: Int) {
        holder.bindData(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    fun isiList(listItem: MutableList<RecyclerViewItemModel>) {
        listData.clear()
        listData.addAll(listItem)
    }
}}