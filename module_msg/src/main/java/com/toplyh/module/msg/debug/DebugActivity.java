package com.toplyh.module.msg.debug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.toplyh.module.msg.R;
import com.toplyh.module.msg.ui.fragment.MsgFragment;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", MsgFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
