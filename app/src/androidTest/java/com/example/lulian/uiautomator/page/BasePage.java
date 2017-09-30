package com.example.lulian.uiautomator.page;

import android.support.test.uiautomator.UiObject;

import com.example.lulian.uiautomator.uiautoutils.ClearAndSetText;

/**
 * Created by lulian on 2017/6/16.
 */

public class BasePage {
    protected void text(UiObject object , String text)throws Exception{
        ClearAndSetText.putText(object, text);
    }

    protected void clickButton(UiObject object)throws Exception{
        object.click();
    }
}
