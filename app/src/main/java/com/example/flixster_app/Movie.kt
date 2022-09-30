package com.example.flixster_app

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var posterImageUrl: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("release_date")
    var releaseDate: String? = null

}