package com.coolweather.android.util;


import android.os.Build;


import androidx.annotation.RequiresApi;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    @RequiresApi(api = Build.VERSION_CODES.P)
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
