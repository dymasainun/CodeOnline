package com.nun.codeonline.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.nun.codeonline.Model.Category
import com.nun.codeonline.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.holder>() {

    override fun onBindViewHolder(p0: holder, p1: Int) {
        p0?.bindCategory(categories[p1], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item, p0, false)
        return holder(view, itemClick)
    }

    inner class holder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryimage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}