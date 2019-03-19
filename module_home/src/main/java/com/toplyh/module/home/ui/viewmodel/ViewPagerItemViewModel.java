package com.toplyh.module.home.ui.viewmodel;

import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;

public class ViewPagerItemViewModel extends ItemViewModel {

    public String text;
    public SingleLiveEvent<String> clickEvent = new SingleLiveEvent<>();

    public ViewPagerItemViewModel(@NonNull BaseViewModel viewModel, String text) {
        super(viewModel);
        this.text = text;
    }
    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            clickEvent.setValue(text);
        }
    });
}
