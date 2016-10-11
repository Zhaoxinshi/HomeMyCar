package com.example.dllo.homemycar.custom;

import android.app.Activity;

import com.example.dllo.homemycar.R;

public class ThemeChangeUtil {
    public static boolean isChange = false;
    public static void changeTheme(Activity activity){
        if(isChange){
            activity.setTheme(R.style.NightTheme);
        }
    }
}