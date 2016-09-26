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
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.CenturyActivity;
import com.example.dllo.homemycar.adapter.CenturyAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.CenturyEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/19.
 */
public class CenturyFragment extends BaseFragment implements OnClickListener {
    private ListView listView;
    private Button btnCarModel,btnBeautil,btnHead,btnFriend,btnS,btnSister;
    private View custonView;
    private TextView tvAll;

    @Override
    protected int setlayout() {
        return R.layout.century_fragment;
    }

    @Override
    protected void initView() {
        listView = getView(R.id.century_list_view);
//        tvAll.setOnClickListener(this);




    }

    @Override
    protected void initData() {


        VolleySingleton.addRequest("http://223.99.255.20/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud=2&categoryid=0&pageindex=1&pagesize=30&devicetype=android.1501_M02&deviceid=860954030358581&userid=0&operation=1&netstate=0&gps=38.889726%2C121.550943", CenturyEntity.class, new Response.Listener<CenturyEntity>() {
            @Override
            public void onResponse(CenturyEntity response) {
                CenturyAdapter adapter = new CenturyAdapter(getContext());
                listView.setAdapter(adapter);
                adapter.setEntity(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        custonView = LayoutInflater.from(getContext()).inflate(R.layout.heat_century_lv, null);
        listView.addHeaderView(custonView);
        btnCarModel = (Button) custonView.findViewById(R.id.btn_century_model);
        btnBeautil = (Button) custonView.findViewById(R.id.btn_beautiful_people);
        btnHead = (Button) custonView.findViewById(R.id.btn_head);
        btnS = (Button) custonView.findViewById(R.id.btn_ss);
        btnFriend = (Button) custonView.findViewById(R.id.btn_friend);
        btnSister = (Button) custonView.findViewById(R.id.btn_sister);
        tvAll = (TextView) custonView.findViewById(R.id.caonima);
        tvAll.setOnClickListener(this);
        setBtnBackGround();



    }

    private void setBtnBackGround() {
        Log.d("btm", "setBtnBackGround: ");
        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(btnCarModel);
        buttons.add(btnBeautil);
        buttons.add(btnHead);
        buttons.add(btnS);
        buttons.add(btnFriend);
        buttons.add(btnSister);


        ArrayList<Integer> backGrounds = new ArrayList<>();
        backGrounds.add(R.drawable.blue_btn_bg);
        backGrounds.add(R.drawable.orange_btn_bg);
        ArrayList<Integer> intColor = new ArrayList<>();
        intColor.add(getResources().getColor(R.color.blue));
        intColor.add(getResources().getColor(R.color.orange));
        for (int i = 0; i < buttons.size(); i++) {
            int color = (int) (Math.random() * 2);
            Log.d("空", "backGrounds.get(color):" + backGrounds.get(color));
            buttons.get(i).setBackgroundResource(backGrounds.get(color));
            buttons.get(i).setTextColor(intColor.get(color));
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.caonima:
                Log.d("ssssdddd", "onClick: ");
                startActivity(new Intent(getContext(),CenturyActivity.class));
                break;
        }
    }
}
