package com.lin.coolweather.util;

/**
 * Created by lin on 2016/2/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
