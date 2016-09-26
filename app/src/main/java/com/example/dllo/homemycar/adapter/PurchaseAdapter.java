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
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.Volley;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.PurchaseEntity;
import com.example.dllo.homemycar.imageloader.DoubleCache;
import com.example.dllo.homemycar.imageloader.MemoryCache;
import com.example.dllo.homemycar.imageloader.SingleQueue;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/22.
 */
public class PurchaseAdapter extends BaseAdapter {
    private Context context;
    private PurchaseEntity entity;


    public void setEntity(PurchaseEntity entity) {
        this.entity = entity;
    }

    public PurchaseAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getLimitedbuy().getLimitedbuyinfo().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getLimitedbuy().getLimitedbuyinfo().get(i);
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderLimit holderLimit = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.limit_radio_sale, viewGroup, false);
            holderLimit = new ViewHolderLimit(view);
            view.setTag(holderLimit);
        } else {
            holderLimit = (ViewHolderLimit) view.getTag();
        }

//        String path = entity.getResult().getLimitedbuy().getLimitedbuyinfo().get(i).getImgurl();
//        Log.d("草泥马", path);
//
//        Picasso.with(context).load(entity.getResult().getLimitedbuy().getLimitedbuyinfo().get(i).getImgurl()).into(holderLimit.ima);
        ImageLoader.ImageListener listener = ImageLoader.getImageListener(holderLimit.ima,R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        SingleQueue.getSingleQueue(context).getImageLoader().get(entity.getResult().getLimitedbuy().getLimitedbuyinfo().get(i).getImgurl(),listener);
        Log.d("PurchaseAdapter", entity.getResult().getLimitedbuy().getLimitedbuyinfo().get(0).getImgurl());

        return view;
    }

    class ViewHolderLimit {
        private ImageView ima;

        public ViewHolderLimit
                (View view) {
            ima = (ImageView) view.findViewById(R.id.radio_sale_ima_limit);

        }

    }
}
