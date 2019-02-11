package com.example.carilokasi;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.app.Activity;

public class Utama extends Activity {

    private String content;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "PETUNJUK");
        setContentView(R.layout.utama);
        WebView wv;
        content = "file:///android_asset/2.html";
             
        wv = (WebView) findViewById(R.id.webView2);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
}
   
}
