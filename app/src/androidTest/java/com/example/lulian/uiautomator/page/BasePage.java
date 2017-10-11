package com.example.lulian.uiautomator.page;

import android.support.test.uiautomator.UiObject;

/**
 * Created by lulian on 2017/6/16.
 */

public class BasePage {
    protected void text(UiObject object , String text)throws Exception{
        //ClearAndSetText.putText(object, text);
        //setText方法本身就会先清空本来的东西
        object.setText(text);
    }

    protected void clickButton(UiObject object)throws Exception{
        object.click();
    }
}
