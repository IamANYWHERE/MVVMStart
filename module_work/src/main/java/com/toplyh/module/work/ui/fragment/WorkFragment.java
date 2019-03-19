package com.toplyh.module.work.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.toplyh.library.base.router.RouterFragmentPath;
import com.toplyh.module.work.BR;
import com.toplyh.module.work.R;
import com.toplyh.module.work.databinding.FragmentWorkBinding;
import com.toplyh.module.work.ui.viewmodel.WorkViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Work.PAGER_WORK)
public class WorkFragment extends BaseFragment<FragmentWorkBinding, WorkViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_work;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}