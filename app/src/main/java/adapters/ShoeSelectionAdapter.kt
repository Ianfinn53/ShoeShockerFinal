package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import models.ShoeModel
import com.example.shoeshockerfinal.databinding.LayoutShoeListItemsBinding
import models.TitleModel

class ShoeSelectionAdapter(
    private val data: MutableList<TitleModel>,
    private val onClick: (TitleModel) -> Unit
): RecyclerView.Adapter<ShoeSelectionAdapter.ShoeDataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeDataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LayoutShoeListItemsBinding.inflate(layoutInflater, parent, false)
        return ShoeDataViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ShoeDataViewHolder, position: Int) {
        val shoe = data[position]
        holder.bind(shoe)
        holder.itemView.setOnClickListener{
            onClick(data[position])
        }
    }

    class ShoeDataViewHolder(
        private val binding: LayoutShoeListItemsBinding
    ):RecyclerView.ViewHolder(binding.root) {

        fun bind(titleModel: TitleModel){
            binding.apply {
                titleOfShoe.text = titleModel.title
                priceOfShoe.text = titleModel.price.toString()
                shoeImage.setImageResource(titleModel.image)
            }
        }

    }
}







