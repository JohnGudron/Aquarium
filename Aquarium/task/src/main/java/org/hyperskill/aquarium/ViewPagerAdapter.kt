package org.hyperskill.aquarium

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ViewPagerAdapter (_nameAnimals: List<String>, _descriptionAnimals: List<String>, _imageAnimals: List<String>): RecyclerView.Adapter<PageViewHolder>() {

    private val nameAnimals = _nameAnimals
    private val imageAnimals = _imageAnimals
    private val descriptionAnimals = _descriptionAnimals

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        return PageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_pager_item, parent, false)
        )
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        holder.itemView.run {
            val nameView = findViewById<TextView>(R.id.tv_name)
            val descriptionView = findViewById<TextView>(R.id.tv_description)
            val imageView = findViewById<ImageView>(R.id.image_view)

            nameView.text = nameAnimals[position]
            descriptionView.text = descriptionAnimals[position]
            Picasso.get()
                .load(imageAnimals[position])
                .fit().centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageView)
        }

    }

}

class PageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)