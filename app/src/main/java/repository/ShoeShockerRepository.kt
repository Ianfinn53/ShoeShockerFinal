package repository

import com.example.shoeshockerfinal.R
import models.ShoeModel
import models.TitleModel

object ShoeShockerRepository {

    private val titlePage = mutableListOf(
        TitleModel("Infinite 3 Storm Running Shoes", 140, R.drawable.infinite3_1),
        TitleModel("Sonic 4 Running Shoes", 110, R.drawable.sonic4_1),
        TitleModel("Charged Assert 9 Running Shoes", 70, R.drawable.charged9_1),
        TitleModel("Phantom 2 Storm Running Shoes", 160, R.drawable.phantom2_1)

    )

    private val infinite3 = listOf(
        ShoeModel(
        "Men's UA HOVR™ Infinite 3 Storm Running Shoes",
        """CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner
            Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
            UA Storm technology treated upper repels water without sacrificing breathability
            UA Reactor insulation adapts to your activity level—warmer when you slow down & cooler when you pick up""",
        140,
        R.drawable.infinite3_1,
        R.drawable.infinite3_2,
        R.drawable.infinite3_3,
        R.drawable.infinite3_4)
    )

    private val sonic4 = listOf(
        ShoeModel(
            "Men's UA HOVR™ Sonic 4 Running Shoes",
        """CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner
         Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
         Lightweight engineered mesh upper for ultimate breathability
         Tongue is attached to the footbed by stretchable support wings to maintain a snug fit throughout the foot""",
        110,
        R.drawable.sonic4_1,
        R.drawable.sonic4_2,
        R.drawable.sonic4_3,
        R.drawable.sonic4_4)
    )

    private val charged9 =  listOf(
        ShoeModel(
            "Men's UA Charged Assert 9 Running Shoes",
        """Lightweight mesh upper with 3-color digital print delivers complete breathability
            Durable leather overlays for stability & that locks in your midfoot
            EVA sockliner provides soft, step-in comfort
            Charged Cushioning® midsole uses compression molded foam for ultimate responsiveness & durability""",
        70,
        R.drawable.charged9_1,
        R.drawable.charged9_2,
        R.drawable.charged9_3,
        R.drawable.charged9_4)
    )

    private val phantom2 = listOf(
        ShoeModel("Men's UA HOVR™ Phantom 2 Storm Running Shoes",
        """Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
            Water-resistant, dual-layer upper keeps your feet dry & has a sock-like fit & feel
            Molded midfoot panel for added structure & plush interior cushioning
            Ultra-breathable, SpeedForm® 2.0 sockliner provides softer underfoot support""",
        160,
        R.drawable.phantom2_1,
        R.drawable.phantom2_2,
        R.drawable.phantom2_3,
        R.drawable.phantom2_4)
    )

    fun getTitle() = titlePage

    fun getProduct(product: String): List<ShoeModel>{
        return when (product){
            "Infinite 3 Storm Running Shoes" -> infinite3
            "Sonic 4 Running Shoes" -> sonic4
            "Charged Assert 9 Running Shoes" -> charged9
            "Phantom 2 Storm Running Shoes" -> phantom2
            else -> emptyList()
        }
    }



}





