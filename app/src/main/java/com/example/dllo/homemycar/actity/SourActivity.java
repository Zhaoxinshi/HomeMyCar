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

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.SourEntity;
import com.example.dllo.homemycar.volley.VolleySingleton;


/**
 * Created by dllo on 16/10/11.
 */
public class SourActivity extends FragmentActivity {
    private EditText editText;
    private ImageView ima;
    private ListView listView;
    private SearchAdapter adapter;
    private TextView tvBack;
    private ImageView imaDelete;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sour_ac);
        editText = (EditText) findViewById(R.id.recommed_search_activity_ed);
        ima = (ImageView) findViewById(R.id.recommed_search_activity_img);
        listView = (ListView) findViewById(R.id.searchactivity_lisrview);
        tvBack = (TextView) findViewById(R.id.tv_back);
        imaDelete = (ImageView) findViewById(R.id.recommed_search_activity_img);
        imaDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().clear();

            }
        });
        initEdtext();
        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });
    }
    private void initEdtext() {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.length() == 0) {
                    ima.setVisibility(View.GONE);
                } else {
                    ima.setVisibility(View.VISIBLE);
                }
                innitRequestInternet(s);

            }
        });




    }

    private void innitRequestInternet(Editable s) {

        if (!s.toString().equals("")) {


            String str = s.toString();
            String url = "http://mobilenc.app.autohome.com.cn/sou_v5.7.0/sou/suggestwords.ashx?pm=2&k=" + str + "&t=4";
            adapter = new SearchAdapter(SourActivity.this);
            VolleySingleton.addRequest(url,SourEntity.class, new Response.Listener<SourEntity>() {
                @Override
                public void onResponse(SourEntity response) {
                    adapter.setEntity(response);
                    listView.setAdapter(adapter);

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
        }

    }


}
