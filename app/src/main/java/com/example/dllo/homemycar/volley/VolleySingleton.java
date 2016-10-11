package com.example.dllo.homemycar.volley;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.homemycar.custom.MyApp;


/**
 * Created by dllo on 16/8/9.
 */
public class VolleySingleton  {
    private static Context mContext;
    private RequestQueue mQueue;
    private static VolleySingleton ourInstance = new VolleySingleton();

    //对外提供一个方法,可以获取信息
    public static VolleySingleton getInstance(){
        return ourInstance;
    }


    //初始化
    private VolleySingleton() {
        mContext = MyApp.getContext();
        mQueue = getQueue();
    }




    private RequestQueue getQueue(){
        if (mQueue == null){
            synchronized (VolleySingleton.class){
                if (mQueue == null){
                    mQueue = Volley.newRequestQueue(mContext);
                }
            }
        }
        return mQueue;
    }


    public<T> void _addRequest(Request<T> request){
        mQueue.add(request);
    }

    public<T> void _addRequest(Request<T> request,Object tag){
        request.setTag(tag);
        _addRequest(request);
    }


    public void _addRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener){
        StringRequest stringRequest = new StringRequest(url,listener,errorListener);
        _addRequest(stringRequest);
    }


    public <T> void _addRequest(String url, Class<T> mClass, Response.Listener<T> listener,
                                Response.ErrorListener errorListener){
        GsonRequest<T> gsonRequest = new GsonRequest<T>(Method.GET,url,mClass,listener,errorListener);
        _addRequest(gsonRequest);
    }



    //对外提供的 添加最基本请求 的方法
    public static <T> void addRequest(Request<T> request){
        getInstance()._addRequest(request);
    }

    //可以对请求 添加标签 方便管理请求
    public static <T> void addRequest(Request<T> request ,Object tag){
        getInstance()._addRequest(request,tag);
    }


    //StringRequest请求
    public static <T> void addRequest(String url, Response.Listener listener, Response.ErrorListener errorListener){
        getInstance()._addRequest(url,listener,errorListener);
    }

    //GsonRequest请求
    public static <T> void addRequest(String url, Class<T> mClass, Response.Listener listener, Response.ErrorListener errorListener){
        getInstance()._addRequest(url,mClass,listener,errorListener);
    }


    //移除请求
    public void removeRequest(Object tag){
        mQueue.cancelAll(tag);
    }




}
