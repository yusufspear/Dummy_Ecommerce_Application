package com.example.dummyecommerceapplication.web_service.module


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("rate")
    val rate: Double,
    @SerializedName("count")
    val count: Int
)