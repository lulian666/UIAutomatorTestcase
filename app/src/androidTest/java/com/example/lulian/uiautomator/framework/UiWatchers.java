package com.example.lulian.uiautomator.framework;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiWatcher;

import com.example.lulian.uiautomator.uiautoutils.FindObject;
/**
 * Created by lulian on 2017/6/16.
 */

public class UiWatchers {
    public static final String CANCEL_BUTTON_ID = "android:id/button2";
    private static UiObject cancelButton;
    public static UiWatcher UpdateWatcher() throws UiObjectNotFoundException {
        cancelButton = FindObject.ById(CANCEL_BUTTON_ID);
        UiWatcher updateWatcher = new UiWatcher() {
            @Override
            public boolean checkForCondition() {
                if(cancelButton.exists()){
                    try {
                        cancelButton.click();
                    } catch (UiObjectNotFoundException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
                return false;
            }
        };
                return updateWatcher;
    }
}