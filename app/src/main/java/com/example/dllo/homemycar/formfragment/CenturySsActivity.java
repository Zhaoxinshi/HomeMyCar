package com.example.dllo.homemycar.formfragment; /*
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
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.CentruyHeadAdapter;
import com.example.dllo.homemycar.adapter.CenturyBeautilAdapter;
import com.example.dllo.homemycar.adapter.CenturyFriendAdapter;
import com.example.dllo.homemycar.adapter.CenturyModelAdapter;
import com.example.dllo.homemycar.adapter.CenturySisterAdapter;
import com.example.dllo.homemycar.adapter.CenturySsAdapter;
import com.example.dllo.homemycar.entity.CenturySisterEntity;
import com.example.dllo.homemycar.entity.CenturySsEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

/**
 * Created by dllo on 16/9/27.
 */
public class CenturySsActivity extends FragmentActivity {
    private ListView listView;
    private CenturySsAdapter adapter;
    private ImageView imaBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.century_model_ac);
        listView = (ListView) findViewById(R.id.century_model_lv);
        imaBack = (ImageView) findViewById(R.id.century_model_back);
        imaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        String urlSister = intent.getStringExtra("urlSister");
        String urlFriend = intent.getStringExtra("urlFriend");
        String urlHead = intent.getStringExtra("urlHead");
        String urlBeautiful = intent.getStringExtra("urlBeautiful");
        String urlCat = intent.getStringExtra("intentCat");
        if (!"".equals(urlCat)) {
            final CenturyModelAdapter centuryModelAdapter = new CenturyModelAdapter(this);
            VolleySingleton.addRequest(urlCat, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                @Override
                public void onResponse(CenturySisterEntity response) {
                    centuryModelAdapter.setEntity(response);
                    listView.setAdapter(centuryModelAdapter);

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
            if (!"".equals(urlBeautiful)) {
                final CenturyBeautilAdapter centuryBeautilAdapter = new CenturyBeautilAdapter(this);
                VolleySingleton.addRequest(urlBeautiful, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                    @Override
                    public void onResponse(CenturySisterEntity response) {
                        centuryBeautilAdapter.setEntity(response);
                        listView.setAdapter(centuryBeautilAdapter);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                if (!"".equals(urlHead)) {
                    final CentruyHeadAdapter centruyHeadAdapter = new CentruyHeadAdapter(this);
                    VolleySingleton.addRequest(urlHead, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                        @Override
                        public void onResponse(CenturySisterEntity response) {
                            centruyHeadAdapter.setEntity(response);
                            listView.setAdapter(centruyHeadAdapter);

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });


                }
                if (!"".equals(urlFriend)) {
                    final CenturyFriendAdapter centuryFriendAdapter = new CenturyFriendAdapter(this);
                    VolleySingleton.addRequest(urlFriend, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                        @Override
                        public void onResponse(CenturySisterEntity response) {
                            centuryFriendAdapter.setEntity(response);
                            listView.setAdapter(centuryFriendAdapter);

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });


                }

                if (!"".equals(urlSister)) {
                    final CenturySisterAdapter centurySisterAdapter = new CenturySisterAdapter(this);

                    VolleySingleton.addRequest(urlSister, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                        @Override
                        public void onResponse(CenturySisterEntity response) {
                            centurySisterAdapter.setEntity(response);
                            listView.setAdapter(centurySisterAdapter);

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });


                }
                if (!"".equals("http://183.232.160.141/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud=2&categoryid=121&pageindex=1&pagesize=30&devicetype=android.Coolpad+8722V&deviceid=869954020592562&userid=0&operation=1&netstate=0&gps=38.889723%2C121.55098")) {
                    adapter = new CenturySsAdapter(this);
                    VolleySingleton.addRequest("http://183.232.160.141/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud=2&categoryid=121&pageindex=1&pagesize=30&devicetype=android.Coolpad+8722V&deviceid=869954020592562&userid=0&operation=1&netstate=0&gps=38.889723%2C121.55098", CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
                        @Override
                        public void onResponse(CenturySisterEntity response) {
                            adapter.setEntity(response);
                            listView.setAdapter(adapter);
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.getMessage();
                        }
                    });
                }


            }
        }
    }
}
