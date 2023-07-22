package com.dewakoding.ngajiquran.data.entity

import com.google.gson.annotations.SerializedName

data class Surah(

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("arabic")
	val arabic: String? = null,

	@field:SerializedName("translation")
	val translation: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("latin")
	val latin: String? = null,

	@field:SerializedName("num_ayah")
	val numAyah: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)