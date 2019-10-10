package com.example.user.exlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textUserId = findViewById(R.id.textUserId);
        Intent intent = getIntent();
        final String userId = intent.getStringExtra("userId");
        final String userPW = intent.getStringExtra("userPW");
        textUserId.setText(userId);
    }
}
