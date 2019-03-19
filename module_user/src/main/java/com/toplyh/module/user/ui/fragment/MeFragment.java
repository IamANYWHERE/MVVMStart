package com.toplyh.module.user.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.toplyh.library.base.router.RouterFragmentPath;
import com.toplyh.module.user.R;
import com.toplyh.module.user.databinding.FragmentMeBinding;
import com.toplyh.module.user.ui.viewmodel.MeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.User.PAGER_ME)
public class MeFragment extends BaseFragment<FragmentMeBinding, MeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_me;
    }

    @Override
    public int initVariableId() {
        return 1;
    }

    @Override
    public void initData() {
    }
}