package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webview.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var url = intent.getStringExtra("url").toString()
        binding.wvHotel.loadUrl(url)
    }

}