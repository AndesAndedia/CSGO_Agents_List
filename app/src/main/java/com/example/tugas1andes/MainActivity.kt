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
import com.example.tugas1andes.databinding.ActivityMainBinding
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
        val client = APIConfiguration.getAPIServices(this@MainActivity)
        client.getAgentList().enqueue(object : Callback<RecyclerViewItemModel> {
            override fun onResponse(
                call: Call<RecyclerViewItemModel>,
                response: Response<RecyclerViewItemModel>
            ) {
                if (response.isSuccessful) {
                   //gpt val RecyclerViewItemModel = response.body()
                    // Proses data RecyclerViewItemModel di sini
                } else {
                 //   Toast.makeText(this@MainActivity,"Kegagalan pada Response", Toast)
                }
            }

            override fun onFailure(call: Call<RecyclerViewItemModel>, t: Throwable) {
                // Tangani kegagalan
            }
        })


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