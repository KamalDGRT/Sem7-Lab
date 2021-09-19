package com.example.ex05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    TextView output;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        in = getIntent();
        output = (TextView) findViewById(R.id.output);
        output.setText(in.getStringExtra("message"));
    }
}