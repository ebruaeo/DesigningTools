package com.example.designingtools.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class GdgChapter(
    @Json(name = "chapter_name") val name: String,
    @Json(name = "cityarea") val city: String,
    val country: String,
    val region: String,
    val website: String,
    val geo: LatLong
): Parcelable

@Parcelize
data class LatLong(
    val lat: Double,
    @Json(name = "lng")
    val long: Double
) : Parcelable

@Parcelize
data class GdgResponse(
    @Json(name = "filters_") val filters: Filter,
    @Json(name = "data") val chapters: List<GdgChapter>
): Parcelable

@Parcelize
data class Filter(
    @Json(name = "region") val regions: List<String>
): Parcelable