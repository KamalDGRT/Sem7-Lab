package com.example.ex01;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "I am create method", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText(getApplicationContext(), "I am start method", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(getApplicationContext(), "I am resume method", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(getApplicationContext(), "I am stop method", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(getApplicationContext(), "I am pause method", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(getApplicationContext(), "I am restart method", Toast.LENGTH_LONG).show();
    }




    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "I am destroy method", Toast.LENGTH_LONG).show();
    }

}
