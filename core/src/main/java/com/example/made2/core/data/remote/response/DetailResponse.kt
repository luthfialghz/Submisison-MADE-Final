package com.example.made2.core.data.remote.response

import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("data")
    val data: DataResponse
)
