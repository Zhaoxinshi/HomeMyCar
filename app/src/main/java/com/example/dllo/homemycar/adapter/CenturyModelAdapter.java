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
import com.example.dllo.homemycar.entity.CenturySisterEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/27.
 */
public class CenturyModelAdapter extends BaseAdapter {
    private Context context;
    private CenturySisterEntity entity;

    public void setEntity(CenturySisterEntity entity) {
        this.entity = entity;
    }

    public CenturyModelAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity==null?0:entity.getResult().getList().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CenturyModelViewHolder holder = null;
        if (view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_century_model_ac,viewGroup,false);
            holder = new CenturyModelViewHolder(view);
            view.setTag(holder);

        }else {
            holder = (CenturyModelViewHolder) view.getTag();
        }
        holder.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
        holder.tvQuarter.setText(entity.getResult().getList().get(i).getBbsname());
//        holder.tvTie.setText(entity.getResult().getList().get(i).getBbsid());
        Picasso.with(context).load(entity.getResult().getList().get(i).getSmallpic()).into(holder.ima);
        return view;
    }
    class CenturyModelViewHolder{
        private TextView tvTitle,tvQuarter,tvTie;
        private ImageView ima;
        public CenturyModelViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.item_century_model_title);
            tvQuarter = (TextView) view.findViewById(R.id.item_century_model_quarter);
            tvTie = (TextView) view.findViewById(R.id.item_century_model_ties);
            ima = (ImageView) view.findViewById(R.id.item_century_model_ima);



        }
    }
}
