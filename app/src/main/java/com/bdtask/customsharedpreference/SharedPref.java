package com.bdtask.customsharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private static final String PREFERENCE_NAME="com.akter.sharedpreferencedemo";


    public static void init(Context context){

        sharedPreferences  = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);

    }

    public static String read(String key,String defaultValue){

       return sharedPreferences.getString(key,defaultValue);

    }

    public static void write(String key,String value){

        editor   = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();

    }





}
