package com.robinhoodarmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cowin extends AppCompatActivity {

    WebView cowinBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cowin);

        cowinBrow = (WebView)findViewById(R.id.cowin_web);
        cowinBrow.loadUrl("https://selfregistration.cowin.gov.in");
        cowinBrow.getSettings().setJavaScriptEnabled(true);
        cowinBrow.setWebViewClient(new CoBrowser());
    }

    private class CoBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}