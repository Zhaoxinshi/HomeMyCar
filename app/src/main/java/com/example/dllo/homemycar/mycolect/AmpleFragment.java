package com.example.dllo.homemycar.mycolect; /*
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

import android.support.v4.app.Fragment;
import android.widget.ListView;


import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.AmpleAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.AmpleEntity;
import com.example.dllo.homemycar.entity.Url;
import com.example.dllo.homemycar.volley.VolleySingleton;

/**
 * Created by dllo on 16/9/26.
 */
public class AmpleFragment extends BaseFragment {
    private ListView listView;
    private AmpleAdapter ampleAdapter;
    @Override
    protected int setlayout() {
        return R.layout.ample_fragment;
    }

    @Override
    protected void initView() {
        listView = getView(R.id.ample_fragment_lv);

    }

    @Override
    protected void initData() {
        ampleAdapter = new AmpleAdapter(getContext());
        VolleySingleton.addRequest(Url.YOUCHUANG, AmpleEntity.class, new Response.Listener<AmpleEntity>() {
            @Override
            public void onResponse(AmpleEntity response) {
                ampleAdapter.setEntity(response);
                listView.setAdapter(ampleAdapter);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getMessage();

            }
        });

    }
}
