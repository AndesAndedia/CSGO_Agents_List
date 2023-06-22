package com.example.tugas1andes.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas1andes.Adapter
//import com.example.tugas1andes.ListItem

//import com.example.tugas1andes.ListItem
import com.example.tugas1andes.RecyclerViewItemModel
import com.example.tugas1andes.databinding.FragmentHomeBinding
import com.example.tugas1andes.listAgent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
    private var recyclerbinding: FragmentHomeBinding? = null
    private var columnCount = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        recyclerbinding = FragmentHomeBinding.inflate(inflater, container, false)


        val client = APIConfiguration.getAPIServices(this@HomeFragment)
        client.getAgentList().enqueue(object : Callback<List<RecyclerViewItemModel>> {
            override fun onResponse(
                call: Call<List<RecyclerViewItemModel>>, response: Response<List<RecyclerViewItemModel>>
            ) {

                if (response.isSuccessful) {
                    with(recyclerbinding!!.recyclerView) {
                        val recyclerViewItemModel: MutableList<RecyclerViewItemModel> =
                            mutableListOf()
                        response.body()?.let { recyclerViewItemModel.addAll(it) }

                        Toast.makeText(
                            requireContext(), "${response.body()!!.size}", Toast.LENGTH_SHORT
                        ).show()

                        setHasFixedSize(true)
                        layoutManager = LinearLayoutManager(requireContext())
                        val listAdapter = Adapter(recyclerViewItemModel)
                        adapter=listAdapter
                        Toast.makeText(
                            requireContext(), "BISAAAA", Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(
                        requireContext(), "Kegagalan pada onResponse", Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<List<RecyclerViewItemModel>>, t: Throwable) {
                Toast.makeText(requireContext(), "Kegagalan pada onFailure", Toast.LENGTH_SHORT)
                    .show()
            }
        })

        return recyclerbinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recyclerbinding = null
    }
}