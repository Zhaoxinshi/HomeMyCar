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
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.RecommendEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/19.
 */
public class RecommendAdapter extends Adapter<RecyclerView.ViewHolder> {
    private Context context;

    public RecommendAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;
        switch (viewType) {
            case 0:
                View view = LayoutInflater.from(context).inflate(R.layout.item_recommend_top, parent, false);
                holder = new TopViewHolder(view);
                break;
            case 1:
                View view1 = LayoutInflater.from(context).inflate(R.layout.recommend_lun_bo, parent, false);
                holder = new LunBoViewholder(view1);
                break;
            case 2:
                View view2 = LayoutInflater.from(context).inflate(R.layout.item_recommend_all, parent, false);
                holder = new RecommendAllViewHolder(view2);

        }


        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case 0:
                TopViewHolder holder1 = (TopViewHolder) holder;
                holder1.imaOne.setImageResource(R.mipmap.youchuang);
                holder1.imaTwo.setImageResource(R.mipmap.shuoke);
                holder1.imaThree.setImageResource(R.mipmap.shipin);
                holder1.imaFour.setImageResource(R.mipmap.kuaizhao);
                holder1.imaFive.setImageResource(R.mipmap.add);
                break;
            case 1:
                final LunBoViewholder lunBoViewholder = (LunBoViewholder) holder;
                lunBoViewholder.recommendLunBoAdapter = new RecommendLunBoAdapter(context);
                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html",
                        RecommendEntity.class, new Response.Listener<RecommendEntity>() {
                            @Override
                            public void onResponse(RecommendEntity response) {
                                lunBoViewholder.recommendLunBoAdapter.setEntity(response);
                                lunBoViewholder.viewPager.setAdapter(lunBoViewholder.recommendLunBoAdapter);
                            }
                        }
                        , new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.getMessage();
                            }
                        });

                lunBoViewholder.recommendLunBoAdapter.setViewPager(lunBoViewholder.viewPager);
                lunBoViewholder.handler = new android.os.Handler(new Callback() {

                    @Override
                    public boolean handleMessage(Message msg) {
                        lunBoViewholder.viewPager.setCurrentItem(lunBoViewholder.viewPager.getCurrentItem() + 1);
                        return false;
                    }
                });

                if (lunBoViewholder.mm) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (lunBoViewholder.flag) {
                                try {
                                    Thread.sleep(3000);

                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                lunBoViewholder.handler.sendEmptyMessage(0);
                            }
                        }
                    }).start();
                    lunBoViewholder.mm = false;
                }


                break;
            case 2:
                final RecommendAllViewHolder recommendAllViewHolder = (RecommendAllViewHolder) holder;
                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html", RecommendEntity.class, new Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
//                        List<RecommendEntity> entityList = new ArrayList<>();
//                        entityList.add(response);
                        RecommendAllGridAdapter allGridAdapter = new RecommendAllGridAdapter(context);
                        allGridAdapter.setEntity(response);
                        recommendAllViewHolder.listView.setAdapter(allGridAdapter);

                    }
                }, new ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();

                    }
                });


        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 2;
        } else {
            return 3;
        }
    }

    class TopViewHolder extends RecyclerView.ViewHolder {
        private ImageView imaOne, imaTwo, imaThree, imaFour, imaFive;

        public TopViewHolder(View itemView) {
            super(itemView);
            imaOne = (ImageView) itemView.findViewById(R.id.imageone);
            imaTwo = (ImageView) itemView.findViewById(R.id.imagetwo);
            imaThree = (ImageView) itemView.findViewById(R.id.imagethree);
            imaFour = (ImageView) itemView.findViewById(R.id.imagefour);
            imaFive = (ImageView) itemView.findViewById(R.id.imagefive);
        }
    }

    class LunBoViewholder extends RecyclerView.ViewHolder {

        private ViewPager viewPager;
        //        private LinearLayout linearLayout;
        private RecommendLunBoAdapter recommendLunBoAdapter;
        private android.os.Handler handler;
        private boolean flag = true;
        private boolean mm = true;

        public LunBoViewholder(View itemView) {

            super(itemView);
            viewPager = (ViewPager) itemView.findViewById(R.id.library_recommend_view_pager);
        }
    }

    class RecommendAllViewHolder extends RecyclerView.ViewHolder {
        private ListView listView;

        public RecommendAllViewHolder(View itemView) {
            super(itemView);
           listView = (ListView) itemView.findViewById(R.id.recommend_all_list_view);
        }
    }


}
