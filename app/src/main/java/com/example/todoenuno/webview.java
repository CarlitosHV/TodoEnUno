package com.example.todoenuno;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://developer.android.com/guide/webapps/webview?hl=es-419");


    }
}
