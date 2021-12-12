package com.example.shoeshockerfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoeshockerfinal.databinding.ProductRecyclerviewLayoutBinding

class ProductPagesAdapter(private val data:MutableList<ShoeModel>,
): RecyclerView.Adapter<ProductPagesAdapter.ProductDataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ProductDataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ProductRecyclerviewLayoutBinding.inflate(layoutInflater,parent,false)
        return ProductDataViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ProductDataViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class ProductDataViewHolder(
        private val binding: ProductRecyclerviewLayoutBinding
        ): RecyclerView.ViewHolder(binding.root) {

            fun bind(shoeModel: ShoeModel) {
                binding.apply {
                    productViewTitle.text = shoeModel.productTitle
                    productImages.setImageResource(shoeModel.productImages[layoutPosition])
                    descriptionTextView.text = shoeModel.productDescription
                    productViewPrice.text = shoeModel.productPrice.toString()
                }
        }
    }
}


