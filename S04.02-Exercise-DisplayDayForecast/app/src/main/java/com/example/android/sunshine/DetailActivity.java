package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherDetailTextView;
    private String mForecastDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDetailTextView = (TextView) findViewById(R.id.tv_weather_detail);
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intentThatStartedThisActivity = getIntent();
        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
                mForecastDetail = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDetailTextView.setText(mForecastDetail);
            }
        }
    }
}