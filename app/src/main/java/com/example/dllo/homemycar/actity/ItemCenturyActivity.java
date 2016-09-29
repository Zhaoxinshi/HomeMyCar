package com.example.dllo.homemycar.actity; /*
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

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.ItemCenturyAdapter;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.entity.CenturySisterEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

/**
 * Created by dllo on 16/9/28.
 */
public class ItemCenturyActivity extends BaseActivity {
    private ListView lv;

    @Override
    protected int setLayout() {
        return R.layout.et;
    }

    @Override
    protected void initView() {
        lv = getView(R.id.item_century_lv);


    }

    @Override
    protected void initData() {
        Intent inten = getIntent();
        String url = inten.getStringExtra("s");
        Log.d("asd", url);
        final ItemCenturyAdapter adapter = new ItemCenturyAdapter(this);

        VolleySingleton.addRequest(url, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
            @Override
            public void onResponse(CenturySisterEntity response) {
                adapter.setEntity(response);
                lv.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }
}
