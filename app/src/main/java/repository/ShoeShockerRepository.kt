 package repository

 import com.example.shoeshockerfinal.R
 import com.example.shoeshockerfinal.ShoeModel

 object ShoeShockerRepository {


     private fun shoeList(): MutableList<ShoeModel>{
         var shoesInfo = mutableListOf<ShoeModel>()


 shoesInfo.add(ShoeModel(
 "Men's UA HOVR™ Infinite 3 Storm Running Shoes",
 """
    CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner
    Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
    UA Storm technology treated upper repels water without sacrificing breathability
    UA Reactor insulation adapts to your activity level—warmer when you slow down & cooler when you pick up

 """.trimIndent(),
 140,
    mutableListOf(
        R.drawable.infinite3_1,
        R.drawable.infinite3_2,
        R.drawable.infinite3_3,
        R.drawable.infinite3_4,
        )
    )
 )
 shoesInfo.add(ShoeModel(
 "Men's UA HOVR™ Sonic 4 Running Shoes",
 """
 CONNECTS TO UA MAPMYRUN™: tracks & analyzes your running metrics to help make you a better runner
 Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
 Lightweight engineered mesh upper for ultimate breathability
 Tongue is attached to the footbed by stretchable support wings to maintain a snug fit throughout the foot

 """.trimIndent(),
 110,
    mutableListOf(
        R.drawable.sonic4_1,
        R.drawable.sonic4_2,
        R.drawable.sonic4_3,
        R.drawable.sonic4_4,
        )
     )
 )
 shoesInfo.add(ShoeModel(
 "Men's UA Charged Assert 9 Running Shoes",
 """
    Lightweight mesh upper with 3-color digital print delivers complete breathability
    Durable leather overlays for stability & that locks in your midfoot
    EVA sockliner provides soft, step-in comfort
    Charged Cushioning® midsole uses compression molded foam for ultimate responsiveness & durability

 """.trimIndent(),
 70,
     mutableListOf(
        R.drawable.charged9_1,
        R.drawable.charged9_2,
        R.drawable.charged9_3,
        R.drawable.charged9_4,
        )
    )
 )

 shoesInfo.add(ShoeModel(
 "Men's UA HOVR™ Phantom 2 Storm Running Shoes",
 """
    Responsive UA HOVR™ cushioning reduces impact, returns energy, and helps propel you forward
    Water-resistant, dual-layer upper keeps your feet dry & has a sock-like fit & feel
    Molded midfoot panel for added structure & plush interior cushioning
    Ultra-breathable, SpeedForm® 2.0 sockliner provides softer underfoot support
 """.trimIndent(),
 160,
     mutableListOf(
        R.drawable.phantom2_1,
        R.drawable.phantom2_2,
        R.drawable.phantom2_3,
        R.drawable.phantom2_4,
        )
     )
 )

 return shoesInfo
    }
     fun getShoes() = shoeList()
 }