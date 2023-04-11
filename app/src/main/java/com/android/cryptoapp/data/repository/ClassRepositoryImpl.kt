package com.android.cryptoapp.data.repository

import com.android.cryptoapp.data.remote.CoinPaprikaApi
import com.android.cryptoapp.data.remote.dto.CoinDetailDto
import com.android.cryptoapp.data.remote.dto.CoinDto
import com.android.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class ClassRepositoryImpl @Inject constructor(
    private val api : CoinPaprikaApi
):CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getcoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}