package com.example.shoeshockerfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoeshockerfinal.databinding.LayoutShoeListItemsBinding

class ShoeSelectionAdapter (private val data: List<ShoeModel>,
                            private val onClick: (ShoeModel) -> Unit
): RecyclerView.Adapter<ShoeSelectionAdapter.ShoeDataViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ShoeDataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LayoutShoeListItemsBinding.inflate(layoutInflater, parent, false)
        return ShoeDataViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ShoeDataViewHolder, position: Int) {
        val shoe = data[position]
        holder.bind(shoe)
          }




    class ShoeDataViewHolder(
    private val binding: LayoutShoeListItemsBinding
    ):RecyclerView.ViewHolder(binding.root) {

        fun bind(shoeModel: ShoeModel){
            binding.apply {
                titleOfShoe.text = shoeModel.productTitle
                priceOfShoe.text = shoeModel.productPrice.toString()
                shoeImage.setImageResource(shoeModel.productImages.first())
            }
        }

    }
}







