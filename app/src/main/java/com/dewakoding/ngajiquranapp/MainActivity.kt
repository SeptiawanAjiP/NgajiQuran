package com.dewakoding.ngajiquranapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.dewakoding.ngajiquran.NgajiQuran
import com.dewakoding.ngajiquran.data.entity.Surah
import com.dewakoding.ngajiquranapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var list: MutableList<Surah>

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // get list surah
        NgajiQuran.getListSurah { listSurah ->
            Log.d("SURAH SIZE", ""+listSurah!!.size)
        }

        // get list ayah by surah id
        NgajiQuran.getListAyahBySurahId(1) {
            listAyah ->
            Log.d("AYAH SIZE ", ""+listAyah!!.size)
        }

    }
}