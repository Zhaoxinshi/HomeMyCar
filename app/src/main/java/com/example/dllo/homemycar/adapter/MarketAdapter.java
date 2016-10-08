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
import com.example.dllo.homemycar.entity.MarketEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/8.
 */
public class MarketAdapter extends BaseAdapter {
    private Context context;
    private MarketEntity entity;

    public void setEntity(MarketEntity entity) {
        this.entity = entity;
    }

    public MarketAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getNewslist().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getNewslist().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MarketViewHolder holder = null;
        if (view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_market_fragment,viewGroup,false);
            holder = new MarketViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (MarketViewHolder) view.getTag();
        }
        holder.tvTitle.setText(entity.getResult().getNewslist().get(i).getTitle());
        holder.tvDate.setText(entity.getResult().getNewslist().get(i).getTime());
        Picasso.with(context).load(entity.getResult().getNewslist().get(i).getSmallpic()).into(holder.ima);
        return view;
    }
    class MarketViewHolder{
        private TextView tvTitle,tvDate;
        private ImageView ima;
        public MarketViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.item_market_fragment_tv_title);
            tvDate = (TextView) view.findViewById(R.id.item_market_fragment_tv_date);
            ima = (ImageView) view.findViewById(R.id.item_market_fragment_ima);
        }
    }
}
