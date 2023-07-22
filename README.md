# NgajiQuran
![image](https://raw.githubusercontent.com/SeptiawanAjiP/NgajiQuran/master/image.png)

NgajiQuran is a library for getting Surah & Ayah Data of Al-Quran. This API data source comes from [quran.kemenag.go.id](https://quran.kemenag.go.id)

## Installation

Use Gradle. Add it in your settings.gradle at the end of repositories:

```bash
dependencyResolutionManagement {
    repositories {
        ....
        maven { url 'https://jitpack.io' }
    }
}
```
then, add the dependecy in your build.gradle file (Module)
```bash
dependencies {
	 implementation 'com.github.SeptiawanAjiP:NgajiQuran:Tag'
}
```
replace Tag with the version. Don't forget to add internet permission on your AndroidManifest

## Usage

```kotlin
NgajiQuran.getListSurah { listSurah ->
    Log.d("SURAH SIZE", ""+listSurah!!.size)
}

// set surah id as a parameter
NgajiQuran.getListAyahBySurahId(1) {
        listAyah ->
    Log.d("AYAH SIZE ", ""+listAyah!!.size)
}
```