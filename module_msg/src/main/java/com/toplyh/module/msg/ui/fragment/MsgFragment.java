package com.toplyh.module.msg.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.toplyh.library.base.router.RouterFragmentPath;
import com.toplyh.module.msg.R;
import com.toplyh.module.msg.databinding.FragmentMsgBinding;
import com.toplyh.module.msg.ui.viewmodel.MsgViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;
import com.toplyh.module.msg.BR;

@Route(path = RouterFragmentPath.Msg.PAGER_MSG)
public class MsgFragment extends BaseFragment<FragmentMsgBinding, MsgViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_msg;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}