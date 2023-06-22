import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugas1andes.databinding.RecycleViewBinding
import com.example.tugas1andes.listAgent

class Adapter(private val mutableList: MutableList<listAgent>) : RecyclerView.Adapter<Adapter.ViewHolderCustom>() {
    private var listData = mutableListOf<listAgent>()

    inner class ViewHolderCustom(private val binding: RecycleViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: listAgent) {
            with(binding) {
                Glide.with(itemView.context).load(item.image).into(gambarItem)
                judulItem.text = item.name
                deskripsiItem.text = item.description
                rarityItem.text = item.rarity
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCustom {
        val binding = RecycleViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderCustom(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderCustom, position: Int) {
        holder.bindData(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    fun isiList(listItem: MutableList<listAgent>) {
        listData.clear()
        listData.addAll(listItem)
    }
}
