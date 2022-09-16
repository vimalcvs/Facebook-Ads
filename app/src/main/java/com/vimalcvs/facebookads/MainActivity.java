package com.vimalcvs.facebookads;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        MaterialCardView cdBanner = findViewById(R.id.cdBanner);
        MaterialCardView cdRectangle = findViewById(R.id.cdRectangle);
        MaterialCardView cdInterstitial = findViewById(R.id.cdInterstitial);
        MaterialCardView cdReward = findViewById(R.id.cdReward);
        MaterialCardView cdNative = findViewById(R.id.cdNative);


        cdBanner.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ad_Banner.class)));

        cdRectangle.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ad_Rectangle.class)));

        cdInterstitial.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ad_Interstitial.class)));

        cdReward.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ad_Reward.class)));

        cdNative.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Ad_Native.class)));

    }
}