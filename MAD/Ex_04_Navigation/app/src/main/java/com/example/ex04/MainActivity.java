package com.example.ex04;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ex04.SecondActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigate(View v) {
        in = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(in);
    }
}