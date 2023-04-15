package com.android.cryptoapp.domain.repository

import com.android.cryptoapp.data.remote.dto.CoinsDto
import com.android.cryptoapp.data.remote.dto.CoinDto
import com.android.cryptoapp.data.remote.dto.CoinDtoItem

interface CoinRepository {
    suspend fun getCoins(): List<CoinDtoItem>
    suspend fun getCoinById(coinId: String) : CoinDto
}