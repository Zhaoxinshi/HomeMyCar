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
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.custom.DataCleanManager;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;


/**
 * Created by dllo on 16/9/27.
 */
public class SetUpActivity extends FragmentActivity {
    private TextView tvClear, tvCatch;
    private String file;
    private Switch aSwitch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeChangeUtil.changeTheme(this);
        setContentView(R.layout.set_up_ac);
        tvClear = (TextView) findViewById(R.id.my_fragment_tv_clear);
        tvCatch = (TextView) findViewById(R.id.my_fragment_catch);
        aSwitch = (Switch) findViewById(R.id.swich_day);
        file = null;
        try {
            file = DataCleanManager.getTotalCacheSize(this);
            tvCatch.setText(file);
            tvClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DataCleanManager.clearAllCache(SetUpActivity.this);
                    Toast.makeText(SetUpActivity.this, "清除了缓存", Toast.LENGTH_SHORT).show();
                    try {
                        file = DataCleanManager.getTotalCacheSize(SetUpActivity.this);
                        tvCatch.setText(file);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SetUpActivity.this, "s", Toast.LENGTH_SHORT).show();
                if (ThemeChangeUtil.isChange) {
                    ThemeChangeUtil.isChange = false;
                } else {
                    ThemeChangeUtil.isChange = true;
                }
                SetUpActivity.this.recreate();//重新创建当前Activity实例
            }
        });


    }
}
