package com.example.lulian.uiautomator.uiautoutils;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import com.example.lulian.uiautomator.uiautoutils.FindObject;

import static junit.framework.Assert.assertTrue;

/**
 * Created by lulian on 2017/6/16.
 */

public class SwipeBetweenUiObiects {
    public static void swipeCenters(UiDevice mDevice, UiObject object1, UiObject object2, int steps) throws UiObjectNotFoundException {
        int sx = object1.getBounds().centerX();
        int sy = object1.getBounds().centerY();

        int ex = object2.getBounds().centerX();
        int ey = object2.getBounds().centerY();
        mDevice.swipe(sx,sy,ex,ey,steps);
    }
}
