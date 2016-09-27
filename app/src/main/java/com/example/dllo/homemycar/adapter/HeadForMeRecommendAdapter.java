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
import com.example.dllo.homemycar.entity.FindEntity;

import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/21.
 */
public class HeadForMeRecommendAdapter extends BaseAdapter {
    private Context context;

    public void setEntity(FindEntity entity) {
        this.entity = entity;
    }

    public HeadForMeRecommendAdapter(Context context) {

        this.context = context;
    }

    private FindEntity entity;

    @Override
    public int getCount() {
        return entity==null?0:entity.getResult().getModulelist().get(1).getList().size() ;
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getModulelist().get(1).getList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        HeadForMeRecommendViewHolder holder = null;
        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.item_head_like_to,viewGroup,false);
            holder = new HeadForMeRecommendViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (HeadForMeRecommendViewHolder) view.getTag();
        }
        holder.tvTitle.setText(entity.getResult().getModulelist().get(1).getList().get(i).getTitle());
        holder.tvPreferential.setText(entity.getResult().getModulelist().get(1).getList().get(i).getAdinfo());
        holder.tvLowPrice.setText(entity.getResult().getModulelist().get(1).getList().get(i).getPrice());
        holder.tvUpprice.setText(entity.getResult().getModulelist().get(1).getList().get(i).getFctprice());
        Picasso.with(context).load(entity.getResult().getModulelist().get(1).getList().get(i).getLogo()).into(holder.ima);
        return view;
    }

    class HeadForMeRecommendViewHolder {
        private TextView tvTitle,tvPreferential,tvLowPrice,tvUpprice;
        private ImageView ima;
        public HeadForMeRecommendViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.item_head_for_like_to_title);
            tvPreferential = (TextView) view.findViewById(R.id.item_head_like_to_tv_preferential);
            tvLowPrice = (TextView) view.findViewById(R.id.item_head_like_to_low_price);
            tvUpprice = (TextView) view.findViewById(R.id.item_head_like_to_up_price);
            ima = (ImageView) view.findViewById(R.id.item_head_like_to_ima);
        }
    }
}
