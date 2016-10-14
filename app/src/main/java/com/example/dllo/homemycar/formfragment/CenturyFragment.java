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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.CenturyActivity;
import com.example.dllo.homemycar.actity.HotActivity;
import com.example.dllo.homemycar.adapter.CenturyAdapter;
import com.example.dllo.homemycar.adapter.CenturySisterAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.CenturyEntity;
import com.example.dllo.homemycar.entity.CenturySisterEntity;
import com.example.dllo.homemycar.entity.Url;

import com.example.dllo.homemycar.volley.VolleySingleton;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

/**
 * Created by dllo on 16/9/19.
 */
public class CenturyFragment extends BaseFragment implements OnClickListener {
    private PullToRefreshListView listView;
    private Button btnCarModel, btnBeautil, btnHead, btnFriend, btnS, btnSister;
    private View custonView;
    private TextView tvAll;
    private View headHotView;
    private LinearLayout headLl;
    private CenturyAdapter adapter;
    private int number;

    @Override
    protected int setlayout() {
        return R.layout.century_fragment;
    }

    @Override
    protected void initView() {
        listView = getView(R.id.century_list_view);
//        tvAll.setOnClickListener(this);
        listView.setMode(PullToRefreshBase.Mode.BOTH);


    }


    @Override
    protected void initData() {


        VolleySingleton.addRequest("http://223.99.255.20/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud=2&categoryid=0&pageindex=1&pagesize=30&devicetype=android.1501_M02&deviceid=860954030358581&userid=0&operation=1&netstate=0&gps=38.889726%2C121.550943", CenturyEntity.class, new Response.Listener<CenturyEntity>() {
            @Override
            public void onResponse(CenturyEntity response) {
                adapter = new CenturyAdapter(getContext());
                listView.setAdapter(adapter);
                adapter.setEntity(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),WebCenturyActivity.class);
                intent.putExtra("position", i);
                startActivityForResult(intent, i);
            }
        });


        listView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {

            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                Log.d("Sysout", "onRefresh");

                VolleySingleton.addRequest("http://223.99.255.20/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud=2&categoryid=0&pageindex=1&pagesize=30&devicetype=android.1501_M02&deviceid=860954030358581&userid=0&operation=1&netstate=0&gps=38.889726%2C121.550943", CenturyEntity.class, new Response.Listener<CenturyEntity>() {
                    @Override
                    public void onResponse(CenturyEntity response) {
                        adapter.setEntity(response);
                        Log.d("内容", "response:" + response);
                        listView.onRefreshComplete();
                        Log.d("Sysout", "asdf");

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Sysout", "cuowo");
                        listView.onRefreshComplete();
                    }
                });
//                listView.onRefreshComplete();
                //   listView.setRefreshing(false);

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {

                number = number +1;
                String url = "http://223.99.255.20/clubnc.app.autohome.com.cn/club_v7.0.5/club/jingxuantopic.ashx?platud="+number+"&categoryid=0&pageindex=1&pagesize=30&devicetype=android.1501_M02&deviceid=860954030358581&userid=0&operation=1&netstate=0&gps=38.889726%2C121.550943";
                VolleySingleton.addRequest(url,CenturyEntity.class, new Response.Listener<CenturyEntity>() {
                    @Override
                    public void onResponse(CenturyEntity response) {
                        adapter.setEntitys(response);
                        listView.onRefreshComplete();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                        listView.onRefreshComplete();
                    }
                });
            }

        });


        ListView listView1 = listView.getRefreshableView();
        custonView = LayoutInflater.from(getContext()).inflate(R.layout.heat_century_lv, null);
        listView1.addHeaderView(custonView);
        btnCarModel = (Button) custonView.findViewById(R.id.btn_century_model);
        btnBeautil = (Button) custonView.findViewById(R.id.btn_beautiful_people);
        btnHead = (Button) custonView.findViewById(R.id.btn_head);
        btnS = (Button) custonView.findViewById(R.id.btn_ss);
        btnFriend = (Button) custonView.findViewById(R.id.btn_friend);
        btnSister = (Button) custonView.findViewById(R.id.btn_sister);
        tvAll = (TextView) custonView.findViewById(R.id.caonima);
        tvAll.setOnClickListener(this);
        headHotView = LayoutInflater.from(getContext()).inflate(R.layout.hot_head, null);
        listView1.addHeaderView(headHotView);
        headLl = (LinearLayout) headHotView.findViewById(R.id.hot_head);
        headLl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), HotActivity.class));
            }
        });

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
        btnCarModel.setOnClickListener(this);
        btnBeautil.setOnClickListener(this);
        btnHead.setOnClickListener(this);
        btnFriend.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnSister.setOnClickListener(this);


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
        switch (view.getId()) {
            case R.id.caonima:
                startActivity(new Intent(getContext(), CenturyActivity.class));
                break;
            case R.id.btn_century_model:
                //媳妇当车模
//                startActivity(new Intent(getContext(),CenturyModelActivity.class));
                Intent intentCat = new Intent(getContext(), CenturySsActivity.class);
                String urlCat = Url.WIFE_MODEL_URL;
                intentCat.putExtra("url", urlCat);
                startActivity(intentCat);
                break;
            case R.id.btn_beautiful_people:
                //美人计
//                startActivity(new Intent(getContext(),CenturyBeautilActivity.class));
                Intent intentBeautiful = new Intent(getContext(), CenturySsActivity.class);
                String urlBeautiful = Url.NOTORIOUS_URL;
                intentBeautiful.putExtra("url", urlBeautiful);
                startActivity(intentBeautiful);

                break;
            case R.id.btn_head:
//                startActivity(new Intent(getContext(),CenturyHeadActivity.class));
                Intent intentHead = new Intent(getContext(), CenturySsActivity.class);
                String urlHead = Url.HIGH_POINT_URL;
                intentHead.putExtra("url", urlHead);
                startActivity(intentHead);


                //高端阵地
                break;
            case R.id.btn_friend:
                Intent intentFriend = new Intent(getContext(), CenturySsActivity.class);
                String urlFriend = Url.FRIEND_HEAVEN_EARTH_URL;
                intentFriend.putExtra("url", urlFriend);
                startActivity(intentFriend);
                //莫you天地
                break;
            case R.id.btn_ss:
                Intent intentSi = new Intent(getContext(), CenturySsActivity.class);
                String urlSi = Url.AUSLESE_URL;
                Log.d("精挑细选", urlSi);
                intentSi.putExtra("url", urlSi);
                startActivity(intentSi);
                //精挑细选
                break;
            case R.id.btn_sister:
                Intent intent = new Intent(getContext(), CenturySsActivity.class);
                String urlSister = Url.SISTER_CAR_URL;
                intent.putExtra("url", urlSister);
                startActivity(intent);
                //妹子选车
                break;

        }
    }
}
