package com.owen.codeframework.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.owen.codeframework.app.SharedPrefContact;

/**
 * SharedPreferences管理类
 *
 * Created by Owen on 2015/11/3.
 */
public class SharedPrefMgr {

    private static SharedPreferences sSharedPreferences = null;
    private static SharedPrefMgr sInstance = new SharedPrefMgr();
    private static Context sContext;
    private static SharedPreferences.Editor sEditor = null;

    private SharedPrefMgr() {
    }

    public static void init(Context context) {
        sContext = context;
    }

    public static SharedPrefMgr getInstance() {
        return sInstance;
    }

    private static SharedPreferences getSharedPref() {
        if (sSharedPreferences == null) {
            synchronized (SharedPrefMgr.class) {
                if (sSharedPreferences == null) {
                    sSharedPreferences = sContext.getSharedPreferences(SharedPrefContact.SHARED_PREF_NAME,
                            Context.MODE_PRIVATE);
                }
            }
        }

        return sSharedPreferences;
    }

    private static SharedPreferences.Editor getEditor() {
        if (sEditor == null) {
            synchronized (SharedPrefMgr.class) {
                if (sEditor == null) {
                    sEditor = getSharedPref().edit();
                }
            }
        }

        return sEditor;
    }

}
