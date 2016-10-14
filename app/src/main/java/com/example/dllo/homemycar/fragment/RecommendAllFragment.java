package com.example.dllo.homemycar.fragment; /*
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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.MoreActivity;
import com.example.dllo.homemycar.adapter.RecommendPageAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.MoreEntity;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by dllo on 16/10/8.
 */
public class RecommendAllFragment extends BaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecommendPageAdapter adapter;
    private ImageView ima;
    private int p;


    @Override
    protected int setlayout() {
        return R.layout.recommend_all_fragment;
    }

    @Override
    protected void initView() {
        tabLayout = getView(R.id.recommend_all_fragment_tab_layout);
        viewPager = getView(R.id.recommend_all_fragment_view_pager);
        ima = getView(R.id.recommend_all_fragment_ima);
        ima.setAlpha(90);


    }


    @Override
    protected void initData() {

        adapter = new RecommendPageAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.GRAY, Color.BLACK);
        tabLayout.setSelectedTabIndicatorColor(Color.BLACK);
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MoreActivity.class);
                startActivityForResult(intent,101);
            }
        });


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == 100) {
            int position = data.getIntExtra("popopo",0);
            viewPager.setCurrentItem(position);
        }

    }
}
