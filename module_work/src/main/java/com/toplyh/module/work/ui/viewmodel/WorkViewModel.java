package com.toplyh.module.work.ui.viewmodel;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import com.toplyh.module.work.BR;
import com.toplyh.module.work.R;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class WorkViewModel extends BaseViewModel {
    public WorkViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        for (int i = 0; i < 10; i++) {
            observableList.add(new WorkItemViewModel(this, "条目" + i));
        }
    }
    //给RecyclerView添加ObservableList
    public ObservableList<WorkItemViewModel> observableList = new ObservableArrayList<>();
    //给RecyclerView添加ItemBinding
    public ItemBinding<WorkItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.grid_work);
}