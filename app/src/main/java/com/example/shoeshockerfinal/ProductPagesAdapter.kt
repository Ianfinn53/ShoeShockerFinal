package com.example.shoeshockerfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoeshockerfinal.databinding.ProductRecyclerviewLayoutBinding

class ProductPagesAdapter(private val data: List<ProductPagesModel>,
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

            fun bind(productModel: ProductPagesModel) {
                binding.apply {
                productViewTitle.text = productModel.productTitle
                productImageView1.setImageResource(productModel.productImage1)
                productImageView2.setImageResource(productModel.productImage2)
                productImageView3.setImageResource(productModel.productImage3)
                productImageView4.setImageResource(productModel.productImage4)
                productDescription1.text = productModel.Description1
                productDescription2.text = productModel.Description2
                productDescription3.text = productModel.Description3
                productDescription4.text = productModel.Description4
                productViewPrice.text = productModel.productPrice
                }
        }
    }
}


