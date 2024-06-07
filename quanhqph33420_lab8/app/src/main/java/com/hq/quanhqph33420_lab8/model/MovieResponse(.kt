package com.hq.quanhqph33420_lab8.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("_id") val _id: String,
    @SerializedName("name") val name: String,
    @SerializedName("img") val img: String,
    @SerializedName("time") val time: String,
    @SerializedName("type") val type: String,
    @SerializedName("description") val description: String,

    )

fun MovieResponse.toMovie(): Phim {
    return Phim(
        _id = this._id,
        name = this.name,
        img = this.img,
        time = this.time,
        type = this.type,
        description = this.description
    )
}