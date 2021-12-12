package com.example.shoeshockerfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoeshockerfinal.databinding.ProductPageBinding
import repository.ShoeShockerRepository

class ProductPageActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ProductPageBinding.inflate(layoutInflater)
        setContentView(binding.root)







    }
}




