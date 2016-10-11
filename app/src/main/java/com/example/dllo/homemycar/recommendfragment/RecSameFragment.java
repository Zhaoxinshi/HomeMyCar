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

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.RecommendRecSameFragmentAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.RecSameEntity;
import com.example.dllo.homemycar.volley.VolleySingleton;


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
        final String url = b.getString("url");
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                VolleySingleton.addRequest(url, RecSameEntity.class, new Response.Listener<RecSameEntity>() {
                    @Override
                    public void onResponse(RecSameEntity response) {
                        int id = response.getResult().getNewslist().get(i).getId();
                        String url = "http://cont.app.autohome.com.cn/autov4.2.5/content/News/newscontent-a2-pm1-v4.2.5-n"+id+"-lz0-sp0-nt0-sa1-p0-c1-fs0-cw320.html\n";
                        Log.d("公司大牛", url);
                        Intent intent = new Intent(getContext(),RecSameActivity.class);
                        intent.putExtra("da",url);
                        startActivity(intent);


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();

                    }
                });


            }
        });

    }
}
