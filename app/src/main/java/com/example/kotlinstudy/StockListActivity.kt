package com.example.kotlinstudy

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinstudy.databinding.ActivityStockListBinding

class StockListActivity : BaseActivity() {
    lateinit var binding: ActivityStockListBinding
    lateinit var mAdapter: StockAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_stock_list)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val stockList = intent.getSerializableExtra("stockList") as ArrayList<StockData>
        mAdapter = StockAdapter(mContext, R.layout.stock_list_item, stockList)
        binding.stockList.adapter = mAdapter
    }
}