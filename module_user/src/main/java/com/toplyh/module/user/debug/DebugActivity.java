package com.toplyh.module.user.debug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.toplyh.module.user.R;
import com.toplyh.module.user.ui.fragment.MeFragment;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_me);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", MeFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
