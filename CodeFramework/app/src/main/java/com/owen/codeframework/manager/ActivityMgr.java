package com.owen.codeframework.manager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity容器类
 *
 * Created by Owen on 2015/11/3.
 */
public class ActivityMgr {

    public static List<Activity> mActivityContainer = new ArrayList<>();

    public static void add(Activity activity) {
        if (activity == null || mActivityContainer.contains(activity)) {
            return;
        }

        mActivityContainer.add(activity);
    }

    public static void remove(Activity activity) {
        if (activity == null) {
            return;
        }

        mActivityContainer.remove(activity);
    }

    public static void finishAll() {
        Activity activity;

        for (int i = 0; i < mActivityContainer.size(); i++) {
            activity = mActivityContainer.get(i);

            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    public static void clear() {
        mActivityContainer.clear();
    }

}
