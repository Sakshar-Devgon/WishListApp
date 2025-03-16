package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
// step 1 in the implementation of Room Database

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyList{
    val WishList = listOf(
        Wish(title = "Google Watch 2" , description = "An Android Watch"),
        Wish(title = "Boat nirvana Ion " , description = " premium earbuds of signature sound "),
        Wish(title = "Hp Victus 15" , description = "Gaming Laptop "),
        Wish(title = "Hunter350" , description = "RoyalEnfield Bike "),
    )
}

