package com.example.ex05;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent in;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.inp);
    }

    public void Send(View view) {
        in = new Intent(MainActivity.this, SecondActivity.class);
        in.putExtra("message", input.getText().toString());
        startActivity(in);
    }
}