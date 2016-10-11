package com.example.dllo.homemycar.adapter;
//                .-~~~~~~~~~-._       _.-~~~~~~~~~-.
//            __.'              ~.   .~              `.__
//          .'//                  \./                   \\`.
//        .'//            为什么坚持  想一想当初             \\`.
//      .'// .-~"""""""~~~~-._     |     _,-~~~~"""""""~-.  \\`.
//    .'//.-"                 `-.  |  .-'                 "-. \\`.
//  .'//______.============-..   \ | /   ..-============._______\\`.
//.'//____________________________\|/_____________________________\\`.
// 
//                             

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.LimitedBuyBean;
import com.squareup.picasso.Picasso;



/**
 * Created by 7 on 16/8/27.
 */
public class LimitedBuyAdapter extends BaseAdapter {
    Context context;
    LimitedBuyBean limitedBuyBean;

    public LimitedBuyAdapter(Context context) {
        this.context = context;
    }

    public void setLimitedBuyBean(LimitedBuyBean limitedBuyBean) {
        this.limitedBuyBean = limitedBuyBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (limitedBuyBean.getResult().getLimitedbuy().getLimitedbuyinfo() == null) {
            return 0;
        }
        return limitedBuyBean.getResult().getLimitedbuy().getLimitedbuyinfo().size();
    }

    @Override
    public Object getItem(int position) {
        return limitedBuyBean.getResult().getLimitedbuy().getLimitedbuyinfo().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_limitedbuy , null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
       Picasso.with(context).load(limitedBuyBean.getResult().getLimitedbuy().getLimitedbuyinfo().get(position).getImgurl()).into(viewHolder.iv);

        return convertView;
    }

    private class ViewHolder {
        ImageView iv;

        public ViewHolder(View view) {
            iv = (ImageView) view.findViewById(R.id.limited_buy_iv);
        }
    }
}
