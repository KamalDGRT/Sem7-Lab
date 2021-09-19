package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button btn;
    WebView wv;
    private WebSettings getString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = (EditText) findViewById(R.id.inp);
        btn = (Button) findViewById(R.id.btn);
        wv = (WebView) findViewById(R.id.webview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("https://"+ url.getText().toString());
            }
        });
    }
}