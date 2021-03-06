package com.battagliandrea.galleryappandroid.di.module.data


import com.battagliandrea.data.database.RoomDataSource
import com.battagliandrea.data.networking.RedditApiDataSource
import com.battagliandrea.galleryappandroid.data.database.datasource.RoomDataSourceImpl
import com.battagliandrea.galleryappandroid.data.networking.RedditApiDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class DataSourceModule {

    @Provides
    @Singleton
    fun provideRedditApiDataSource(ds: RedditApiDataSourceImpl): RedditApiDataSource = ds

    @Provides
    @Singleton
    fun provideRoomDataSource(ds: RoomDataSourceImpl): RoomDataSource = ds

}
