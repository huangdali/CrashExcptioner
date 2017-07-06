package com.hdl.exceptioner;

import android.app.Application;

import com.hdl.CrashExceptioner;

/**
 * Created by HDL on 2017/7/5.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashExceptioner.init(this);
        CrashExceptioner.setShowErrorDetails(false);//设置不显示详细错误按钮，默认为true
    }
}
