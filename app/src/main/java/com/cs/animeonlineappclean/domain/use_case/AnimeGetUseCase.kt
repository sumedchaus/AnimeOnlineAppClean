package com.cs.animeonlineappclean.domain.use_case

import com.cs.animeonlineappclean.data.model.dto.toAnimeData
import com.cs.animeonlineappclean.domain.model.AnimeData
import com.cs.animeonlineappclean.domain.repository.AnimeRepository
import com.cs.newsappcleanarchvisionandroid.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class AnimeGetUseCase @Inject constructor(
    private val repository: AnimeRepository
) {

    operator fun invoke() : Flow<Resource<List<AnimeData>>> = flow {
        try {
            emit(Resource.Loading<List<AnimeData>>(""))
            val animeData = repository.getAnimeList().data.documents.map {
                it.toAnimeData()
            }
            emit(Resource.Success<List<AnimeData>>(animeData))

        } catch (e: HttpException){
            emit(Resource.Error<List<AnimeData>>(e.localizedMessage?: "An Unexpected Error Occurred"))

        } catch (e:IOException){
            emit(Resource.Error<List<AnimeData>>(e.localizedMessage?: "Couldn't reach the server"))


        }
    }

}