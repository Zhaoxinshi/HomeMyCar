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
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.CenturyActivityAdapter;
import com.example.dllo.homemycar.entity.CenturyBean;
import com.example.dllo.homemycar.entity.Url;

import java.util.ArrayList;

/**
 * Created by dllo on 16/9/26.
 */
public class CenturyActivity extends FragmentActivity {
    private ListView listView;
    private ArrayList<CenturyBean> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.century_activity);
        listView = (ListView) findViewById(R.id.ac_century_lv);
        String[] tv = this.getResources().getStringArray(R.array.alls);
        strings = new ArrayList<>();
        CenturyActivityAdapter adapter = new CenturyActivityAdapter(this);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(CenturyActivity.this,AllActivity.class);
//                startActivity(intent);
//            }
//        });

        for (int i = 0; i < tv.length; i++) {
            CenturyBean bean = new CenturyBean();
            bean.setTitle(tv[i]);
            strings.add(bean);
        }
        adapter.setStrings(strings);
//        View headView = LayoutInflater.from(this).inflate(R.layout.head_century,null);
//        listView.addHeaderView(headView);
//        String [] urlList = {Url.WIFE_MODEL_URL,Url.NOTORIOUS_URL};

        final ArrayList<String> list = new ArrayList<>();
        list.add( Url.WIFE_MODEL_URL);
        list.add( Url.NOTORIOUS_URL);
        list.add( Url.HOF_URL);
        list.add( Url.LECTURER_URL);
        list.add( Url.AUSLESE_URL);
        list.add( Url.DISCOURSE_URL);
        list.add( Url.HIGH_POINT_URL);
        list.add( Url.ELECTRIC_VEHICLE_URL);
        list.add( Url.BUY_CAR_URL);
        list.add( Url.DRIVING_CRITIQUE_URL);
        list.add( Url.DRIVING_MEMBER_URL);
        list.add( Url.OVERSEAS_BUYERSL_URL);
        list.add( Url.CLASSIC_CAR_URL);
        list.add( Url.SISTER_CAR_URL);
        list.add( Url.PREFERENTIAL_CAR_URL);
        list.add( Url.ORIGINAL_LARGE_URL);
        list.add( Url.TOP_ELEGANT_URL);
        list.add( Url.MODIFIED_RATIONAL_URL);
        list.add( Url.WAY_MOTORING_URL);
        list.add( Url.FIRST_CAMP_URL);
        list.add( Url.NEW_LIVE_URL);
        list.add( Url.HISTORICAL_TOPIC_URL);
        list.add( Url.GREAT_VIDEO_URL);
        list.add( Url.FRIEND_HEAVEN_EARTH_URL);
        list.add( Url.HONEYMOON_URL);
        list.add( Url.SWEET_WEDDING_URL);
        list.add( Url.PHOTOGRAPHY_CLASS_URL);
        list.add( Url.CAR_PARTY_URL);
        list.add( Url.BIKE_TRIBE_URL);
        list.add( Url.GOSSIP_CLUB_URL);
        list.add( Url.NORCO_TRAVELS_URL);
        list.add( Url.SOUTHWEST_TRAVELS_URL);
        list.add( Url.NORTHEAST_TRAVELS_URL);
        list.add( Url.NORTHWEST_TRAVELS_URL);
        list.add( Url.SKY_TRAVELS_URL);
        list.add( Url.SOUTH_TRAVELS_URL);
        list.add( Url.HYZ_TRAVELS_URL);
        list.add( Url.MACAO_TRAVELS_URL);
        list.add( Url.OVERSEAS_TRAVELS_URL);
        list.add( Url.SEA_PEARL_URL);


        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(CenturyActivity.this, ItemCenturyActivity.class);
                String u = list.get(i);
                Log.d("基础", u);

                intent.putExtra("s", u);

                startActivity(intent);

            }
        });


    }


}
