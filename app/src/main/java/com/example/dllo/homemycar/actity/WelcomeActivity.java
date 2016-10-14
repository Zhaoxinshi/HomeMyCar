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
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.entity.WelcomeEntity;
import com.example.dllo.homemycar.volley.VolleySingleton;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/13.
 */
public class WelcomeActivity extends BaseActivity {
    private ImageView imageView;
    private TextView tv;

    @Override
    protected int setLayout() {
        return R.layout.welcome_ac;
    }

    @Override
    protected void initView() {
        imageView = getView(R.id.welcome_ima);
        tv = getView(R.id.welcome_tv_s);

    }

    @Override
    protected void initData() {
        VolleySingleton.addRequest("http://url.cn/40IP3VW", WelcomeEntity.class, new Response.Listener<WelcomeEntity>() {
            @Override
            public void onResponse(WelcomeEntity response) {
                Picasso.with(WelcomeActivity.this).load(response.getResult().getAd().getImgad().getImgurl()).into(imageView);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,WelcomeWebViewActivity.class);
                startActivity(intent);
            }
        });


    }
}
