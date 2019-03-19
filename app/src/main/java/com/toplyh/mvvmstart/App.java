package com.toplyh.mvvmstart;

import android.app.Application;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.os.AsyncTask;

import com.toplyh.library.base.config.ModuleLifecycleConfig;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件（靠前）
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //其他的初始化...

        //初始化组件（靠后）
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
