package com.owen.codeframework.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Owen on 2015/11/3.
 */
public abstract class BaseAbstractAdapter<T> extends BaseAdapter {

    protected final Context mContext;
    protected final LayoutInflater mInflater;
    protected List<T> mListData;

    public BaseAbstractAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    public void setDataSource(List<T> listData) {
        mListData = listData;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return null == mListData ? 0 : mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return null == mListData ? null : mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);

}
