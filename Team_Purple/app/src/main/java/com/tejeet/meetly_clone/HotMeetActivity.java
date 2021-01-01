package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HotMeetActivity extends AppCompatActivity {

    private ImageView mSearchNav, mPromotionalNav, mHotmeetNav, mChatNav, mUserNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_meet);

        mSearchNav = findViewById(R.id.imgbottomnavsearch);
        mPromotionalNav = findViewById(R.id.imgbottomnavcrown);
        mHotmeetNav = findViewById(R.id.imgbottomnavchat);
        mChatNav = findViewById(R.id.imgbottomnavshare);
        mUserNav = findViewById(R.id.imgbottomnavuser);

        mSearchNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosearch();
            }
        });

        mPromotionalNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoPromotional();
            }
        });


        mChatNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotochat();
            }
        });

        mUserNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUser();
            }
        });
    }

    public void gotosearch() {
        startActivity(new Intent(HotMeetActivity.this, MainActivity.class));
        finish();
    }

    public void gotoPromotional() {
        startActivity(new Intent(HotMeetActivity.this, PromotionsActivity.class));
        finish();
    }


    public void gotochat() {
        startActivity(new Intent(HotMeetActivity.this, ChatActivity.class));
        finish();
    }

    public void gotoUser() {
        startActivity(new Intent(HotMeetActivity.this, ProfileActivity.class));
        finish();
    }
}