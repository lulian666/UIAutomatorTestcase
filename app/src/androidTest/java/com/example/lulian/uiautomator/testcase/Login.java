package com.example.lulian.uiautomator.testcase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;

import com.example.lulian.uiautomator.config.Packages;
import com.example.lulian.uiautomator.framework.OpenActivity;
import com.example.lulian.uiautomator.framework.UiWatchers;
import com.example.lulian.uiautomator.page.LoginPage;
import com.example.lulian.uiautomator.page.MinePage;
import com.example.lulian.uiautomator.page.SettingPage;
import com.example.lulian.uiautomator.uiautoutils.FindObject;
import com.example.lulian.uiautomator.uiautoutils.SwipeBetweenUiObiects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import java.io.IOException;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Login {
    private UiDevice mDevice;
    //实例化三个页面类
    private MinePage minePage = new MinePage();
    private LoginPage loginPage = new LoginPage();
    private SettingPage settingPage = new SettingPage();

    @Before
    public void setUp() throws Exception{
        //初始化mDevice，并点击home键防止起始环境异常
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mDevice.pressHome();
        //打开app和相应活动
        OpenActivity.openApps(Packages.OSCHINA_PACKAGE_NAME, Packages.OSCHINA_LAUNCH_ACTIVITY_NAME);
        //防止弹框，若出现弹框则点击取消键避开
        mDevice.registerWatcher(new String("alertcatcher"), UiWatchers.UpdateWatcher());
    }

    @Test
    public void loginAndScreenshot() throws Exception {
        //切换到"我"页面，点击头像进入登陆页面
        minePage.clickMeButton();
        minePage.clickPortrait();
        //实现登陆
        loginPage.textUsername("xzt875@126.com");
        loginPage.textPassword("13419926370qaz");
        loginPage.clickLoginButton();
        //滑动屏幕
        UiObject startObject = FindObject.ById(MinePage.QUESTION_ITEM_ID);
        UiObject endObject = FindObject.ById(MinePage.TEAM_ITEM_ID);
        SwipeBetweenUiObiects.swipeCenters(mDevice,startObject,endObject,100);

        //截图，暂时也没能实现……
        //execCMD("chmod 777 /users/lulian/downloads/screencap.sh");
        //execCMD("adb shell /system/bin/screencap -p /sdcard/screenshot3.png");
    }

//    private void execCMD(String cmd) throws RuntimeException, IOException, InterruptedException {
//        Runtime runtime = Runtime.getRuntime();
//        Process process = runtime.exec(cmd);
//        process.waitFor();
//
//        int i = process.exitValue();
//        if (i == 0){
//            System.out.println("compelete");
//        }else {
//            System.out.println("fail");
//        }
//        process.destroy();
//        process = null;
//    }

    @After
    public void tearDown() throws Exception{
        //注销账号，防止影响下次测试，啥样开始的就恢复原样
        minePage.clickSettingButton();
        settingPage.clickLogoutButton();
        mDevice.removeWatcher("alertcatcher");
        //退出app
        mDevice.pressBack();
        mDevice.pressBack();
        mDevice.pressBack();
    }
}
