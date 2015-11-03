package com.owen.codeframework.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Owen on 2015/11/3.
 */
public class ToastHelper {

    private static Context sContext;

    public static void init(Context context) {
        sContext = context;
    }

    public static void shortShow(int strResId) {
        Toast.makeText(sContext, strResId, Toast.LENGTH_SHORT).show();
    }

    public static void shortShow(String str) {
        Toast.makeText(sContext, str, Toast.LENGTH_SHORT).show();
    }

    public static void longShow(int strResId) {
        Toast.makeText(sContext, strResId, Toast.LENGTH_LONG).show();
    }

    public static void longShow(String str) {
        Toast.makeText(sContext, str, Toast.LENGTH_LONG).show();
    }

}
