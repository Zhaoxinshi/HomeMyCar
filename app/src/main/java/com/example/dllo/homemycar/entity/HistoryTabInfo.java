package com.example.dllo.homemycar.entity; /*
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

import com.example.dllo.homemycar.historyfragment.ForumFragment;
import com.example.dllo.homemycar.historyfragment.PasteFragment;
import com.example.dllo.homemycar.historyfragment.SpeakFragment;
import com.example.dllo.homemycar.historyfragment.VideoFragment;
import com.example.dllo.homemycar.mycolect.CarModelFragment;
import com.example.dllo.homemycar.mycolect.CarReputationFragment;
import com.example.dllo.homemycar.mycolect.CarUpFragment;
import com.example.dllo.homemycar.mycolect.TitleFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class HistoryTabInfo {
    private String title;
    private Fragment fragment;

    public HistoryTabInfo(String title, Fragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public static List<HistoryTabInfo> getHistoryTabInfo() {
        List<HistoryTabInfo> tabInfos = new ArrayList<>();
        tabInfos.add(new HistoryTabInfo("车系", new CarUpFragment()));
        tabInfos.add(new HistoryTabInfo("车型", new CarModelFragment()));
        tabInfos.add(new HistoryTabInfo("口碑", new CarReputationFragment()));
        tabInfos.add(new HistoryTabInfo("文章", new TitleFragment()));
        tabInfos.add(new HistoryTabInfo("视频", new VideoFragment()));
        tabInfos.add(new HistoryTabInfo("说客", new SpeakFragment()));
        tabInfos.add(new HistoryTabInfo("论坛", new ForumFragment()));
        tabInfos.add(new HistoryTabInfo("帖子", new PasteFragment()));
        return tabInfos;
    }
}
