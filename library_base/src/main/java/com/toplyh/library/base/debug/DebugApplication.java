package com.toplyh.library.base.debug;

import android.app.Application;

import com.toplyh.library.base.config.ModuleLifecycleConfig;

public class DebugApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //...
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
