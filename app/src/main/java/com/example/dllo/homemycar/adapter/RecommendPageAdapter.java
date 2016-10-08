package com.example.dllo.homemycar.adapter; /*
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

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dllo.homemycar.entity.Url;
import com.example.dllo.homemycar.recommendfragment.RecSameFragment;
import com.example.dllo.homemycar.recommendfragment.RecommendFragment;
import com.example.dllo.homemycar.recommendfragment.LetterFragment;
import com.example.dllo.homemycar.recommendfragment.LobbYistsFragment;
import com.example.dllo.homemycar.recommendfragment.MarketFragment;
import com.example.dllo.homemycar.recommendfragment.VideosFragment;

/**
 * Created by dllo on 16/10/8.
 */
public class RecommendPageAdapter extends FragmentPagerAdapter {
    String[] strings = new String[]{"推荐", "说客", "视频", "快报", "行情", "新闻", "评测", "导购", "用车",
            "技术", "文化", "改装"};
    String[] url = {Url.RECOMMEND_URL,Url.LOBBYISTS_URL,Url.VIDEO_URL,Url.LETTERS_URL,Url.MARKET_URL,Url.NEWS_URL,Url.REVIEW_URL,Url.SHOPPERS_URL,
    Url.THE_CAR_URL,Url.TECHNOLOGY_URL,Url.CULTURE_URL,Url.MODIFIED_URL};
    Fragment[] fragments;
    public RecommendPageAdapter(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[strings.length];
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            fragments[0] = new RecommendFragment();
        }else if (position==1){
            fragments[1] = new LobbYistsFragment();
        }else if (position==2){
            fragments[2] = new VideosFragment();
        }else if (position==3){
            fragments[3] = new LetterFragment();
        }else if (position==4){
            fragments[4] = new MarketFragment();
        }else {
            fragments[position] = RecSameFragment. getInstance(url[position]);
        }
        return fragments[position];
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
