package com.example.telephony3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText number, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        number= findViewById(R.id.number);
        message= findViewById(R.id.message);
        number.setText(getIntent().getExtras().getString("value"));

    }//oncreate


    public void btnSend(View view) {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
        }
    }

    private void sendMessage() {
        String enumber, emessage;

        enumber = number.getText().toString().trim();
        emessage = message.getText().toString().trim();

        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage(enumber, null, emessage, null, null);
        Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
    }
}
