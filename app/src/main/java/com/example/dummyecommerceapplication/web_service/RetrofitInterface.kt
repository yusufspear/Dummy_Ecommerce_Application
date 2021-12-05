package com.example.dummyecommerceapplication.web_service

import com.example.dummyecommerceapplication.web_service.module.Product
import com.example.dummyecommerceapplication.web_service.module.ProductItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


abstract class RetrofitService {

    companion object {
        private var instance: RetrofitInterface? = null
        fun getInstance(): RetrofitInterface? {
            if (instance == null) {
                synchronized(this) {

                    //It show Transmissions of Data in LogCat
                    val logging =
                        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
                    val client = OkHttpClient.Builder().addInterceptor(logging).build()

                    val retrofit = Retrofit.Builder().baseUrl("https://fakestoreapi.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build()
                    instance = retrofit.create(RetrofitInterface::class.java)

                    return instance

                }

            }
            return instance;

        }
    }
}


interface RetrofitInterface {

    @GET("{product}")
    fun getProduct(@Path("product") name: String): Response<ArrayList<ProductItem>>

}