package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText message, mobile;
    SmsManager smsManager;
    PendingIntent pi;
    Intent in;
    String mes, mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (EditText) findViewById(R.id.message);
        mobile = (EditText) findViewById(R.id.mobile_number);
        smsManager = SmsManager.getDefault();
        in = new Intent(getApplicationContext(), MainActivity.class);
        pi = PendingIntent.getActivity(getApplicationContext(), 0, in, 0);
    }

    public void onSend(View view) {
        mes = message.getText().toString();
        mob = mobile.getText().toString();
        smsManager.sendTextMessage(mob, null, mes, pi, null);
        Toast.makeText(this, "Message sent successfully!", Toast.LENGTH_SHORT).show();
    }
}