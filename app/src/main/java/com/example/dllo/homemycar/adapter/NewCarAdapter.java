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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.findcarfragment.CarNameBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/29.
 */
public class NewCarAdapter extends BaseAdapter {
    private Context context;
    private List<CarNameBean> list;
    private ViewHolder viewHolder;


    public NewCarAdapter(Context context, List<CarNameBean> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean isEnabled(int position) {
        // TODO Auto-generated method stub
        if (list.get(position).getName().length() == 1)// 如果是字母索引
            return false;// 表示不能点击
        return super.isEnabled(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String item = list.get(position).getName();
        viewHolder = new ViewHolder();
        if (item.length() == 1) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_new_car_letter, null);
            viewHolder.tvLetter = (TextView) convertView.findViewById(R.id.item_tv_letter);
        } else {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_new_car_all, null);
            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.item_all_car_tv_title);
            viewHolder.itemIv = (ImageView) convertView.findViewById(R.id.item_all_car_ima);
        }
        if (item.length() == 1) {
            viewHolder.tvLetter.setText(list.get(position).getName());
        } else {
            viewHolder.tvTitle.setText(list.get(position).getName());
            Picasso.with(context).load(list.get(position).getImageUrl())
                    .into(viewHolder.itemIv);
        }
        return convertView;
    }

    private class ViewHolder {
        private TextView tvLetter;
        private TextView tvTitle;
        private ImageView itemIv;
    }

}
