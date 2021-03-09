package com.ainsigne.mobiletechchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ainsigne.mobiletechchallenge.model.MovieDetailsDB

/**
 * View model to observe movie details retrieval
 */
class MovieDetailsViewModel(private val repo : MovieDetailsRepository) : ViewModel() {

    /**
     * retrieves the movie details already cached
     * @param id as [String] the imdb id to identify with the movie details
     */
    fun getMovieDetails(id : String) : LiveData<MovieDetailsDB>{
        return repo.getMovieDetails(id)
    }

    /**
     * fetch movie details when data is not available yet
     * @param id as [String] the imdb id to identify with the movie details
     */
    fun fetchMovieDetails(id : String){
        repo.fetchMovieDetails(id)
    }

}