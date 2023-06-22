package com.example.tugas1andes

import APIConfiguration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas1andes.databinding.ActivityMainBinding
import com.example.tugas1andes.databinding.FragmentHomeBinding
import com.example.tugas1andes.ui.home.HomeFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val client = APIConfiguration.getAPIServices(this@MainActivity)
//        client.getAgentList().enqueue(object : Callback<RecyclerViewItemModel> {
//            override fun onResponse(
//                call: Call<RecyclerViewItemModel>,
//                response: Response<RecyclerViewItemModel>
//            ) {
//
//                if(response.isSuccessful){
//                    with(binding) {
//                        val recyclerViewItemModel: MutableList<RecyclerViewItemModel> = mutableListOf()
//                        response.body()?.let { recyclerViewItemModel.addAll(listOf(it))}
//
//                        recyclerView.setHasFixedSize(true)
//                        HomeFragment.layoutManager = LinearLayoutManager(this@MainActivity)
//
//                        val adapter = Adapter(recyclerViewItemModel)
//                        recyclerView.adapter
//                    }
//                }
//                Toast.makeText(this@MainActivity, "Kegagalan pada onResponse", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onFailure(call: Call<RecyclerViewItemModel>, t: Throwable) {
//                Toast.makeText(this@MainActivity, "Kegagalan pada onFailure", Toast.LENGTH_SHORT).show()
//            }
//        })


        initViews()
    }
    private fun initViews() {
        with(binding){

            val navHostFragment = supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
            val navController = navHostFragment.navController

            val appBarConfiguration = AppBarConfiguration(setOf(R.id.navigation_home, R.id.navigation_notifications))
            setupActionBarWithNavController(navController, appBarConfiguration)
            navView.setupWithNavController(navController)
        }
    }
}