package com.battagliandrea.domain.interactions

import com.battagliandrea.domain.model.Image
import com.battagliandrea.domain.repository.ImageRepository
import javax.inject.Inject

class RemoveBookmark @Inject constructor(
        private val imageRepository: ImageRepository
){

    suspend operator fun invoke(image: Image): Image{
        return imageRepository.removeBookmark(image)
    }
}


