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
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.FindAllEntity;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/23.
 */
public class RvServiceAdapter extends Adapter<RvServiceAdapter.ViewHolderService> {
    private Context context;
    private FindAllEntity entity;

    public void setEntity(FindAllEntity entity) {
        this.entity = entity;
    }

    public RvServiceAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolderService onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.service_find_item, parent, false);
        ViewHolderService holderService = new ViewHolderService(view);
        return holderService;
    }

    @Override
    public void onBindViewHolder(ViewHolderService holder, int position) {
        Picasso.with(context).load(entity.getResult().getCardlist().get(4).getData().get(position).getImageurl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return entity == null ? 0 : entity.getResult().getCardlist().get(4).getData().size();
    }

    public class ViewHolderService extends ViewHolder {
        private ImageView imageView;

        public ViewHolderService(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.ima_service_item);
        }
    }
}
