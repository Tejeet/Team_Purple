package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SettingActivity extends AppCompatActivity {

    private Button mCommunityGuidelines, mSafetyTips, mTerms, mLicences, mPrivacyPolicy, mLanguage, mLogout, mDeleteAccount;
    private ImageView mBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mCommunityGuidelines = findViewById(R.id.btnCoummnityguidelines);
        mSafetyTips = findViewById(R.id.btnSafetytips);
        mPrivacyPolicy = findViewById(R.id.btnPrivacy);
        mTerms = findViewById(R.id.btnTermsofservice);
        mLicences = findViewById(R.id.btnLiceness);

        mLanguage = findViewById(R.id.btnLanguage);
        mLogout = findViewById(R.id.btnLogout);
        mDeleteAccount = findViewById(R.id.btnAccountDelete);

        mBack = findViewById(R.id.imgback);


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoProfile();
            }
        });

        mPrivacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoPrivacy();
            }
        });

        mTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoTerms();
            }
        });





    }

    public void gotoProfile() {
        startActivity(new Intent(SettingActivity.this, ProfileActivity.class));
        finish();
    }

    public void gotoTerms() {
        startActivity(new Intent(SettingActivity.this, TermsAndServiceActivity.class));
        finish();
    }

    public void gotoPrivacy() {
        startActivity(new Intent(SettingActivity.this, PrivacyAndPolicyActivity.class));
        finish();
    }


}