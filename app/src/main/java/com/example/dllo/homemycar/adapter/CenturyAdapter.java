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
import com.example.dllo.homemycar.entity.CenturyEntity;

import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/21.
 */
public class CenturyAdapter extends BaseAdapter {
    private Context context;
    private CenturyEntity entity;

    public void setEntity(CenturyEntity entity) {
        this.entity = entity;
        notifyDataSetChanged();
    }
    public void setEntitys(CenturyEntity entitys){
        this.entity = entitys;
        entity.getResult().getList().addAll(entitys.getResult().getList());
        notifyDataSetChanged();
    }

    public CenturyAdapter(Context context) {

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
        ViewHolderCentury viewHolderCentury = null;
        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.item_cuntury,viewGroup,false);
            viewHolderCentury = new ViewHolderCentury(view);
            view.setTag(viewHolderCentury);
        }else {
            viewHolderCentury = (ViewHolderCentury) view.getTag();
        }
        Picasso.with(context).load(entity.getResult().getList().get(i).getSmallpic()).into(viewHolderCentury.ima);
        viewHolderCentury.tvType.setText(entity.getResult().getList().get(i).getTitle());
        viewHolderCentury.tvTak.setText(entity.getResult().getList().get(i).getBbsname());
        viewHolderCentury.tv.setText(entity.getResult().getList().get(i).getReplycounts()+"回帖");

        return view;
    }

    class ViewHolderCentury {
        private TextView tv,tvType,tvTak;
        private ImageView ima;
        public ViewHolderCentury(View view) {
            ima = (ImageView) view.findViewById(R.id.item_century_ima);
            tv = (TextView) view.findViewById(R.id.item_century_tv);
            tvTak = (TextView) view.findViewById(R.id.item_century_tv_tak);
            tvType = (TextView) view.findViewById(R.id.item_century_tv_type);
        }
    }
}
