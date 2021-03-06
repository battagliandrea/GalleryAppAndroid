package com.battagliandrea.galleryappandroid.ui.adapters.images.base

import androidx.recyclerview.widget.DiffUtil
import com.battagliandrea.galleryappandroid.ui.adapters.images.model.BaseImageItem
import com.battagliandrea.galleryappandroid.ui.adapters.images.model.ImageItem

class  ImagesDiffUtils(
    private val oldThumbs: List<BaseImageItem>,
    private val newThumbs: List<BaseImageItem>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldThumbs.size

    override fun getNewListSize(): Int = newThumbs.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldThumbs[oldItemPosition].hashCode() == newThumbs[newItemPosition].hashCode()
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val oldImage = oldThumbs[oldPosition]
        val newImage = newThumbs[newPosition]
        return oldImage.id == newImage.id
                && oldImage is ImageItem
                && newImage is ImageItem
                && oldImage.imageUrl == newImage.imageUrl
                && oldImage.title == newImage.title
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}