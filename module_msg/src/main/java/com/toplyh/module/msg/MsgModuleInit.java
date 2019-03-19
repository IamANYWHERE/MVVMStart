package com.toplyh.module.msg;

import android.app.Application;

import com.toplyh.library.base.init.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

public class MsgModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("消息模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("消息模块初始化 -- onInitLow");
        return false;
    }
}
