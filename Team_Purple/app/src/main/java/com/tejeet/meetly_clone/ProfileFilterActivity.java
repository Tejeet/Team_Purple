package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class ProfileFilterActivity extends AppCompatActivity {

    private ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_filter);

        RangeSeekBar rangeSeekBar = findViewById(R.id.ageSeekbar);

        mBack = findViewById(R.id.imgback);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMainActivity();
            }
        });

        TextView minAge = findViewById(R.id.tvMinAge);
        TextView maxAge = findViewById(R.id.tvMaxAge);

        rangeSeekBar.setRangeValues(18, 60);
        rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                minAge.setText(minValue.toString());
                maxAge.setText(maxValue.toString());
            }
        });
    }


    public void gotoMainActivity() {
        startActivity(new Intent(ProfileFilterActivity.this, MainActivity.class));
        finish();
    }

}