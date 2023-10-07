package com.rutvi.mad_practical7_21012011123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class Youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeId = "fJn9B64Znrk"
        val youWebView = findViewById<WebView>(R.id.WebView)
        val webSettings : WebSettings = youWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        youWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}