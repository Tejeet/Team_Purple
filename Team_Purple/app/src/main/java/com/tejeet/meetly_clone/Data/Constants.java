package com.tejeet.meetly_clone.Data;

import android.content.Context;
import android.content.SharedPreferences;

public class Constants {

    SharedPreferences sharedpreferences;
    private static final String MY_PREF = "Meetly_PREF";

    private static final String LOGIN_STATUS_KEY = "LoginStatus";


    public String getLoginStatus(Context context) {
        sharedpreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        return sharedpreferences.getString(LOGIN_STATUS_KEY, "0");
    }

    public void setLoginStatus(Context context, String loginStatus) {
        sharedpreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(LOGIN_STATUS_KEY, loginStatus);
        editor.commit();
    }

}
