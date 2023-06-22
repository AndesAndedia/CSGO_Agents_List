
import com.example.tugas1andes.MainActivity
import com.example.tugas1andes.RecyclerViewItemModel
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIServices {
    @GET("/list")
    fun getAgentList() : Call<RecyclerViewItemModel>
}
class APIConfiguration{
    companion object{
        fun getAPIServices(mainActivity: MainActivity):APIServices {
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