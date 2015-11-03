package com.owen.codeframework.http;

import com.owen.codeframework.model.SrvRespModel;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Owen on 2015/11/3.
 */
public interface OnResponse {

    /**
     * onSuccess
     */
    public void onOK(int statusCode, Header[] header, SrvRespModel srvResp);

    /**
     * onFailure
     */
    public void onNG(int statusCode, Header[] header, String response, Throwable error);

    /**
     * 网络请求超时
     * 返回true，则继续执行 onNg() 方法，否则方法体只执行到该处为止
     */
    public boolean onTimeOut(int statusCode, Header[] header, String response, Throwable error);

}
