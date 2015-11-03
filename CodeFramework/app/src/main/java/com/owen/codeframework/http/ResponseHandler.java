package com.owen.codeframework.http;

import android.content.Context;

import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Owen on 2015/11/3.
 */
public class ResponseHandler extends AsyncHttpResponseHandler {

    private Context context;
    private OnResponse onResponse;

    public ResponseHandler(Context context, OnResponse onResponse) {
        this.context = context;
        this.onResponse = onResponse;
    }


    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//        SrvRespModel srvResp = JSON.parseObject(responseBody, SrvRespModel.class);
//        if (401 == srvResp.getStatus()) {
//
//            ActivityManager.finishAll();
//
//            ToastHelper.longShow(R.string.auth_failure_pls_re_login);
//            StartupActivity.actionStart(context);
//            return;
//        }
//        onResponse.onOK(statusCode, header, srvResp);
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//        if (0 == statusCode) {
//            if (onResponse.onTimeOut(statusCode, header, response == null ? "" : new String(response), error)) {
//                onResponse.onNG(statusCode, header, new String(response), error);
//            }
//        } else {
//            onResponse.onNG(statusCode, header, new String(response), error);
//        }
    }

}
