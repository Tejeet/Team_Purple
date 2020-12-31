package com.tejeet.meetly_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class ProfileFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_filter);
        RangeSeekBar rangeSeekBar = findViewById(R.id.ageSeekbar);
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

}