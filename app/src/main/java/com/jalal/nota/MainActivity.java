package com.jalal.nota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void service(View view) {
        Intent intent= new Intent(MainActivity.this,ActivityService.class);
        startActivity(intent);
    }

    public void teknisi(View view) {
        Intent intent= new Intent(MainActivity.this,Activityteknisi.class);
        startActivity(intent);
    }
}