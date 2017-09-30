package com.example.lulian.uiautomator.uiautoutils;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

/**
 * Created by lulian on 2017/6/15.
 */

public class ClearAndSetText {
    public static void putText(UiObject object,String text) throws UiObjectNotFoundException {
        object.clearTextField();
        object.setText(text);
    }
}
