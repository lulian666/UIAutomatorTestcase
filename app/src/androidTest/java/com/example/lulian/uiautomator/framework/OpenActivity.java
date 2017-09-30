package com.example.lulian.uiautomator.framework;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;

/**
 * Created by lulian on 2017/6/17.
 */

public class OpenActivity {
    public static void openApps(String packageName, String activityName){
        Context context = InstrumentationRegistry.getContext();
        Intent launchIntent = new Intent();
        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //启动应用
        launchIntent.setComponent(new ComponentName(packageName, activityName));
        context.startActivity(launchIntent);
    }
}
