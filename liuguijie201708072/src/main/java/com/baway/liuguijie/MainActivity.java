package com.baway.liuguijie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TopBar topBar;
    private boolean isClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        topBar.setOnTopbarClickListener(new TopBar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "点击了返回", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "点击了更多", Toast.LENGTH_SHORT).show();

            }
        });
        // 控制topbar上组件的状态
    }

    private void initView() {
        topBar = (TopBar) findViewById(R.id.topBar);
    }
}
