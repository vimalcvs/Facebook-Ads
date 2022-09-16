package com.vimalcvs.facebookads;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

public class Ad_Reward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_reward);
       

        final RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(this, ActivityConfig.FB_REWARD);
        RewardedVideoAdListener rewardedVideoAdListener = new RewardedVideoAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                Toast.makeText(Ad_Reward.this, "Sorry, error on loading the ad. Try again!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                rewardedVideoAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
            }

            @Override
            public void onLoggingImpression(Ad ad) {
            }

            @Override
            public void onRewardedVideoCompleted() {
                Toast.makeText(Ad_Reward.this, "Ad completed, now give reward to user", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedVideoClosed() {
            }
        };
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(rewardedVideoAdListener).build());
    }

}