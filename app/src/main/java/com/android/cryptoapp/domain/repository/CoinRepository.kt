package com.android.cryptoapp.domain.repository

import com.android.cryptoapp.data.remote.dto.CoinDetailDto
import com.android.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String) : CoinDetailDto
}