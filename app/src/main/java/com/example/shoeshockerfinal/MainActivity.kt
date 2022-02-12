package com.example.shoeshockerfinal


import adapters.ShoeSelectionAdapter
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

        binding.productSelection.apply {
            adapter = ShoeSelectionAdapter(
                ShoeShockerRepository.getTitle()
            ) { shoe ->
                val intent = Intent(this@MainActivity, ProductPageActivity::class.java)
                //Here you pass the title.  look at the constant.
                intent.putExtra(SHOE_TITLE, shoe.title)
                startActivity(intent)
            }
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }






}

