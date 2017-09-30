package com.example.lulian.uiautomator.page;

import android.support.test.uiautomator.UiObject;

import com.example.lulian.uiautomator.uiautoutils.FindObject;

/**
 * Created by lulian on 2017/6/15.
 */

public class LoginPage extends BasePage{
    //"用户名"文本框和输入字符串方法
    public static final String USERNAME_TEXTFIELD_ID = "net.oschina.app:id/et_login_username";
    public void textUsername(String text) throws Exception {
        UiObject username =  FindObject.ById(USERNAME_TEXTFIELD_ID);
        super.text(username, text);
    }

    //"密码"文本框和输入字符串方法
    public static final String PASSWORD_TEXTFIELD_ID = "net.oschina.app:id/et_login_pwd";
    public void textPassword(String text) throws Exception{
        UiObject password = FindObject.ById(PASSWORD_TEXTFIELD_ID);
        super.text(password, text);
    }

    //"登陆"按钮和点击方法
    public static final String LOGIN_SUBMIT_BUTTON_ID = "net.oschina.app:id/bt_login_submit";
    public void clickLoginButton() throws Exception {
        UiObject loginButton = FindObject.ById(LOGIN_SUBMIT_BUTTON_ID);
        super.clickButton(loginButton);
    }

}
