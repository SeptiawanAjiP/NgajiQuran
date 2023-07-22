package com.dewakoding.ngajiquran.data.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
object RetrofitClient {
    private const val BASE_URL = "https://web-api.qurankemenag.net/"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

        retrofit.create(Api::class.java)

    }
}