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
import android.util.Log;
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
import com.example.dllo.homemycar.custom.ThemeChangeUtil;
import com.example.dllo.homemycar.entity.CenturySisterEntity;
import com.example.dllo.homemycar.entity.CenturySsEntity;

import com.example.dllo.homemycar.volley.VolleySingleton;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * Created by dllo on 16/9/27.
 */
public class CenturySsActivity extends FragmentActivity {
    private PullToRefreshListView listView;
    private CenturySsAdapter adapter;
    private ImageView imaBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeChangeUtil.changeTheme(this);
        setContentView(R.layout.century_model_ac);
        initView();
        initData();
    }

    private void initView() {
        listView = (PullToRefreshListView) findViewById(R.id.century_model_lv);
        imaBack = (ImageView) findViewById(R.id.century_model_back);

    }

    private void initData() {
        imaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        Log.d("所有", url);

        if (!"".equals(url)) {
            final CenturyModelAdapter centuryModelAdapter = new CenturyModelAdapter(this);
            VolleySingleton.addRequest(url, CenturySisterEntity.class, new Response.Listener<CenturySisterEntity>() {
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
//
        }
    }
}

