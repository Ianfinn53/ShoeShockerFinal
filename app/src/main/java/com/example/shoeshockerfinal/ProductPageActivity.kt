package com.example.shoeshockerfinal

import adapters.ProductPagesAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoeshockerfinal.databinding.ProductPageBinding
import repository.ShoeShockerRepository

class ProductPageActivity: AppCompatActivity() {

    companion object{
        const val SHOEPICTURE = "SHOE PICTURE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ProductPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // here it's looking for shoePicture, but the problem is you only passed it the title.
        // thus all you have is nulls, or ""
        // consider passing all the data, or adding a function to pass and id, and look up the record
        //  by that id.
        val shoes = intent.getStringExtra(SHOEPICTURE).orEmpty()
        val products = ShoeShockerRepository.getProduct(shoes)

        binding.productPageRecyclerview.apply {
            adapter = ProductPagesAdapter(products)
            layoutManager = LinearLayoutManager(this@ProductPageActivity)
            setHasFixedSize(true)
        }



    }
}





