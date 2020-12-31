package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button mFbLogin, mCreteAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mCreteAccount = findViewById(R.id.btnCreateaccount);

        mCreteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoCreateAccount();
            }
        });



    }

    public void gotoCreateAccount() {
        startActivity(new Intent(HomeActivity.this, SignupActivity.class));
        finish();
    }
}