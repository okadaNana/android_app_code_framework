package com.owen.codeframework.activity;

import android.view.View;
import android.widget.Button;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.owen.codeframework.R;
import com.owen.codeframework.view.StatusListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private StatusListView mListView;
    private Button btnLoading;
    private Button btnEmpty;
    private Button btnError;

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initComponent() {
        mListView = (StatusListView) findViewById(R.id.listView);

        btnLoading = (Button) findViewById(R.id.btn_loading);
        btnEmpty = (Button) findViewById(R.id.btn_empty);
        btnError = (Button) findViewById(R.id.btn_error);
    }

    @Override
    public void registerEvent() {
        btnLoading.setOnClickListener(this);
        btnEmpty.setOnClickListener(this);
        btnError.setOnClickListener(this);
    }

    @Override
    public void bindData() {
        List<String> titles = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            titles.add("" + i);
        }

        QuickAdapter<String> adapter = new QuickAdapter<String>(this, R.layout.item_title, titles) {
            @Override
            protected void convert(BaseAdapterHelper helper, String item) {
                helper.setText(R.id.tv_title, item);
            }
        };

        mListView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_loading:
                mListView.showLoadingView();
                break;

            case R.id.btn_empty:
                mListView.showEmptyView();
                break;

            case R.id.btn_error:
                mListView.showErrorView();
                break;

            default:
                break;
        }
    }

}
