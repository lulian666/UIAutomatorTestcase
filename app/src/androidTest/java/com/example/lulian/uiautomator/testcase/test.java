package com.example.lulian.uiautomator.testcase;


import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.lulian.uiautomator.config.WiFiSwitch;
import com.example.lulian.uiautomator.systemutils.WiFiSwitcher;

import java.io.File;

/**
 * Created by lulian on 2017/6/15.
 */

@RunWith(AndroidJUnit4.class)
public class test {

    @Test
    public void screenshotTest()
    {
        UiDevice mdevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mdevice.takeScreenshot(new File("/Users/lulian/Downloads/test.png"));
    }

}
