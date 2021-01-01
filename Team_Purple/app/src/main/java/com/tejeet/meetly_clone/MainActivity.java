package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tejeet.meetly_clone.Data.SuggestedProfileData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView mSearchNav, mPromotionalNav, mHotmeetNav, mChatNav, mUserNav, mMenuFilter;
    private ImageView mBuyCoin, mLike, mDisLike, mProfilePhoto;
    private LinearLayout mRadar;
    private CardView mSwipeView;
    private TextView mProfileName, mProfileDistance;

    private static final String TAG = "tag";


    private ArrayList arraylist = new ArrayList<SuggestedProfileData>();

    private Handler mHandler;

    private SuggestedProfileData spd;

    int profileno = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchNav = findViewById(R.id.imgbottomnavsearch);
        mPromotionalNav = findViewById(R.id.imgbottomnavcrown);
        mHotmeetNav = findViewById(R.id.imgbottomnavchat);
        mChatNav = findViewById(R.id.imgbottomnavshare);
        mUserNav = findViewById(R.id.imgbottomnavuser);

        mMenuFilter = findViewById(R.id.imgmenu);

        mBuyCoin = findViewById(R.id.imgcoinBalance);

        mProfilePhoto = findViewById(R.id.imgsuggestedprofile);
        mLike = findViewById(R.id.imgLike);
        mDisLike = findViewById(R.id.imgdisLike);
        mProfileName = findViewById(R.id.tvprofilename);
        mProfileDistance = findViewById(R.id.tvprofiledistance);


        arraylist.add(new SuggestedProfileData(R.drawable.profile_1, "Snehal", "23", 10));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_2, "Tanvee", "26", 90));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_3, "Pallavi", "25", 22));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_4, "Rahul", "32", 47));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_5, "Vivek", "28", 32));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_6, "Yeshu", "20", 342));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_7, "Neeta", "30", 342));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_8, "Kajol", "31", 342));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_9, "Stacy", "22", 962));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_10, "Stacy", "22", 92));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_11, "Sonali", "28", 62));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_12, "Kiara", "23", 32));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_13, "Sanjana", "23", 88));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_14, "Roshni", "29", 92));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_15, "Kalyani", "21", 34));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_16, "Maithili", "29", 45));
        arraylist.add(new SuggestedProfileData(R.drawable.profile_17, "Lily", "39", 4785));




        SuggestedProfileData spd = (SuggestedProfileData) arraylist.get((int) ((Math.random() * (arraylist.size() - 0)) + 0));
        Log.d(TAG, "name is "+spd.getName());
        mProfilePhoto.setImageResource(spd.getMpath());
        mProfileDistance.setText(spd.getDistance()+" Km");
        mProfileName.setText(spd.getName()+"  ,  "+spd.getAge());



        mLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int index = (int) ((Math.random() * (arraylist.size() - 0)) + 0);

                SuggestedProfileData spd = (SuggestedProfileData) arraylist.get(index);
                Log.d(TAG, "name is "+spd.getName());
                mProfilePhoto.setImageResource(spd.getMpath());
                mProfileDistance.setText(spd.getDistance()+" Km");
                mProfileName.setText(spd.getName()+"  ,  "+spd.getAge());
            }
        });

        mDisLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int index = (int) ((Math.random() * (arraylist.size() - 0)) + 0);

                SuggestedProfileData spd = (SuggestedProfileData) arraylist.get(index);
                Log.d(TAG, "name is "+spd.getName());
                mProfilePhoto.setImageResource(spd.getMpath());
                mProfileDistance.setText(spd.getDistance()+" Km");
                mProfileName.setText(spd.getName()+"  ,  "+spd.getAge());
            }
        });



        mRadar = findViewById(R.id.llradarscan);
        mSwipeView = findViewById(R.id.swipecard);


        mSwipeView.setVisibility(View.GONE);
        mRadar.setVisibility(View.VISIBLE);


        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeView.setVisibility(View.VISIBLE);
                mRadar.setVisibility(View.GONE);
            }
        }, 2000);




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

        mMenuFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoFilter();
            }
        });

        mBuyCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoBuyCoin();
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

    public void gotoFilter() {
        startActivity(new Intent(MainActivity.this, ProfileFilterActivity.class));
        finish();
    }

    public void gotoBuyCoin() {
        startActivity(new Intent(MainActivity.this, Buy_coins_Activity.class));
        finish();
    }

}