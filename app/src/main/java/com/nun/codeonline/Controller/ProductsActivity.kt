package com.nun.codeonline.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nun.codeonline.Adapters.ProductsAdapter
import com.nun.codeonline.R
import com.nun.codeonline.Services.DataService
import com.nun.codeonline.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProduct(categoryType))
    }
}
