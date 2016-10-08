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
import com.example.dllo.homemycar.entity.LobbyitsEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/8.
 */
public class RecLobAdapter extends BaseAdapter {
    private Context context;
    private LobbyitsEntity entity;

    public void setEntity(LobbyitsEntity entity) {
        this.entity = entity;
    }

    public RecLobAdapter(Context context) {

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
        RecLobViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_rec_lob_fragment, viewGroup, false);
            holder = new RecLobViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (RecLobViewHolder) view.getTag();



        }holder.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
        holder.tv.setText(entity.getResult().getList().get(i).getReplycount() + "" + "评论");
        holder.tvDate.setText(entity.getResult().getList().get(i).getTime());
        Picasso.with(context).load(entity.getResult().getList().get(i).getSmallpic()).into(holder.ima);
        return view;
    }

    class RecLobViewHolder {
        private TextView tvTitle, tv, tvDate;
        private ImageView ima;

        public RecLobViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.tv_rec_lob_all_title);
            tv = (TextView) view.findViewById(R.id.item_rec_tv_rec_lob);
            tvDate = (TextView) view.findViewById(R.id.tv_rec_lob_all_time);
            ima = (ImageView) view.findViewById(R.id.ima_rec_lob_all);

        }
    }
}
