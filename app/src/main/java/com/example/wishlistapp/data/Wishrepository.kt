package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow
// STEP 4 IN THIS Room Database Implemetation
//yeh Room Database ka Step 4 (Repository Layer) hai! 🚀
//Iska kaam hai Database (DAO) aur ViewModel ke beech ek bridge ka kaam karna.
//Matlab ab direct DAO use nahi karna padega, sab kuch Repository ke through manage hoga.
class Wishrepository(private val wishDao: WishDao) {
    suspend fun addWish(wish: Wish){
        wishDao.addWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id: Long) : Flow<Wish>{
        return wishDao.getAWishById(id)
    }

    suspend fun updateAWish(wish:Wish){
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}

// for step 5 now jump in the viewModel there i used this Wishrepository