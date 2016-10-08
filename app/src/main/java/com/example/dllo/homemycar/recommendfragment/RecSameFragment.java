package com.example.dllo.homemycar.recommendfragment; /*
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

import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.RecommendRecSameFragmentAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.RecSameEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

/**
 * Created by dllo on 16/10/8.
 */
public class RecSameFragment extends BaseFragment {
    private ListView listView;
    private RecommendRecSameFragmentAdapter adapter;

    public static RecSameFragment getInstance(String urls) {
        Bundle bundle = new Bundle();
        bundle.putString("url", urls);
        RecSameFragment recSameFragment = new RecSameFragment();
        recSameFragment.setArguments(bundle);
        return recSameFragment;
    }

    @Override
    protected int setlayout() {
        return R.layout.rec_fragment;
    }

    @Override
    protected void initView() {
        listView = getView(R.id.rec_same_fragment_lv);

    }

    @Override
    protected void initData() {
        Bundle b = getArguments();
        String url = b.getString("url");
        adapter = new RecommendRecSameFragmentAdapter(getContext());
        VolleySingleton.addRequest(url, RecSameEntity.class, new Response.Listener<RecSameEntity>() {
            @Override
            public void onResponse(RecSameEntity response) {
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
