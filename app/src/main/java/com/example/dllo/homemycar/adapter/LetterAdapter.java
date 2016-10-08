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
import com.example.dllo.homemycar.entity.LetterEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/10/8.
 */
public class LetterAdapter extends BaseAdapter {
    private Context context;
    private LetterEntity entity;

    public void setEntity(LetterEntity entity) {
        this.entity = entity;
    }

    public LetterAdapter(Context context) {

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
        LetterViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_letter_fragment, viewGroup, false);
            holder = new LetterViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (LetterViewHolder) view.getTag();
        }

        holder.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
        holder.tv.setText(entity.getResult().getList().get(i).getReviewcount() + "" + "观众");
        holder.tvDate.setText(entity.getResult().getList().get(i).getCreatetime());
        Picasso.with(context).load(entity.getResult().getList().get(i).getImg()).into(holder.ima);
        return view;
    }

    class LetterViewHolder {
        private ImageView ima;
        private TextView tvTitle, tv, tvDate;

        public LetterViewHolder(View view) {
            ima = (ImageView) view.findViewById(R.id.item_letter_ima);
            tvTitle = (TextView) view.findViewById(R.id.item_letter_tv_title);
            tv = (TextView) view.findViewById(R.id.item_letter_tv);
            tvDate = (TextView) view.findViewById(R.id.item_letter_tv_date);
        }
    }
}
