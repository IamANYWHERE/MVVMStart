package com.toplyh.module.work.debug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.toplyh.module.work.R;
import com.toplyh.module.work.ui.fragment.WorkFragment;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", WorkFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
