package com.android.cryptoapp.data.remote.dto

import com.android.cryptoapp.domain.model.Coin

data class CoinDtoItem(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)
fun CoinDtoItem.toCoin() : Coin{
    return Coin(
        id = id,
        isActive = is_active,
        name = name,
        rank = rank,
        symbol = symbol
    )
}