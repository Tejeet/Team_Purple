package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mSearchNav, mPromotionalNav, mHotmeetNav, mChatNav, mUserNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchNav = findViewById(R.id.imgbottomnavsearch);
        mPromotionalNav = findViewById(R.id.imgbottomnavcrown);
        mHotmeetNav = findViewById(R.id.imgbottomnavchat);
        mChatNav = findViewById(R.id.imgbottomnavshare);
        mUserNav = findViewById(R.id.imgbottomnavuser);


        mPromotionalNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoPromotional();
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


    public void gotoPromotional() {
        startActivity(new Intent(MainActivity.this, PromotionsActivity.class));
        finish();
    }

    public void gotoHotMeet() {
        startActivity(new Intent(MainActivity.this, HotMeetActivity.class));
        finish();
    }

    public void gotochat() {
        startActivity(new Intent(MainActivity.this, ChatActivity.class));
        finish();
    }

    public void gotoUser() {
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
        finish();
    }

}