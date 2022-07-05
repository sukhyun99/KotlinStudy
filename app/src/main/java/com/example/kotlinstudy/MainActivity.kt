package com.example.kotlinstudy

import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinstudy.api.ServerAPI
import com.example.kotlinstudy.data.APIData
import com.example.kotlinstudy.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        binding.btnMoveToMain2.setOnClickListener {
            apiList.getRequestInfoList(ServerAPI.getServiceKey(), 1, 10, "json", "20220501","20220530")
                .enqueue(object : Callback<APIData> {
                    override fun onResponse(call: Call<APIData>, response: Response<APIData>) {
                        if (response.isSuccessful){
                            Toast.makeText(mContext, response.code().toString(), Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(mContext, response.code().toString(), Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<APIData>, t: Throwable) {
                        Toast.makeText(mContext, "실패", Toast.LENGTH_SHORT).show()
                    }

                })
        }
    }

    override fun setValues() {

    }
}