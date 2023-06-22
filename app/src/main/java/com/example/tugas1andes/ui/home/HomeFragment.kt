package com.example.tugas1andes.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas1andes.R
import com.example.tugas1andes.ListItem
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas1andes.Adapter
import com.example.tugas1andes.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var recyclerbinding: FragmentHomeBinding? = null
    private var columnCount = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recyclerbinding = FragmentHomeBinding.inflate(inflater, container, false)

        with (recyclerbinding!!.recyclerView) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)

            val listAdapter = Adapter()
            listAdapter.isiList(ListItem.buatList())
            adapter = listAdapter
        }

        return recyclerbinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recyclerbinding = null
    }
}