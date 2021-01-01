package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Buy_coins_Activity extends AppCompatActivity {

    private ImageView mBack, mSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_coins_);

        mBack = findViewById(R.id.btn_back);
        mSetting = findViewById(R.id.btn_buy_coin_menu);


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMainActivity();
            }
        });

        mSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSetting();
            }
        });
    }

    public void gotoMainActivity() {
        startActivity(new Intent(Buy_coins_Activity.this, MainActivity.class));
        finish();
    }

    public void gotoSetting() {
        startActivity(new Intent(Buy_coins_Activity.this, SettingActivity.class));
        finish();
    }
}