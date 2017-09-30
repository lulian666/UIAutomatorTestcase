package com.example.lulian.uiautomator.page;

import android.support.test.uiautomator.UiObject;

import com.example.lulian.uiautomator.uiautoutils.CleverWait;
import com.example.lulian.uiautomator.uiautoutils.FindObject;

/**
 * Created by lulian on 2017/6/15.
 */

public class SettingPage extends BasePage{
    //"注销"按钮
    public static final String LOGOUT_BUTTON_ID = "net.oschina.app:id/rl_cancel";
    public void clickLogoutButton() throws Exception{
        UiObject logoutButton =  FindObject.ById(LOGOUT_BUTTON_ID);
        super.clickButton(logoutButton);
    }
}
