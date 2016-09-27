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
import com.example.dllo.homemycar.entity.RecommendEntity;
import com.squareup.picasso.Picasso;

import java.security.PolicySpi;
import java.util.List;

/**
 * Created by dllo on 16/9/20.
 */
public class RecommendAllGridAdapter extends BaseAdapter {

    private RecommendEntity entity;

    public void setEntity(RecommendEntity entity) {
        this.entity = entity;
    }

    private static final int TYPE_COUNT_S = 3;
    private static final int TYPE_IV = 1;
    private static final int TYPE = 0;

    private Context context;


    public RecommendAllGridAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        if (entity.getResult().getNewslist() == null) {
            return 0;
        }
        return entity.getResult().getNewslist().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getNewslist().get(i).getSmallpic();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View normalView = null;
        View threeImageView = null;
        int viewType = getItemViewType(i);
        RecommendEntity.ResultBean.NewslistBean bean = entity.getResult().getNewslist().get(i);
        RecommendEntity.ResultBean.HeadlineinfoBean headlineinfoBean = entity.getResult().getHeadlineinfo();
        if (viewType == TYPE) {
            ViewHolder holder = null;
            if (view == null) {
                normalView = LayoutInflater.from(context).inflate(R.layout.recommend_all, viewGroup, false);
                holder = new ViewHolder(normalView);
                normalView.setTag(holder);
                view = normalView;
            } else {
                holder = (ViewHolder) view.getTag();
            }
            holder.tv.setText(bean.getTitle());
            holder.tvTime.setText(bean.getTime());
            if (bean.getId() == headlineinfoBean.getId()) {
                holder.tvHead.setText("头条");
                holder.tvHead.setVisibility(View.VISIBLE);
            } else {
                holder.tvHead.setVisibility(View.INVISIBLE);
            }
            if (bean.getMediatype() == 1) {
                holder.tvHistory.setText(bean.getReplycount() + "评论");
                Picasso.with(context).load(bean.getSmallpic()).into(holder.imageView);
                holder.tvTa.setText("");
                holder.tvTa.setBackgroundResource(0);
            }
            if (bean.getMediatype() == 2) {
                holder.tvTa.setText("花边");
                holder.tvTa.setBackgroundResource(0);
                holder.tvHistory.setText(bean.getReplycount() + "评论");
                Picasso.with(context).load(bean.getSmallpic()).into(holder.imageView);
            }
            if (bean.getMediatype() == 3) {
                holder.tvHistory.setText(bean.getReplycount() + "播放");
                Picasso.with(context).load(bean.getSmallpic()).into(holder.imageView);
                holder.tvTa.setText("");
                holder.tvTa.setBackgroundResource(0);
            }
            if (bean.getMediatype() == 4) {
                holder.tvHistory.setText(bean.getReplycount() + "浏览");
                Picasso.with(context).load(bean.getSmallpic()).into(holder.imageView);
                holder.tvTa.setText("口碑");
                holder.tvTa.setBackgroundResource(0);
            }
            if (bean.getMediatype() == 5) {
                Picasso.with(context).load(bean.getSmallpic()).into(holder.imageView);
                holder.tvHistory.setText(bean.getReplycount() + "回帖");
                holder.tvTa.setText("");
                holder.tvTa.setBackgroundResource(0);
            }

        }else if (viewType == TYPE_IV) {
            ViewHolderThreeViewHolder viewHolderThreeViewHolder = null;
            if (view == null) {
                threeImageView = LayoutInflater.from(context).inflate(R.layout.item_forsix, null);
                viewHolderThreeViewHolder = new ViewHolderThreeViewHolder(threeImageView);
                threeImageView.setTag(viewHolderThreeViewHolder);
                view = threeImageView;
            } else {
                viewHolderThreeViewHolder = (ViewHolderThreeViewHolder) view.getTag();
            }
            viewHolderThreeViewHolder.titleTV.setText(bean.getTitle());
            viewHolderThreeViewHolder.tvHistory.setText(bean.getReplycount() + "图片");
            viewHolderThreeViewHolder.tvTime.setText(bean.getTime());
            String urlString = bean.getIndexdetail();
            int start = urlString.indexOf("http");
            int end = urlString.indexOf(",");
            String allUrl = urlString.substring(start, end);
            String url = urlString.substring(end + 1, urlString.length());
            int startSec = url.indexOf("http");
            int endSec = url.indexOf(",");
            String urlSec = url.substring(startSec, endSec);
            String urlThird = url.substring(endSec + 1, url.length());
            Picasso.with(context).load(allUrl).into(viewHolderThreeViewHolder.imaFirst);
            Picasso.with(context).load(urlSec).into(viewHolderThreeViewHolder.imaSecond);
            Picasso.with(context).load(urlThird).into(viewHolderThreeViewHolder.imaThird);
        }

        return view;
    }

    @Override
    public int getItemViewType(int position) {
        if (entity.getResult().getNewslist().get(position).getMediatype() == 6) {
            return TYPE_IV;
        } else {
            return TYPE;
        }
    }

    @Override
    public int getViewTypeCount() {
        return TYPE_COUNT_S;
    }

    class ViewHolder {
        private ImageView imageView;
        private TextView tv, tvTime, tvHead, tvHistory, tvTa;

        public ViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.tv_recommend_all);
            tvTime = (TextView) view.findViewById(R.id.tv_recommend_all_time);
            imageView = (ImageView) view.findViewById(R.id.ima_recommend_all);
            tvHead = (TextView) view.findViewById(R.id.tv_recommend_all_head);
            tvHistory = (TextView) view.findViewById(R.id.text_history);
            tvTa = (TextView) view.findViewById(R.id.tv_ta);

        }
    }
    class ViewHolderThreeViewHolder{
        TextView titleTV;
        ImageView imaFirst;
        ImageView imaSecond;
        ImageView imaThird;
        TextView tvTime;
        TextView tvHistory;

        public ViewHolderThreeViewHolder(View view) {
            titleTV = (TextView) view.findViewById(R.id.title_forsix);
            imaFirst = (ImageView) view.findViewById(R.id.first_iv);
            imaSecond = (ImageView) view.findViewById(R.id.second_iv);
            imaThird = (ImageView) view.findViewById(R.id.third_iv);
            tvTime = (TextView) view.findViewById(R.id.date_forsix);
            tvHistory = (TextView) view.findViewById(R.id.history_forsix);

        }
    }
}
