package com.vimalcvs.facebookads;

import android.app.Application;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

import java.util.ArrayList;
import java.util.List;

public class ActivityBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AudienceNetworkAds.initialize(this);
        AdSettings.setTestMode(true);

        List<String> testDevices = new ArrayList<>();
        testDevices.add("74ab1836-f12f-40b1-9510-4faeee8e7e78");
        testDevices.add("45ab9edf-8d0d-449f-819f-adbc43b0e7fb");
        AdSettings.addTestDevices(testDevices);

    }
}