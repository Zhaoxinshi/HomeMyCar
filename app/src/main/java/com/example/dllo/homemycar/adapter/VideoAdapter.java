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
import com.example.dllo.homemycar.entity.VideoEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/8.
 */
public class VideoAdapter extends BaseAdapter {
    private Context context;
    private VideoEntity entity;

    public void setEntity(VideoEntity entity) {
        this.entity = entity;
    }

    public VideoAdapter(Context context) {

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
        VideoViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_video_fragment, viewGroup, false);
            holder = new VideoViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (VideoViewHolder) view.getTag();
        }
        holder.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
        holder.tvPlay.setText(entity.getResult().getList().get(i).getPlaycount() + "" + "播放");
        holder.tvRelay.setText(entity.getResult().getList().get(i).getReplycount() + "" + "评论");
        holder.tvDate.setText(entity.getResult().getList().get(i).getTime());
        Picasso.with(context).load(entity.getResult().getList().get(i).getSmallimg()).into(holder.ima);

        return view;
    }

    class VideoViewHolder {
        private TextView tvTitle, tvPlay, tvRelay, tvDate;
        private ImageView ima;

        public VideoViewHolder(View view) {
            tvTitle = (TextView) view.findViewById(R.id.item_video_fragment_tv_title);
            tvPlay = (TextView) view.findViewById(R.id.item_video_fragment_tv_play);
            tvRelay = (TextView) view.findViewById(R.id.item_video_fragment_tv_relay);
            tvDate = (TextView) view.findViewById(R.id.item_video_fragment_tv_date);
            ima = (ImageView) view.findViewById(R.id.item_video_fragment_ima);
        }
    }
}
