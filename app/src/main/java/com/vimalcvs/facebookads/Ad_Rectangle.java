package com.vimalcvs.facebookads;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class Ad_Rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_rectangle);
       

        final RelativeLayout adContainer = findViewById(R.id.ad_rectangle);
        AdView adView = new AdView(this, ActivityConfig.FB_RECTANGLE, AdSize.RECTANGLE_HEIGHT_250);
        adContainer.addView(adView);

        AdListener adListener = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d("logAdLoadError", "Error: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };

        AdView.AdViewLoadConfig loadAdConfig = adView.buildLoadAdConfig().withAdListener(adListener).build();
        adView.loadAd(loadAdConfig);
    }

}