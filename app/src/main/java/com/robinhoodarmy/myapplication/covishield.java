package com.robinhoodarmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class covishield extends AppCompatActivity {

    WebView covishield_Brow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covishield);

        covishield_Brow = (WebView)findViewById(R.id.covishield_web);
        covishield_Brow.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSct7EIKZ946MgNSXsNurwBGi7-ycZKT2ExPDYrqCDjvobg2Ew/viewform?usp=sf_link");
        covishield_Brow.getSettings().setJavaScriptEnabled(true);
        covishield_Brow.setWebViewClient(new shieldBrowser());
    }

    private class shieldBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}