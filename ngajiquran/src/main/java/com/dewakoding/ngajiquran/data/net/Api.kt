package com.dewakoding.ngajiquran.data.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
interface Api {

    @GET("quran-surah")
    fun getListSurah(): Call<SurahResponse>

    @GET("quran-ayah?start=0&limit=1000")
    fun getAyahBySurahId(@Query("surah") surahId: Int): Call<AyahResponse>
}