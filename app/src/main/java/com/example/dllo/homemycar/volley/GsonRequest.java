package com.example.dllo.homemycar.volley;


import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

/**这小帅哥必须来了
 * Created by dllo on 16/8/9.
 */
public class GsonRequest<T> extends Request<T> {

    private final Response.Listener<T> mListener;
    private Gson mGson;
    private Class<T> mclass;

    public GsonRequest(int method, String url, Class<T> mclass, Response.Listener<T> listener, Response.ErrorListener mlistener) {
        super(method, url, mlistener);
        this.mListener = listener;
        mGson = new Gson();
        this.mclass = mclass;
    }


    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            return Response.success(mGson.fromJson(jsonString,mclass),HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(T response) {
         mListener.onResponse(response);
    }


    public void deliverError(VolleyError error){
        if (error instanceof NoConnectionError){
            Cache.Entry entry = this.getCacheEntry();
            if (entry != null){
                Response<T> response = parseNetworkResponse(new NetworkResponse(entry.data,entry.responseHeaders));
                deliverResponse(response.result);
                return;
            }
        }
        super.deliverError(error);
    }



}
