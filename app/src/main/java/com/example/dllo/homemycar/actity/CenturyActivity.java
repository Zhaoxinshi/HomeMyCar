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

import android.app.Activity;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.CenturyActivityAdapter;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.entity.CenturyBean;

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

        for (int i = 0; i < tv.length; i++) {
            CenturyBean bean = new CenturyBean();
            bean.setTitle(tv[i]);
            strings.add(bean);
        }
        adapter.setStrings(strings);
        View headView = LayoutInflater.from(this).inflate(R.layout.head_century,null);
        listView.addHeaderView(headView);



    }


}
