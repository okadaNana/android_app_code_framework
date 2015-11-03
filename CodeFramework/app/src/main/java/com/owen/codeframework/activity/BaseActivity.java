package com.owen.codeframework.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity的基类
 *
 * Created by Owen on 2015/11/3.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setLayout();
        initComponent();
        registerEvent();
        bindData();
    }

    /**
     * 设置布局
     */
    public abstract void setLayout();

    /**
     * 初始化控件
     */
    public abstract void initComponent();

    /**
     * 注册时间监听器
     */
    public abstract void registerEvent();

    /**
     * 绑定数据
     */
    public abstract void bindData();

}