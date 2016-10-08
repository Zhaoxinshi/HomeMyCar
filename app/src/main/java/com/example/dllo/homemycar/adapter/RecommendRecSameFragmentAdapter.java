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
import com.example.dllo.homemycar.entity.RecSameEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/8.
 */
public class RecommendRecSameFragmentAdapter extends BaseAdapter {
    private Context context;

    public void setEntity(RecSameEntity entity) {
        this.entity = entity;
    }

    public RecommendRecSameFragmentAdapter(Context context) {

        this.context = context;
    }

    private RecSameEntity entity;

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
        RecViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_rec_same_fragment, viewGroup, false);
            holder = new RecViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (RecViewHolder) view.getTag();
        }
        try {
            holder.tvRe.setText(entity.getResult().getNewslist().get(i).getReplycount()+""+"评论");
        } catch (Exception e) {

        }
        holder.tvTitle.setText(entity.getResult().getNewslist().get(i).getTitle());
        holder.tvDate.setText(entity.getResult().getNewslist().get(i).getTime());
        Picasso.with(context).load(entity.getResult().getNewslist().get(i).getSmallpic()).into(holder.ima);

        return view;
    }

    class RecViewHolder {
        private TextView tvTitle, tvRe, tvDate;
        private ImageView ima;

        public RecViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.tv_rec_all);
            tvRe = (TextView) view.findViewById(R.id.item_rec_tv_rec_sss);
            tvDate = (TextView) view.findViewById(R.id.tv_rec_all_time);
            ima = (ImageView) view.findViewById(R.id.ima_rec_all);


        }
    }
}
