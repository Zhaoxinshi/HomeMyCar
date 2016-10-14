package com.example.dllo.homemycar.historyfragment; /*
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

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.datebase.DateBaseTool;
import com.example.dllo.homemycar.entity.CollectEntity;
import com.litesuits.orm.LiteOrm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class PasteFragment extends BaseFragment {
    private DateBaseTool tool;
    private List<CollectEntity> entityList;

    @Override
    protected int setlayout() {
        return R.layout.paste_fragment;
    }

    @Override
    protected void initView() {


    }

    @Override
    protected void initData() {
        tool = new DateBaseTool(getContext());
        entityList = new ArrayList<>();

        Cursor cursor = tool.query();
        if (cursor!=null&&cursor.moveToFirst()) {
            int indexUrl = cursor.getColumnIndex("url");
            do {
                String url = cursor.getString(indexUrl);
                Log.d("我操你妈", url);

            }while (cursor.moveToNext());
            cursor.close();

        }

    }
}
