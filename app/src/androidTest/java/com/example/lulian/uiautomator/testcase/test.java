package com.example.lulian.uiautomator.testcase;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.lulian.uiautomator.config.WiFiSwitch;
import com.example.lulian.uiautomator.systemutils.WiFiSwitcher;
/**
 * Created by lulian on 2017/6/15.
 */

@RunWith(AndroidJUnit4.class)
public class test {

    @Test
    public void wifiTest(){
        WiFiSwitcher.switchWiFi(WiFiSwitch.WIFI_ON);
    }

}
