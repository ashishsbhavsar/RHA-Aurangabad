package com.robinhoodarmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class covaxin extends AppCompatActivity {

    WebView covaxinBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covaxin);

        covaxinBrow = (WebView)findViewById(R.id.covaxin_web);
        covaxinBrow.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc8xJuWTdEmJQ6PBkI4q2sk_ytpB0Frg1BkDudc8iFTnkwL0A/viewform?usp=sf_link");
        covaxinBrow.getSettings().setJavaScriptEnabled(true);
        covaxinBrow.setWebViewClient(new vaxinBrowser());
    }

    private class vaxinBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}