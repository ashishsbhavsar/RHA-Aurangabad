package com.robinhoodarmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class regestration extends AppCompatActivity {

    WebView ourBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);

        ourBrow = (WebView)findViewById(R.id.web_reg);
        ourBrow.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSct_hkDe6-t0QB_1t8lMKDNp_rxEl0SkRQuQA0he6mG-d6quw/viewform");
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.setWebViewClient(new MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}