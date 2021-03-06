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
import com.example.dllo.homemycar.entity.RecommendAllBean;
import com.example.dllo.homemycar.entity.RecommendEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/29.
 */
public class RecommendAllAdapter extends BaseAdapter {

    private Context context;
    private RecommendAllBean entity;

    public void setEntity(RecommendAllBean entity) {
        this.entity = entity;
    }

    public RecommendAllAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getList().size();

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
        RecommendViewHolders holders = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_recommend_s, viewGroup, false);
            holders = new RecommendViewHolders(view);
            view.setTag(holders);
        } else {
            holders = (RecommendViewHolders) view.getTag();

        }
        holders.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
//        holders.tvNUm.setText(entity.getResult().getList().get(i).getReplycount());
        holders.tvDate.setText(entity.getResult().getList().get(i).getTime());
        Picasso.with(context).load(entity.getResult().getList().get(i).getSmallpic()).into(holders.ima);
        return view;
    }

    class RecommendViewHolders {
        private TextView tvTitle, tvNUm, tvDate;
        private ImageView ima;

        public RecommendViewHolders(View view) {
            tvTitle = (TextView) view.findViewById(R.id.item_recommend_tv_all_titlea);
            tvNUm = (TextView) view.findViewById(R.id.item_recommend_all_tv_nums);
            tvDate = (TextView) view.findViewById(R.id.item_recommend_all_tv_datas);
            ima = (ImageView) view.findViewById(R.id.item_recommend_all_ima_d);

        }
    }
}
