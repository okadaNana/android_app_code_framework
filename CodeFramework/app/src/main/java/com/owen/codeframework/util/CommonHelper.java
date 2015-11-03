package com.owen.codeframework.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /**
     * 判断手机号码是否合法
     */
    public static boolean isLegalMobilePhoneNum(String mobilePhoneNum) {
        /**
         * 手机号码
         * 移动：134[0-8],135,136,137,138,139,150,151,157,158,159,182,187,188
         * 联通：130,131,132,152,155,156,185,186
         * 电信：133,1349,153,180,189
         */
        String MOBILE = "^1(3[0-9]|5[0-35-9]|8[025-9])\\d{8}$";

        /**
         * 中国移动：China Mobile
         * 134[0-8],135,136,137,138,139,150,151,157,158,159,182,187,188
         */

        String CM = "^1(34[0-8]|(3[5-9]|5[017-9]|8[278])\\d)\\d{7}$";
        /**
         * 中国联通：China Unicom
         * 130,131,132,152,155,156,185,186
         */
        String CU = "^1(3[0-2]|5[256]|8[56])\\d{8}$";

        /**
         * 中国电信：China Telecom
         * 133,1349,153,180,189
         */
        String CT = "^1((33|53|8[09])[0-9]|349)\\d{7}$";

        return matches(MOBILE, mobilePhoneNum)||matches(CM, mobilePhoneNum)||matches(CU, mobilePhoneNum)||matches(CT, mobilePhoneNum);
    }

    private static boolean matches(String type, String phoneNum) {
        Pattern p = Pattern.compile(type);
        Matcher m = p.matcher(phoneNum);
        return m.matches();
    }

}
