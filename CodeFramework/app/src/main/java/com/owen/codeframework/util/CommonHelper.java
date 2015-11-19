package com.owen.codeframework.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * 通用工具类
 *
 * Created by Owen on 2015/11/3.
 */
public class CommonHelper {

    /**
     * 拨打电话
     */
    public static void callPhone(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNum));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 发送短信
     */
    public static void sendSMS(Context context, String number, String message) {
        Uri uri = Uri.parse("smsto:" + number);

        Intent sendIntent = new Intent(Intent.ACTION_VIEW, uri);
        sendIntent.putExtra("sms_body", message);

        context.startActivity(sendIntent);
    }

}
