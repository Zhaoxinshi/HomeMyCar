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
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.HeadHotNewCarEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/30.
 */
public class HeadNewCarHotAdapter extends RecyclerView.Adapter<HeadNewCarHotAdapter.HotViewHolder> {
    private Context context;
    private HeadHotNewCarEntity entity;

    public void setEntity(HeadHotNewCarEntity entity) {
        this.entity = entity;
    }

    public HeadNewCarHotAdapter(Context context) {

        this.context = context;
    }

    @Override
    public HotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HotViewHolder hotViewHolder = null;
        View view = LayoutInflater.from(context).inflate(R.layout.item_head_new_car_hot,parent,false);
        hotViewHolder = new HotViewHolder(view);
        return hotViewHolder;
    }

    @Override
    public void onBindViewHolder(HotViewHolder holder, int position) {
        holder.tv.setText(entity.getResult().getList().get(position).getName());

        Picasso.with(context).load(entity.getResult().getList().get(position).getImg()).into(holder.ima);

    }

    @Override
    public int getItemCount() {
        return entity == null ? 0 : entity.getResult().getList().size();
    }

    public class HotViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private ImageView ima;
        public HotViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.item_head_new_car_hot_tb);
            ima = (ImageView) itemView.findViewById(R.id.item_head_new_car_hot_ima);
        }
    }
}
