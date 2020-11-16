package com.example.telephony3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView name1,name2,name3,name4,name5,num1,num2,num3,num4,num5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1=findViewById(R.id.name1);
        name2=findViewById(R.id.name2);
        name3=findViewById(R.id.name3);
        name4=findViewById(R.id.name4);
        name5=findViewById(R.id.name5);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);

    }


    public void mbutton1(View view) {
        String value=name1.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void cbutton(View view) {
        String value=num1.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void m3button(View view) {
        String value=name2.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void c2button(View view) {
        String value=num2.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void m2button(View view) {
        String value=name3.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void c3button(View view) {
        String value=num3.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void m4button(View view) {
        String value=name4.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void c4button(View view) {
        String value=num4.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void m5button(View view) {
        String value=name5.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void c5button(View view) {
        String value=num5.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }


}






