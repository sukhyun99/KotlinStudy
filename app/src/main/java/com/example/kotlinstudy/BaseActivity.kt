package com.example.kotlinstudy

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinstudy.api.APILIst
import com.example.kotlinstudy.api.ServerAPI

abstract class BaseActivity: AppCompatActivity() {
    lateinit var mContext: Context
    lateinit var apiList: APILIst

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this

        val myRetrofit = ServerAPI.getRetrofit()
        apiList = myRetrofit.create(APILIst::class.java)
    }

    abstract fun setupEvents()
    abstract fun setValues()
}