package com.example.user.exlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText mId, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mId = findViewById(R.id.editId);
        mPassword = findViewById(R.id.editPassword);
    }

    public void onLogin(View view){
        String mUserId = mId.getText().toString();
        String mUserPW = mPassword.getText().toString();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("userId", mUserId);
        intent.putExtra("userPW", mUserPW);
        startActivity(intent);
    }
}
