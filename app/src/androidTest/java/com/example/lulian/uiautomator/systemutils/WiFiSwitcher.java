package com.example.lulian.uiautomator.systemutils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.test.InstrumentationRegistry;
/**
 * Created by lulian on 2017/6/18.
 */

public class WiFiSwitcher {
    public static void switchWiFi(boolean result){
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        WifiManager wifiManager = (WifiManager) context.getSystemService(context.WIFI_SERVICE);
        boolean wifi = wifiManager.isWifiEnabled();
        wifiManager.setWifiEnabled(result);
    }
}
