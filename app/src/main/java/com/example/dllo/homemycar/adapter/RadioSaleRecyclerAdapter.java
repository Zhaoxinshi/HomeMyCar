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
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.FindAllEntity;
import com.example.dllo.homemycar.entity.FindBean;
import com.example.dllo.homemycar.entity.RadioEntity;

import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/21.
 */
public class RadioSaleRecyclerAdapter extends Adapter<RadioSaleRecyclerAdapter.ViewHolder> {
    private Context context;
    private FindBean entity;

    public void setListener(onRecyclerViewClickListeners listener) {
        this.listener = listener;
    }

    private onRecyclerViewClickListeners listener;

    public void setEntity(FindBean entity) {
        this.entity = entity;
    }

    public RadioSaleRecyclerAdapter(Context context) {

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.radio_item,parent,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Log.d("位置", "position:" + position);
        holder.tv.setText(entity.getResult().getCardlist().get(1).getData().get(position).getTitle());
        Picasso.with(context).load(entity.getResult().getCardlist().get(1).getData().get(position).getImageurl()).into(holder.ima);

        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int clickPosition = holder.getAdapterPosition();
                    listener.onItemClick(v, holder, clickPosition);

                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return entity==null?0:entity.getResult().getCardlist().get(1).getData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ima;
        private TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            ima = (ImageView) itemView.findViewById(R.id.radio_ima);
            tv = (TextView) itemView.findViewById(R.id.radio_tv);
        }
    }
    public interface  onRecyclerViewClickListeners{
        void onItemClick(View view,ViewHolder holder,int position);

    }
}
