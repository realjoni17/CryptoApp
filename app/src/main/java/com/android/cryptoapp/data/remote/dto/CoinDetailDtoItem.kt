package com.android.cryptoapp.data.remote.dto

data class CoinDetailDtoItem(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)