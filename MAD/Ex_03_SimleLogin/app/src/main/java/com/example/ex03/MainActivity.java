package com.example.ex03;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText uname, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.uname);
        pwd = (EditText) findViewById(R.id.pwd);
    }

    public void authenticate(View view) {
        String unameVal = uname.getText().toString();
        String pwdVal = pwd.getText().toString();
        if(unameVal.equals("admin") && pwdVal.equals("admin")) {
            Toast.makeText(
                    getApplicationContext(),
                    "Authenticated...",
                    Toast.LENGTH_SHORT
            ).show();

            uname.setText("");
            pwd.setText("");
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    "Unauthenticated...",
                    Toast.LENGTH_SHORT
            ).show();

            uname.setText("");
            pwd.setText("");
        }
    }

    public void clear(View view) {
        uname.setText("");
        pwd.setText("");
    }
}
