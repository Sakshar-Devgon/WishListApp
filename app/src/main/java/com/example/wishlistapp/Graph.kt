package com.example.wishlistapp

import android.content.Context
import androidx.room.Room
import com.example.wishlistapp.data.WishDatabase
import com.example.wishlistapp.data.Wishrepository
// step 6 for higher layer here
object Graph {
    //so object graph here declares singleton named graph .In Kotlin object Keyword is used to declare a Singleton.
    // singleton is a class of which only one instance will exist in the application so that means we cannot create another graph object that would give a different name or whatever

    lateinit var database: WishDatabase

    val wishRepository by lazy {
        Wishrepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java,"wishlist.db").build()
        // now this will build out database the moment we call out provide function !
    }
}