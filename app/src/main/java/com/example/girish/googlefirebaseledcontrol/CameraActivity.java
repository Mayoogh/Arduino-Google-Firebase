package com.example.girish.googlefirebaseledcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CameraActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        webView = findViewById(R.id.webview_id);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.1.4:8081/");
    }
}
