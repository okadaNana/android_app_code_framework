package com.owen.codeframework.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 对 BaseAdapter 做进一步封装，子类重写 getView() 方法
 *
 * Created by Owen on 2015/11/3.
 */
public abstract class BaseAbstractAdapter<T> extends BaseAdapter {

    protected final Context mContext;
    protected final LayoutInflater mInflater;
    protected List<T> mListData;

    public BaseAbstractAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mListData = new ArrayList<>();
    }

    /**
     * 设置数据源
     * @param listData 新的数据源
     */
    public void setDataSource(List<T> listData) {
        mListData.clear();
        mListData.addAll(listData);
        notifyDataSetChanged();
    }

    /**
     * 在数据源尾部增加更多数据
     * @param listData 更多的数据源
     */
    public void addMoreData(List<T> listData) {
        mListData.addAll(listData);
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
