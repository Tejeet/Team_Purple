package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PromotionsActivity extends AppCompatActivity {

    private ImageView mSearchNav, mPromotionalNav, mHotmeetNav, mChatNav, mUserNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        mSearchNav = findViewById(R.id.imgbottomnavsearch);
        mPromotionalNav = findViewById(R.id.imgbottomnavcrown);
        mHotmeetNav = findViewById(R.id.imgbottomnavchat);
        mChatNav = findViewById(R.id.imgbottomnavshare);
        mUserNav = findViewById(R.id.imgbottomnavuser);

        mSearchNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSearch();
            }
        });

        mHotmeetNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHotMeet();
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

    public void gotoSearch() {
        startActivity(new Intent(PromotionsActivity.this, MainActivity.class));
        finish();
    }

    public void gotoHotMeet() {
        startActivity(new Intent(PromotionsActivity.this, HotMeetActivity.class));
        finish();
    }

    public void gotochat() {
        startActivity(new Intent(PromotionsActivity.this, ChatActivity.class));
        finish();
    }

    public void gotoUser() {
        startActivity(new Intent(PromotionsActivity.this, ProfileActivity.class));
        finish();
    }
}