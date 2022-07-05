package com.example.kotlinstudy.api

import com.example.kotlinstudy.data.APIData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APILIst {

    @GET("/B500001/drghtWaterMsg/infoList")
    fun getRequestInfoList(
        @Query("serviceKey") serviceKey: String,
        @Query("pageNo") pageNo: Int,
        @Query("numOfRows") numOfRows: Int,
        @Query("_type") _type: String,
        @Query("stDt") stDt: String,
        @Query("edDt") edDt: String,
        ): Call<APIData>
}