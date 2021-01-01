package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tejeet.meetly_clone.Data.Constants;

public class LoginActivity extends AppCompatActivity {

    private TextView mRegister, mForgotPass;
    private Button mFacebook, mLogin;
    private EditText mEmail, mPass;

    private Constants cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mRegister = findViewById(R.id.tvRegister);
        mFacebook = findViewById(R.id.btnFacebooklogin);
        mLogin = findViewById(R.id.btnLoginbutton);
        mForgotPass = findViewById(R.id.tvforgetpassword);

        mEmail = findViewById(R.id.etEmail);
        mPass = findViewById(R.id.etPassword);


        cn = new Constants();

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

                if (checkcredential()){
                    gotoLogin();
                    cn.setLoginStatus(LoginActivity.this, "1");
                }

            }
        });

        mForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoforgotpass();
            }
        });



    }

    public void gotoLogin() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

    public void gotoforgotpass() {
        startActivity(new Intent(LoginActivity.this, ForgotpassActivity.class));
        finish();
    }

    public void gotosignup() {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        finish();
    }


    private boolean checkcredential(){

        boolean isValid = true;

        if (mEmail.getText().toString().isEmpty()){
            mEmail.setError("Please enter Email ID");
            isValid = false;
        }

        if (mPass.getText().toString().isEmpty()){
            mPass.setError("Please enter Email ID");
            isValid = false;
        }

        if (mEmail.getText().toString().contains("@") && mPass.getText().toString().length() >= 6){
            isValid = true;
        }

        return isValid;

    }


}