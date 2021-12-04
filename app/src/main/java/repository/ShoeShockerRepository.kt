package repository

import com.example.shoeshockerfinal.ProductPagesModel
import com.example.shoeshockerfinal.R
import com.example.shoeshockerfinal.ShoeModel

object ShoeShockerRepository {

    private val shoeList = listOf(
        ShoeModel ("Men's UA HOVR Sonic 4 Running Shoes", "$110.00", R.drawable.sonic4_1),
        ShoeModel ("Men's UA Charged Assert 9 Running Shoes", "$70.00",  R.drawable.charged9_1),
        ShoeModel("Men's UA HOVR Phantom 2 Storm Running Shoes", "$160.00",  R.drawable.phantom2_1),
        ShoeModel("Men's UA HOVR Infinite 3 Storm Running Shoes", "$140.00",  R.drawable.infinite3_1)

    )

    private val infinite3 = listOf(
        ProductPagesModel (
        "Men's UA HOVR™ Infinite 3 Storm Running Shoes",
        R.drawable.infinite3_1, R.drawable.infinite3_2, R.drawable.infinite3_3, R.drawable.infinite3_4,
        "CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner",
        "Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward",
        "UA Storm technology treated upper repels water without sacrificing breathability",
        "UA Reactor insulation adapts to your activity level—warmer when you slow down & cooler when you pick up",
        "$140.00")
    )

    private val sonic4 = listOf(
        ProductPagesModel(
            "Men's UA HOVR™ Sonic 4 Running Shoes",
            R.drawable.sonic4_1, R.drawable.sonic4_2, R.drawable.sonic4_3, R.drawable.sonic4_4,
            "CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner",
            "Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward",
            "Lightweight engineered mesh upper for ultimate breathability",
            "Tongue is attached to the footbed by stretchable support wings to maintain a snug fit throughout the foot",
            "$110.00"
        )
    )

    private val charged9 = listOf(
        ProductPagesModel(
            "Men's UA Charged Assert 9 Running Shoes",
            R.drawable.charged9_1, R.drawable.charged9_2, R.drawable.charged9_3, R.drawable.charged9_4,
            "Lightweight mesh upper with 3-color digital print delivers complete breathability",
            "Durable leather overlays for stability & that locks in your midfoot",
            "EVA sockliner provides soft, step-in comfort",
            "Charged Cushioning® midsole uses compression molded foam for ultimate responsiveness & durability",
            "$70.00"
        )
    )

    private val phantom2 = listOf(
        ProductPagesModel(
            "Men's UA HOVR™ Phantom 2 Storm Running Shoes",
            R.drawable.phantom2_1, R.drawable.phantom2_2, R.drawable.phantom2_3, R.drawable.phantom2_4,
            "Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward",
            "Water-resistant, dual-layer upper keeps your feet dry & has a sock-like fit & feel",
            "Molded midfoot panel for added structure & plush interior cushioning",
            "Ultra-breathable, SpeedForm® 2.0 sockliner provides softer underfoot support",
            "$160.00"
        )
    )

    fun getShoes() = shoeList

    fun getProduct(product: String): List<ProductPagesModel>{
        return when (product){
            "Men's UA HOVR Sonic 4 Running Shoes" -> sonic4
            "Men's UA Charged Assert 9 Running Shoes" -> charged9
            "Men's UA HOVR Phantom 2 Storm Running Shoes" -> phantom2
            "Men's UA HOVR Infinite 3 Storm Running Shoes" -> infinite3
            else -> emptyList()

       }
   }

}