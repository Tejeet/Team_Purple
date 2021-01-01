package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.tejeet.meetly_clone.Data.Constants;

public class SplashScreen extends AppCompatActivity {

    private Constants cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        cn = new Constants();

        String loginStatus = cn.getLoginStatus(this);

        if (loginStatus.equals("1")){
            gotoDashboard();
        }
        else {
            gotoHome();
        }


    }


    public void gotoHome() {
        startActivity(new Intent(SplashScreen.this, HomeActivity.class));
        finish();
    }

    public void gotoDashboard() {
        startActivity(new Intent(SplashScreen.this, MainActivity.class));
        finish();
    }

    public void gotoLoginScreen() {
        startActivity(new Intent(SplashScreen.this, LoginActivity.class));
        finish();
    }

}