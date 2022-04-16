package com.cs.animeonlineappclean.di

import com.cs.animeonlineappclean.common.Constants
import com.cs.animeonlineappclean.data.network.AnimeInstanceApi
import com.cs.animeonlineappclean.data.repository.AnimeRepositoryImplementation
import com.cs.animeonlineappclean.domain.repository.AnimeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AnimeModule {

    @Provides
    @Singleton
    fun provideApi(): AnimeInstanceApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AnimeInstanceApi::class.java)
    }

    @Provides
    @Singleton
    fun provideAnimeRepository(api: AnimeInstanceApi) :AnimeRepository{
        return AnimeRepositoryImplementation(api = api)
    }

}