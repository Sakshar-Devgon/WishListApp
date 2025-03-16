package com.example.wishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
// Step 3 we are creating the Room DataBase
@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao(): WishDao
}

// step 6 so we can go some higher level jump to object Graph