package com.example.stores

import androidx.room.*

@Dao
interface StoreDao {
    @Query("SELECT * FROM StoreEntity")
    fun getAllStore(): MutableList<StoreEntity>

    @Query("SELECT * FROM storeEntity where id= :id")
    fun getStoreById(id:Long): StoreEntity

    @Insert
    fun addStore(storeEntity: StoreEntity): Long

    @Update
    fun updateStore(storeEntity: StoreEntity)

    @Delete
    fun deleteStore(storeEntity: StoreEntity)
}