package com.example.shoeshockerfinal

data class ShoeModel(
    val productTitle: String,
    val productDescription: String,
    val productPrice: Int,
    val productImages: MutableList<Int> = mutableListOf(),
) {

}