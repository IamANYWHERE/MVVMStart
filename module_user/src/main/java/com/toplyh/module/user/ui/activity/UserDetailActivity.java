package com.toplyh.module.user.ui.activity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.toplyh.library.base.router.RouterActivityPath;
import com.toplyh.module.user.R;
import com.toplyh.module.user.databinding.ActivityUserDetailBinding;
import com.toplyh.module.user.ui.viewmodel.UserDetailViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

@Route(path = RouterActivityPath.User.PAGER_USERDETAIL)
public class UserDetailActivity extends BaseActivity<ActivityUserDetailBinding, UserDetailViewModel> {
    //拿到路由过来的参数
    @Autowired()
    String name;

    @Override
    public void initParam() {
        //注入路由框架，拿到Autowired值，必须在initParam方法中注入，不然传到ViewModel里面的name为空
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_user_detail;
    }

    @Override
    public int initVariableId() {
        return 1;
    }

    @Override
    public void initData() {
        viewModel.setName(name);
    }
}