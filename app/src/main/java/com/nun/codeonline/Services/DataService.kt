package com.nun.codeonline.Services

import com.nun.codeonline.Model.Category
import com.nun.codeonline.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Nundymas Graphic","$5","hat1"),
        Product("Nundymas Hat Graphic","$7","hat2"),
        Product("Nundymas Hat Graphic","$5","hat3"),
        Product("Nundymas Hat Graphic","$7","hat4")
    )
    val hoodies = listOf(
        Product("Nundymas Hoodie Graphic","$8","hoodie1"),
        Product("Nundymas Hoodie Red","$6","hoodie2"),
        Product("Nundymas Gray Hoodie","$8","hoodie3"),
        Product("Nundymas Black Hoodie","$6","hoodie4")
    )
    val shirt = listOf(
        Product("Nundymas Shirt Graphic","$9","shirt1"),
        Product("Nundymas Light Gray","$8","shirt2"),
        Product("Nundymas Logo Graphic","$9","shirt3"),
        Product("Nundymas Shirt Graphic","$8","shirt4"),
        Product("Studio","$9","shirt5")
    )
    val digitalGood = listOf<Product>()

    fun getProduct(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirt
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}