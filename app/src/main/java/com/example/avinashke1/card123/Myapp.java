package com.example.avinashke1.card123;

import android.app.Application;
import android.content.Context;

/**
 * Created by avinash on 23/3/16.
 */
public class Myapp extends Application{
    private static Myapp myApplication=null;
    @Override
    public void onCreate(){
        super.onCreate();
        myApplication=this;
    }
    public static  Myapp getInstance(){
        return myApplication;
    }
    public static Context getAppContext(){
        return myApplication.getApplicationContext();
    }
}
