package com.mobile.mobilehardware.screen;

import android.content.Context;
import android.view.Window;

import org.json.JSONObject;

/**
 *
 * @author gunaonian
 * @date 2018/3/28
 */

public class ScreenHelper extends ScreenInfo{

    /**
     * 获取屏幕信息
     * @param context
     * @return
     */
    public static JSONObject mobGetMobScreen(Context context, Window window) {
        return getMobScreen(context,window);
    }



}