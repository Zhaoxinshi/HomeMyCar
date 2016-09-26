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
import android.util.Log;
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
public class RadioSaleAdapter extends BaseAdapter {
    private Context context;
    private FindEntity entity;

    public void setEntity(FindEntity entity) {
        this.entity = entity;
    }

    public RadioSaleAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getGoodslist().getList().size();
    }

    @Override
    public Object getItem(int i) {

        return entity.getResult().getGoodslist().getList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RadioSaleViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_radio_sale_goods, viewGroup, false);
            holder = new RadioSaleViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (RadioSaleViewHolder) view.getTag();

        }
        Picasso.with(context).load(entity.getResult().getGoodslist().getList().get(i).getLogo()).into(holder.imageView);
        holder.tvTitle.setText(entity.getResult().getGoodslist().getList().get(i).getTitle());
        holder.tvPreferential.setText(entity.getResult().getGoodslist().getList().get(i).getAdinfo());
        holder.tvLowPrice.setText(entity.getResult().getGoodslist().getList().get(i).getPrice());
        holder.tvUpPrice.setText(entity.getResult().getGoodslist().getList().get(i).getFctprice());

        return view;
    }

    class RadioSaleViewHolder {
        private ImageView imageView;
        private TextView tvTitle, tvPreferential, tvLowPrice, tvUpPrice;


        public RadioSaleViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.item_radio_sale_ima);
            tvTitle = (TextView) view.findViewById(R.id.item_radio_sale_tv_title);
            tvPreferential = (TextView) view.findViewById(R.id.item_radio_sale_tv_preferential);
            tvLowPrice = (TextView) view.findViewById(R.id.item_radio_sale_tv_low_price);
            tvUpPrice = (TextView) view.findViewById(R.id.item_radio_sale_tv_up_price);

        }
    }
}
