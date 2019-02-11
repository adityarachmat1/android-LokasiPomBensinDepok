package com.example.carilokasi;

import android.os.Bundle;
import android.provider.ContactsContract.Profile;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.app.Activity;

public class Lay1 extends Activity {

    private String content;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "PROFIL");
        setContentView(R.layout.profil);
        WebView wv;
        content = "file:///android_asset/1.html";
             
        wv = (WebView) findViewById(R.id.webView1);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
        
        
}
   
}

