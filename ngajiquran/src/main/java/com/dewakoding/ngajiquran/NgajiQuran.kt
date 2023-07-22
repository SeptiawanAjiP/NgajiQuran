package com.dewakoding.ngajiquran

import com.dewakoding.ngajiquran.data.entity.Ayah
import com.dewakoding.ngajiquran.data.entity.Surah
import com.dewakoding.ngajiquran.data.net.AyahResponse
import com.dewakoding.ngajiquran.data.net.RetrofitClient
import com.dewakoding.ngajiquran.data.net.SurahResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
class NgajiQuran {
    companion object Builder {

        fun getListSurah(callback: (listSurah: List<Surah>?) -> Unit) {
            RetrofitClient.instance.getListSurah().enqueue(object: Callback<SurahResponse> {
                override fun onResponse(call: Call<SurahResponse>, response: Response<SurahResponse>) {
                    callback.invoke(response.body()!!.data!!)

                }

                override fun onFailure(call: Call<SurahResponse>, t: Throwable) {
                    callback.invoke(null)
                }
            })
        }

        fun getListAyahBySurahId(surahId: Int, callback: (listAyah: List<Ayah>?) -> Unit) {
            RetrofitClient.instance.getAyahBySurahId(surahId).enqueue(object: Callback<AyahResponse> {
                override fun onResponse(
                    call: Call<AyahResponse>,
                    response: Response<AyahResponse>
                ) {
                    callback.invoke(response.body()!!.data!!)
                }

                override fun onFailure(call: Call<AyahResponse>, t: Throwable) {
                    callback.invoke(null)
                }
            })
        }
    }
}