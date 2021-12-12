package com.example.shoeshockerfinal


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoeshockerfinal.databinding.ActivityMainBinding
import repository.ShoeShockerRepository

class MainActivity : AppCompatActivity() {

    companion object{
        const val SHOE_TITLE = "shoe_title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.productList.apply {
            adapter = ShoeSelectionAdapter(ShoeShockerRepository.getShoes()
            ) { shoe ->
                val intent = Intent(this@MainActivity, ProductPageActivity::class.java)
                    intent.putExtra(SHOE_TITLE, shoe.productTitle)
                startActivity(intent)
            }
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }
}

