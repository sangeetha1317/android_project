package com.example.android_project1.service

import com.example.android_project1.data.model.BookModel
import com.example.android_project1.data.model.CharacterModel
import com.example.android_project1.data.model.SpellModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("en/spells")
    suspend fun getSpells() : Response<SpellModel>

    @GET("en/books")
    suspend fun getBooks() : Response<BookModel>

    @GET("en/characters")
    suspend fun getCharacters() : Response<CharacterModel>

}