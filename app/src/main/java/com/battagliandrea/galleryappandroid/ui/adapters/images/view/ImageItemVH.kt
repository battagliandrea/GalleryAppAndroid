package com.battagliandrea.galleryappandroid.ui.adapters.images.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.battagliandrea.galleryappandroid.R
import com.battagliandrea.galleryappandroid.ui.adapters.images.model.ImageItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.view_image_item.view.*

class ImageItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun render(item: ImageItem) = with(itemView) {

        tvTitle.text = item.title
        tvAuthor.text = "${context.getString(R.string.author)} : ${item.author}"

        Glide.with(this)
            .load(item.imageUrl)
            .apply(RequestOptions()
                .centerInside()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .dontAnimate())
            .into(iv)
    }
}