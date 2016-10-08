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

import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.VideoAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.Url;
import com.example.dllo.homemycar.entity.VideoEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

/**
 * Created by dllo on 16/10/8.
 */
public class VideosFragment extends BaseFragment {
    private ListView listView;
    private VideoAdapter adapter;

    @Override
    protected int setlayout() {
        return R.layout.r_video_fragment;
    }

    @Override
    protected void initView() {
        listView = getView(R.id.video_fragment_lv);

    }

    @Override
    protected void initData() {
        adapter = new VideoAdapter(getContext());
        VolleySingleton.addRequest(Url.VIDEO_URL, VideoEntity.class, new Response.Listener<VideoEntity>() {
            @Override
            public void onResponse(VideoEntity response) {
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
