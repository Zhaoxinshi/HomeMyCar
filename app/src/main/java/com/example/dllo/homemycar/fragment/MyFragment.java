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
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.CollectActivity;
import com.example.dllo.homemycar.actity.DraftActivity;
import com.example.dllo.homemycar.actity.HistoryActivity;
import com.example.dllo.homemycar.actity.PreferentialActivity;
import com.example.dllo.homemycar.actity.SetUpActivity;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;

/**
 * Created by dllo on 16/9/19.
 */
public class MyFragment extends BaseFragment implements OnClickListener {
    private RelativeLayout rlCollect;
    private RelativeLayout rlPreferential,rlHistory,rlCg,rlSetUp;
    private ImageView imaDay;


    @Override
    protected int setlayout() {
        return R.layout.my_fragment;
    }

    @Override
    protected void initView() {
        rlCollect = getView(R.id.my_rl_collect);
        rlPreferential = getView(R.id.rl_preferential);
        rlHistory = getView(R.id.my_rl_history);
        rlCg = getView(R.id.my_fragment_cao_gao_rl);
        rlSetUp = getView(R.id.my_fragment_set_up_rl);
        imaDay = getView(R.id.ima_day);


    }

    @Override
    protected void initData() {
        rlCollect.setOnClickListener(this);
        rlPreferential.setOnClickListener(this);
        rlHistory.setOnClickListener(this);
        rlCg.setOnClickListener(this);
        rlSetUp.setOnClickListener(this);
        imaDay.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_rl_collect:
                startActivity(new Intent(getContext(),CollectActivity.class));
                break;
            case R.id.rl_preferential:
                startActivity(new Intent(getContext(),PreferentialActivity.class));
                break;
            case R.id.my_rl_history:
                startActivity(new Intent(getContext(),HistoryActivity.class));
                Log.d("监听", "onClick: ");
                Toast.makeText(mContext, "点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_fragment_cao_gao_rl:
                startActivity(new Intent(getContext(),DraftActivity.class));
                break;
            case R.id.my_fragment_set_up_rl:
                startActivity(new Intent(getContext(),SetUpActivity.class));
                break;

        }

    }
}
