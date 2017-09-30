package com.example.lulian.uiautomator.page;

import android.support.test.uiautomator.UiObject;
import android.util.Log;

import com.example.lulian.uiautomator.uiautoutils.*;

/**
 * Created by lulian on 2017/6/15.
 */

public class MinePage extends BasePage{
    //"我"按钮
    public static final String ME_BUTTON_ID = "net.oschina.app:id/nav_item_me";
    public void clickMeButton() throws Exception{
        UiObject meButton =  FindObject.ById(ME_BUTTON_ID);
        meButton.click();
    }

    //"头像"框
    public static final String PORTRAIIT_ID = "net.oschina.app:id/iv_portrait";
    public void clickPortrait() throws Exception{
        UiObject portrait =  FindObject.ById(PORTRAIIT_ID);
        super.clickButton(portrait);
    }

    //"设置"按钮
    public static final String SETTING_BUTTON_ID = "net.oschina.app:id/iv_logo_setting";
    public void clickSettingButton() throws Exception{
        UiObject settingButton =  FindObject.ById(SETTING_BUTTON_ID);
        super.clickButton(settingButton);
    }

    //"问题"选项
    public static final String QUESTION_ITEM_ID = "net.oschina.app:id/rl_info_question";
    public void clickQuestionItem() throws Exception{
        UiObject question =  FindObject.ById(QUESTION_ITEM_ID);
        super.clickButton(question);
    }

    //"团队"选项
    public static final String TEAM_ITEM_ID = "net.oschina.app:id/rl_team";
    public void clickTeamItem() throws Exception{
        UiObject team =  FindObject.ById(TEAM_ITEM_ID);
        super.clickButton(team);
    }
}
