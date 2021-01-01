package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mLogin;
    private Button mFacebook, mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mLogin = findViewById(R.id.tvLogin);
        mFacebook = findViewById(R.id.btnFacebookbutton);
        mSignup = findViewById(R.id.btnCreateaccount);



        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLogin();
            }
        });

        mFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosignup();
            }
        });
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosignup();
            }
        });


    }

    public void gotoLogin() {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        finish();
    }

    public void gotofacebooklogin() {
        startActivity(new Intent(HomeActivity.this, SignupActivity.class));
        finish();
    }

    public void gotosignup() {
        startActivity(new Intent(HomeActivity.this, SignupActivity.class));
        finish();
    }
}