package com.example.tugas1andes

import android.icu.text.LocaleDisplayNames.UiListItem
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.tugas1andes.databinding.RecycleViewBinding

class Adapter(private val mutableList: MutableList<RecyclerViewItemModel>): RecyclerView.Adapter<Adapter.ViewHolderCustom>() {
    private var listData = mutableListOf<RecyclerViewItemModel>()

    inner class ViewHolderCustom(private val binding: RecycleViewBinding)
        : RecyclerView.ViewHolder(binding.root){
        fun bindData(item: RecyclerViewItemModel){
            with (binding){
                Glide.with(itemView.context).load("${item.image}").into(gambarItem)
                judulItem.text = item.name
                deskripsiItem.text = item.description
                rarityItem.text = item.rarity
            }
            // Haloo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolderCustom {
        return ViewHolderCustom(
            RecycleViewBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolderCustom, position: Int) {
        holder.bindData(mutableList[position])
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    fun isiList(listItem: MutableList<RecyclerViewItemModel>){
        mutableList.clear()
        mutableList.addAll(listItem)
    }

}