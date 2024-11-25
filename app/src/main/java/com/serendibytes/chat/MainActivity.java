package com.serendibytes.chat;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView SerendiBytesChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SerendiBytesChat = findViewById(R.id.SerendiBytesChat);
        SerendiBytesChat.getSettings().setJavaScriptEnabled(true);
        SerendiBytesChat.setWebViewClient(new WebViewClient());
        SerendiBytesChat.loadUrl("https://chat.nejan.me");
    }
}