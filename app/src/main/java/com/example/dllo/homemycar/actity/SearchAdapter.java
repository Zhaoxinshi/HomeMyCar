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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.SourEntity;

/**
 * Created by dllo on 16/10/11.
 */
public class SearchAdapter extends BaseAdapter {
    private Context context;
    private SourEntity entity;

    public SearchAdapter(Context context) {
        this.context = context;
    }

    public void setEntity(SourEntity entity) {
        this.entity = entity;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getWordlist().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getWordlist().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SourViewHolder holder = null;
        if (view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_sour_ac,viewGroup,false);
            holder = new SourViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (SourViewHolder) view.getTag();
        }
        holder.tv.setText(entity.getResult().getWordlist().get(i).getName());

        return view;
    }
    class SourViewHolder{
        private TextView tv;
        public SourViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.item_sour_ac_tv_title);

        }
    }
}
