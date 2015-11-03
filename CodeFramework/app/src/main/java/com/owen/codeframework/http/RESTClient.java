package com.owen.codeframework.http;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * REST网络接口请求类
 *
 * Created by Owen on 2015/11/3.
 */
public class RESTClient {

    private static AsyncHttpClient sClient = new AsyncHttpClient();

    static {
        sClient.addHeader("Accept", "application/json");
        sClient.setTimeout(20*1000);
    }

    /**
     * HTTP-GET
     */
    private static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        sClient.get(url, params, responseHandler);
    }

    /**
     * HTTP-POST
     */
    private static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        sClient.post(url, params, responseHandler);
    }

    /**
     * HTTP-DELETE
     */
    private static void delete(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        sClient.delete(url, params, responseHandler);
    }

}
