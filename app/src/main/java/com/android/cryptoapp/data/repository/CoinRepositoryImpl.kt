package com.android.cryptoapp.data.repository

import com.android.cryptoapp.data.remote.CoinPaprikaApi
import com.android.cryptoapp.data.remote.dto.CoinsDto
import com.android.cryptoapp.data.remote.dto.CoinDto
import com.android.cryptoapp.data.remote.dto.CoinDtoItem
import com.android.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinPaprikaApi
):CoinRepository{
    override suspend fun getCoins(): List<CoinDtoItem> {
        return api.getcoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDto {
        return api.getCoinById(coinId)
    }

}