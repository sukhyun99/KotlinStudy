package com.example.kotlinstudy.data

import java.io.Serializable

data class APIData(
    val resultCode: Int,
    val resultMsg: String,
    val numOfRows: Int,
    val pageNo: Int,
    val totalCount: Int,
    val drghtFrcstPresnatnDt: String,
    val sigunNm: String,
    val frcstLiv: String,
    val frcstLivMsg: String,
    val frcstFarm: String,
    val frcstFarmMsg: String,
)
