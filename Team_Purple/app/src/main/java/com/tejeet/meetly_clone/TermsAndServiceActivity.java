package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TermsAndServiceActivity extends AppCompatActivity {

    private ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_service);

        mBack = findViewById(R.id.btn_back);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSetting();
            }
        });


    }

    public void gotoSetting() {
        startActivity(new Intent(TermsAndServiceActivity.this, SettingActivity.class));
        finish();
    }


}