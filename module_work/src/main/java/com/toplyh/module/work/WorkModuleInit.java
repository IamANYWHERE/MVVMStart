package com.toplyh.module.work;

import android.app.Application;

import com.toplyh.library.base.init.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

public class WorkModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("工作模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("工作模块初始化 -- onInitLow");
        return false;
    }
}