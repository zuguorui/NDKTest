package com.zu.ndktest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//现在可以导入sdk里的内容了
import com.zu.sdk.MyStringUtil.ndkString

class MainActivity : AppCompatActivity() {

    private lateinit var tvNDK: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNDK = findViewById(R.id.tv_ndk)
        //这句调用方法
        tvNDK.text = ndkString()
    }
}
