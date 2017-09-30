package com.example.lulian.uiautomator.uiautoutils;

import android.os.SystemClock;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.util.Log;


/**
 * Created by lulian on 2017/6/15.
 */

public class CleverWait {
    public static boolean checkObjectExistence(UiObject object, int timeoutInMs) throws UiObjectNotFoundException {
        long endTime = System.currentTimeMillis() + timeoutInMs;
        while (!object.exists()){
            if (System.currentTimeMillis() > endTime){
                return false;
            }
            SystemClock.sleep(200);
        }
        return true;
    }
}
