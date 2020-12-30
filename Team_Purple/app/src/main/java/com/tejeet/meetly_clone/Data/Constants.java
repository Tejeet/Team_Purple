package com.tejeet.meetly_clone.Data;

import android.content.Context;
import android.content.SharedPreferences;

public class Constants {

    public static final String SERVER = "https://amwaves.techpulsesolution.com/";
    public static final String HOST = "https://amwaves.techpulsesolution.com/api/app.php?";
    public static final String AUTH_KEY = "b9Vw59tF3WDIOFwdTY5u6Tuj3eVUInhn";
    public static final String USER_PROFILE_PHOTO_PATH = SERVER + "users/profile_photo/";


    SharedPreferences sharedpreferences;
    private static final String MY_PREF = "Meetly_PREF";

    private static final String LOGIN_STATUS_KEY = "LoginStatus";




    public String getLoginStatus(Context context){
        sharedpreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        return sharedpreferences.getString(LOGIN_STATUS_KEY, "0");
    }

    public void setLoginStatus(Context context,String loginStatus) {
        sharedpreferences = context.getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(LOGIN_STATUS_KEY, loginStatus);
        editor.commit();
    }

}
