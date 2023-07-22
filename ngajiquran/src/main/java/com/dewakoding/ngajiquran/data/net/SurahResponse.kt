package com.dewakoding.ngajiquran.data.net

import com.dewakoding.ngajiquran.data.entity.Surah
import com.google.gson.annotations.SerializedName

data class SurahResponse(

	@field:SerializedName("data")
	val data: List<Surah>? = null
)