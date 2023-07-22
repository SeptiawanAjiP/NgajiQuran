package com.dewakoding.ngajiquran.data.entity

import com.google.gson.annotations.SerializedName


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/


data class Ayah(

    @field:SerializedName("manzil")
    val manzil: Int? = null,

    @field:SerializedName("kitabah")
    val kitabah: String? = null,

    @field:SerializedName("juz")
    val juz: Int? = null,

    @field:SerializedName("ayah")
    val ayah: Int? = null,

    @field:SerializedName("quarter_hizb")
    val quarterHizb: Int? = null,

    @field:SerializedName("surah_id")
    val surahId: Int? = null,

    @field:SerializedName("updated_at")
    val updatedAt: Any? = null,

    @field:SerializedName("arabic")
    val arabic: String? = null,

    @field:SerializedName("translation")
    val translation: String? = null,

    @field:SerializedName("arabic_words")
    val arabicWords: Any? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("page")
    val page: Int? = null,

    @field:SerializedName("latin")
    val latin: String? = null,

    @field:SerializedName("surah")
    val surah: Surah? = null,

    @field:SerializedName("footnotes")
    val footnotes: String? = null
)

