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

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;


import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.SourActivity;
import com.example.dllo.homemycar.adapter.FindCarPagerAdapter;
import com.example.dllo.homemycar.base.BaseFragment;

/**
 * Created by dllo on 16/9/19.
 */
public class  FindCarFragment extends BaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView imaSour;
    @Override
    protected int setlayout() {
        return R.layout.find_car_fragment;
    }

    @Override
    protected void initView() {
        tabLayout = getView(R.id.find_car_tab);
        viewPager = getView(R.id.find_car_view_pager);
        imaSour = getView(R.id.find_car_ima_find_sour);


    }

    @Override
    protected void initData() {
        viewPager.setAdapter(new FindCarPagerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        imaSour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),SourActivity.class));
            }
        });


    }
}
