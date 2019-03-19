package com.toplyh.library.base.config;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.toplyh.library.base.BuildConfig;
import com.toplyh.library.base.init.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * 作为组件生命周期初始化的配置类，通过反射机制，动态调用每个组件初始化逻辑
 */
public class ModuleLifecycleConfig {

    private static class Holder{
        private static final ModuleLifecycleConfig INSTANCE = new ModuleLifecycleConfig();
    }

    private ModuleLifecycleConfig(){

    }

    public static ModuleLifecycleConfig getInstance(){
        return Holder.INSTANCE;
    }

    //初始化组件 - 靠前
    public void initModuleAhead(Application application){
        for (String moduleName : ModuleLifecycleReflexes.initModuleNames){
            try {
                Class<?> clazz = Class.forName(moduleName);
                IModuleInit init = (IModuleInit) clazz.newInstance();
                //调用初始化方法
                init.onInitAhead(application);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    //初始化组件 - 靠后
    public void initModuleLow(Application application){
        for (String moduleName : ModuleLifecycleReflexes.initModuleNames){
            try {
                Class<?> clazz = Class.forName(moduleName);
                IModuleInit init = (IModuleInit) clazz.newInstance();
                //调用初始化方法
                init.onInitLow(application);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
