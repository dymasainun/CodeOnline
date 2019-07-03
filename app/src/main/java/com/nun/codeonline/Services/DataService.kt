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
        Product("Nundymas Graphic","$5","hat01"),
        Product("Nundymas Hat Graphic","$7","hat02"),
        Product("Nundymas Hat Graphic","$5","hat03"),
        Product("Nundymas Hat Graphic","$7","hat04")
    )
    val hoodies = listOf(
        Product("Nundymas Hoodie Graphic","$8","hoodie01"),
        Product("Nundymas Hoodie Red","$6","hoodie02"),
        Product("Nundymas Gray Hoodie","$8","hoodie03"),
        Product("Nundymas Black Hoodie","$6","hoodie04")
    )
    val shirt = listOf(
        Product("Nundymas Shirt Graphic","$9","shirt01"),
        Product("Nundymas Light Gray","$8","shirt02"),
        Product("Nundymas Logo Graphic","$9","shirt03"),
        Product("Nundymas Shirt Graphic","$8","shirt04"),
        Product("Studio","$9","shirt05")
    )
}