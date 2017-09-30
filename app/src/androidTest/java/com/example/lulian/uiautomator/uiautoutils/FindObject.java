package com.example.lulian.uiautomator.uiautoutils;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

/**
 * Created by lulian on 2017/6/15.
 */

public class FindObject {
    public static UiObject ById(String id) throws UiObjectNotFoundException {
        UiObject object = new UiObject(new UiSelector().resourceId(id));
        CleverWait.checkObjectExistence(object,2000);
        return object;
    }

    public static UiObject ByText(String text) throws UiObjectNotFoundException {
        UiObject object = new UiObject(new UiSelector().text(text));
        CleverWait.checkObjectExistence(object,2000);
        return object;
    }
}

