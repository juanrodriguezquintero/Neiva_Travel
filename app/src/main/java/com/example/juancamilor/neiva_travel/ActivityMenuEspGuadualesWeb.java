package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspGuadualesWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_guaduales_web);

        WebView webViewLosGuaduales = (WebView) findViewById(R.id.WebViewLosGuaduales);
        webViewLosGuaduales.loadUrl("https://www.google.com/maps/place/Monumento+Los+Guaduales/@2.9415664,-75.3021277,16z/data=!4m5!3m4!1s0x8e3b74f44c40384d:0x550275bd217466b6!8m2!3d2.941561!4d-75.2977503");

        WebSettings webSettingsLosGuaduales = webViewLosGuaduales.getSettings();
        webSettingsLosGuaduales.setJavaScriptEnabled(true);

        webViewLosGuaduales.setWebViewClient(new WebViewClient());


    }
}
