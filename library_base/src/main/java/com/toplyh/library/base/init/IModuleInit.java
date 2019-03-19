package com.toplyh.library.base.init;

import android.app.Application;

public interface IModuleInit {
    //初始化优先的
    boolean onInitAhead(Application application);
    //初始化靠后的
    boolean onInitLow(Application application);
}
