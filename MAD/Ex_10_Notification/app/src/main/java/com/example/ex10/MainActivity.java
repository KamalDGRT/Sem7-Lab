package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button notifyBtn;
    EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notifyBtn=(Button) findViewById(R.id.button1);
        text=(EditText) findViewById(R.id.editText1);

        createNotificationChannel();

        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter the text to notify",Toast.LENGTH_SHORT).show();
                }
                else {
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Notification");
                    builder.setContentTitle("Your Notification");
                    builder.setContentText(text.getText().toString());
                    builder.setSmallIcon(R.drawable.ic_launcher_foreground);
                    builder.setAutoCancel(true);

                    NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity.this);
                    managerCompat.notify(1, builder.build());
                }
            }
        });
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("Notification","Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}