package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAdd(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        Toast.makeText(
                getApplicationContext(),
                Integer.toString(sum),
                Toast.LENGTH_SHORT
        ).show();
    }

    public void onSub(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        int sub = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        Toast.makeText(
                getApplicationContext(),
                Integer.toString(sub),
                Toast.LENGTH_SHORT
        ).show();
    }

    public void onMul(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        int mul = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        Toast.makeText(
                getApplicationContext(),
                Integer.toString(mul),
                Toast.LENGTH_SHORT
        ).show();
    }

    public void onDiv(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        int mul = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        Toast.makeText(
                getApplicationContext(),
                Integer.toString(mul),
                Toast.LENGTH_SHORT
        ).show();
    }
}