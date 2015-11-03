package com.owen.codeframework.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.owen.codeframework.log.LogUtil;

/**
 * 判断网络状态的工具类
 *
 * Created by Owen on 2015/11/3.
 */
public class NetworkHelper {

    private static final String TAG = NetworkHelper.class.getSimpleName();

    private static Context sContext;

    private NetworkHelper() {
    }

    public static void init(Context context) {
        sContext = context;
    }

    public static boolean networkIsAvaliable() {
        boolean mobileNetwork = NetworkHelper.mobileNetWorkIsAvaliable();
        boolean wifiNetwork = NetworkHelper.wifiIsAvaliable();

        if (!mobileNetwork && !wifiNetwork) {
            LogUtil.i(TAG, "无网络连接");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断移动网络是否连接
     */
    public static boolean mobileNetWorkIsAvaliable() {
        ConnectivityManager manager = (ConnectivityManager) sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if (info != null) {
            return info.isConnected();
        }

        return false;
    }

    /**
     * 判断是有wifi连接
     */
    public static boolean wifiIsAvaliable() {
        ConnectivityManager manager = (ConnectivityManager) sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (info != null) {
            return info.isConnected();
        }

        return false;
    }

}
