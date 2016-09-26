package com.example.dllo.homemycar.volleydemo; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.homemycar.MyApp;

/**
 * Created by dllo on 16/8/9.
 */
public class VolleySingleton {
    private static Context context;
    private RequestQueue queue;//队列
    private static VolleySingleton ourInstance = new VolleySingleton();

    //对外提供一个方法可以获取信息
    public static VolleySingleton getInstance() {
        return ourInstance;
    }

    private VolleySingleton() {
        context = MyApp.getContext();
        queue = getQueue();
    }

    //获取请求队列的方法
    //双重检验锁单例
    private RequestQueue getQueue() {
        //首次判断队列是否为空,主要功能提高效率
        if (queue == null) {
            //加上同步锁保证队列创建不会发生冲突
            synchronized (VolleySingleton.class) {
                //如果队列为空 则创建一个新的
                if (queue == null) {
                    queue = Volley.newRequestQueue(context);

                }
            }
        }
        return queue;
    }
    //带_的都是为我对外提供的方法做准备的

    //添加最基本的请求
    public <T> void _addRequest(Request<T> request) {
        queue.add(request);
    }

    //添加带标签的请求 标签的作用是为了管理请求
    public <T> void _addRequest(Request<T> request, Object tag) {
        request.setTag(tag);
        _addRequest(request);
    }

    //添加StringRequest请求

    /**
     * @param url           网址
     * @param listener      成功时候的回调
     * @param errorListener 失败时候的回调
     */
    public void _addRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        StringRequest stringRequest = new StringRequest(url, listener, errorListener);
        _addRequest(stringRequest);
    }

    //添加自定义的GsonRequest请求

    /**
     *
     * @param url
     * @param mClass
     * @param listener
     * @param errorListener
     * @param <T>
     */
    public <T> void _addRequest(String url, Class<T> mClass, Response.Listener<T> listener,
                                Response.ErrorListener errorListener) {
        GsonRequest<T> gsonRequest = new GsonRequest<T>(Request.Method.GET, url, mClass, listener, errorListener);
        _addRequest(gsonRequest);
    }

    // 以下的静态方法就是我们真正要实用的方法


    //对外提供的添加基本请求的方法
    public static <T> void addRequest(Request<T> request) {
        getInstance()._addRequest(request);
    }


    //可以对请求添加标签,方便管理请求
    public static <T> void addRequest(Request<T> request, Object tag) {
        getInstance()._addRequest(request, tag);
    }


    //StringRequest请求
    public static <T> void addRequest(String url, Response.Listener listener, Response.ErrorListener errorListener) {
        getInstance()._addRequest(url, listener, errorListener);
    }


    //GsonRequest请求
    public static <T> void addRequest(String url, Class<T> mClass, Response.Listener listener, Response.ErrorListener errorListener) {
        getInstance()._addRequest(url, mClass, listener, errorListener);
    }

    //移除请求
    public void removeRequest(Object tag) {
        queue.cancelAll(tag);
    }
}
