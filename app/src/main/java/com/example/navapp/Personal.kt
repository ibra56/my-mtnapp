package com.example.navapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Personal : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container:ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview: WebView = view.findViewById(R.id.webviewh)
        mywebview.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://www.mtn.co.ug/personal/")
        mywebview.settings.javaScriptEnabled
        mywebview.settings.useWideViewPort =true
        mywebview.settings.allowContentAccess =true
        mywebview.settings.domStorageEnabled = true
    }
}