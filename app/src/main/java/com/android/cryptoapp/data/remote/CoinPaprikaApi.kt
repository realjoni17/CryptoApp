package com.android.cryptoapp.data.remote

import com.android.cryptoapp.data.remote.dto.CoinsDto
import com.android.cryptoapp.data.remote.dto.CoinDto
import com.android.cryptoapp.data.remote.dto.CoinDtoItem
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET ("/v1/coins")
    suspend fun getcoins() : List<CoinDtoItem>
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDto
}