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
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.FindEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/22.
 */
public class LikeRecyclerViewAdapter extends Adapter<LikeRecyclerViewAdapter.LikeViewHolder> {
    private FindEntity entity;
    private Context context;

    public void setEntity(FindEntity entity) {
        this.entity = entity;
    }

    public LikeRecyclerViewAdapter(Context context) {

        this.context = context;
    }

    @Override
    public LikeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_head_for_me,parent,false);
        LikeViewHolder holder = new LikeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(LikeViewHolder holder, int position) {
        holder.tvUpprice.setText(entity.getResult().getModulelist().get(0).getList().get(position).getFctprice());
        holder.tvTitle.setText(entity.getResult().getModulelist().get(0).getList().get(position).getTitle());
        holder.tvLowPrice.setText(entity.getResult().getModulelist().get(0).getList().get(position).getPrice());
        holder.tvPreferential.setText(entity.getResult().getModulelist().get(0).getList().get(position).getAdinfo());

        Picasso.with(context).load(entity.getResult().getModulelist().get(0).getList().get(position).getLogo()).into(holder.ima);

    }

    @Override
    public int getItemCount() {
        if (entity.getResult().getModulelist() == null) {
            return 0;
        }
        return 4;
    }

    public class LikeViewHolder extends ViewHolder {
        private TextView tvTitle,tvPreferential,tvLowPrice,tvUpprice;
        private ImageView ima;
        public LikeViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.item_head_for_me_tv_title);
            tvPreferential = (TextView) itemView.findViewById(R.id.item_head_for_me_tv_preferential);
            tvLowPrice = (TextView) itemView.findViewById(R.id.item_head_for_me_low_price);
            tvUpprice = (TextView) itemView.findViewById(R.id.item_head_for_me_up_price);
            ima = (ImageView) itemView.findViewById(R.id.item_head_for_me_ima);
        }
    }
}
