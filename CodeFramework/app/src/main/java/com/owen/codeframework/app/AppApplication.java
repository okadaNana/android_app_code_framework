package com.owen.codeframework.app;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.owen.codeframework.manager.ImageLoaderMgr;
import com.owen.codeframework.manager.SharedPrefMgr;
import com.owen.codeframework.util.NetworkHelper;
import com.owen.codeframework.util.ToastHelper;

/**
 * App Application。使用 MultiDexApplication，突破方法数 65535 的限制
 *
 * Created by Owen on 2015/11/3.
 */
public class AppApplication extends MultiDexApplication {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = getApplicationContext();

        NetworkHelper.init(sContext);
        SharedPrefMgr.init(sContext);
        ToastHelper.init(sContext);
        ImageLoaderMgr.getInstance().init(sContext);
    }
}
