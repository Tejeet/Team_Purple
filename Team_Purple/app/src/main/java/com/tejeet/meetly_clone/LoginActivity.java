package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView mRegister;
    private Button mFacebook, mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mRegister = findViewById(R.id.tvRegister);
        mFacebook = findViewById(R.id.btnFacebooklogin);
        mLogin = findViewById(R.id.tvLoginbutton);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosignup();
            }
        });

        mFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosignup();
            }
        });
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLogin();
            }
        });

    }

    public void gotoLogin() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

    public void gotofacebooklogin() {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        finish();
    }

    public void gotosignup() {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        finish();
    }


}