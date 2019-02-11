package com.example.carilokasi;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.app.Activity;

public class About extends Activity {

    private String content;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "ABOUT");
        setContentView(R.layout.about);
        WebView wv;
        content = "file:///android_asset/3.html";
             
        wv = (WebView) findViewById(R.id.webView3);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
}
   
}

