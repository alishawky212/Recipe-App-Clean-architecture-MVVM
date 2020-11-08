package com.example.cache.room

import androidx.room.Dao
import androidx.room.Query
import com.example.cache.models.RecipeCacheModel
import com.example.cache.models.RecipeCacheModel.Companion.TABLE_NAME
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {

    @Query("select * from $TABLE_NAME")
    fun getProducts() : Flow<List<RecipeCacheModel>>

}