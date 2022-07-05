package com.example.kotlinstudy.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {
    companion object {
        private var retrofit: Retrofit? = null
        private val BASE_URL = "http://apis.data.go.kr"
//        private val SERVICE_KEY = "9FNSfnhkG%2B1WbctErcEfdXtf92YWSmGWGfuvXmHUUnrklWm6qXqxau2ex95ioMvW%2FDi%2B9vqvAXyRrsWRF2QqYw%3D%3D"
        private val SERVICE_KEY = "9FNSfnhkG+1WbctErcEfdXtf92YWSmGWGfuvXmHUUnrklWm6qXqxau2ex95ioMvW/Di+9vqvAXyRrsWRF2QqYw=="

        fun getRetrofit(): Retrofit {
            if (this.retrofit == null) {
                this.retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
            }

            return this.retrofit!!
        }

        fun getServiceKey(): String {
            return this.SERVICE_KEY
        }
    }
}