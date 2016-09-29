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
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.MoreEntity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/29.
 */
public class MoreActivityAdapter extends RecyclerView.Adapter<MoreActivityAdapter.MoreViewHolder>  {
    private Context context;
    private MoreEntity entity;
//    private List<MoreEntity> entityList;

    private OnRecyclerItemClickListener listener;
//    public void setEntityList(List<MoreEntity> entityList) {
//        this.entityList = entityList;
//    }

    public void setEntity(MoreEntity entity) {
        this.entity = entity;
        notifyDataSetChanged();
    }

    public MoreActivityAdapter(Context context) {

        this.context = context;
    }
    public void move(int from, int to) {
      //  Log.d("MoreActivityAdapter", "entityList.size():" + entityList.size());
        MoreEntity.ResultBean.MetalistBean.ListBean fromStr = entity.getResult().getMetalist().get(0).getList().remove(from);
       // MoreEntity fromStr = entityList.remove(from);
        int position = from >= to ? to : to - 1;
        entity.getResult().getMetalist().get(0).getList().add(position, fromStr);
        notifyItemMoved(from, to);

    }


    @Override
    public MoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_more_ac, parent, false);
        MoreViewHolder viewHolder = new MoreViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MoreViewHolder holder, int position) {
        holder.tv.setText(entity.getResult().getMetalist().get(0).getList().get(position).getName());
        Picasso.with(context).load(entity.getResult().getMetalist().get(0).getList().get(position).getIconurl()).into(holder.ima);
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int clickPosition = holder.getAdapterPosition();
                    listener.onItemClick(v, holder, clickPosition);

                }
            });

        }


    }

    @Override
    public int getItemCount() {
        return entity == null ? 0 : entity.getResult().getMetalist().get(0).getList().size();
    }
    public void setOnRecyclerItemClickListener(OnRecyclerItemClickListener listener){
        this.listener = listener;
    }

    public class
    MoreViewHolder extends RecyclerView.ViewHolder {
        private ImageView ima;
        private TextView tv;

        public MoreViewHolder(View itemView) {
            super(itemView);
            ima = (ImageView) itemView.findViewById(R.id.item_more_ima);
            tv = (TextView) itemView.findViewById(R.id.item_more_tv);
        }
    }
    public interface OnRecyclerItemClickListener{
        void onItemClick(View view,MoreViewHolder holder,int position);
    }
}
