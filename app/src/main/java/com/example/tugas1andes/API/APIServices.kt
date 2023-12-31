
import com.example.tugas1andes.RecyclerViewItemModel
import com.example.tugas1andes.ui.home.HomeFragment
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIServices {
    @GET("api/en/agents.json")
    fun getAgentList() : Call<List<RecyclerViewItemModel>>
}
class APIConfiguration{
    companion object{
        fun getAPIServices(mainActivity: HomeFragment):APIServices {
            val client = OkHttpClient.Builder().build()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://bymykel.github.io/CSGO-API/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return retrofit.create(APIServices::class.java)
        }
    }
}