package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Community_Guidelines_Activity extends AppCompatActivity {

    private ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community__guidelines_);

        mBack = findViewById(R.id.btn_back);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSetting();
            }
        });
    }

    public void gotoSetting() {
        startActivity(new Intent(Community_Guidelines_Activity.this, SettingActivity.class));
        finish();
    }
}