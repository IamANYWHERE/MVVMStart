package com.toplyh.library.base.config;

/**
 *   组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 *   注意：以下模块中初始化的Module类不能被混淆
 */
public class ModuleLifecycleReflexes {
    //核心模块
    private static final String BaseInit = "com.toplyh.library.base.init.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.toplyh.module.main.MainModuleInit";
    //登录模块
    private static final String SignInit = "com.toplyh.module.sign.SignModuleInit";
    //首页模块
    private static final String HomeInit = "com.toplyh.module.home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.toplyh.module.work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.toplyh.module.msg.MsgModuleInit";
    //用户业务模块
    private static final String UserInit = "com.toplyh.module.user.UserModuleInit";

    public static String[] initModuleNames = {BaseInit,MainInit,SignInit,HomeInit,WorkInit,MsgInit,UserInit};
}
