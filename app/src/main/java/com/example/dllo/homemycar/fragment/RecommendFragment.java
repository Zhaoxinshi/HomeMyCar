package com.example.dllo.homemycar.fragment; /*
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

import android.content.Intent;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.MoreActivity;
import com.example.dllo.homemycar.custom.GridViews;

import com.example.dllo.homemycar.adapter.RecommendAllGridAdapter;
import com.example.dllo.homemycar.adapter.RecommendLunBoAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.MoreEntity;
import com.example.dllo.homemycar.entity.RecommendEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/19.
 */
public class RecommendFragment extends BaseFragment {
//    private RecyclerView recyclerView;
//    private RecommendAdapter adapter;
    private PullToRefreshScrollView scrollView;
    //五个固定图片
    private ImageView imaOne, imaTwo, imaThree, imaFour, imaFive;
    private TextView tvOne,tvTwo,tvThree,tvFour,tvFive;
    //轮播图所需控件
    private RecommendLunBoAdapter recommendLunBoAdapter;
    private ViewPager viewPager;
    private android.os.Handler handler;
    private boolean flag = true;
    private boolean mm = true;

    private GridViews gridViews;


    @Override
    protected int setlayout() {
        return R.layout.recommend_fragment;
    }

    @Override
    protected void initView() {
//        recyclerView = getView(R.id.recycler_view_recommend);

        imaOne = getView(R.id.imageone);
        imaTwo = getView(R.id.imatwo);
        imaThree = getView(R.id.imathree);
        imaFour = getView(R.id.imafour);
        imaFive = getView(R.id.imafive);
        tvOne = getView(R.id.tv_one);
        tvTwo = getView(R.id.tv_two);
        tvThree = getView(R.id.tv_three);
        tvFour = getView(R.id.tv_four);
        tvFive = getView(R.id.tv_five);
        scrollView = getView(R.id.recommend_drawer_layout);

        viewPager = getView(R.id.library_recommend_view_pager);

        gridViews = getView(R.id.recommend_list_view);


    }

    @Override
    protected void initData() {
        imaFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),MoreActivity.class);
                startActivity(intent);
            }
        });
        imaTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),RecommendActivity.class);
                intent.putExtra("urls","http://app.api.autohome.com.cn/autov4.8.8/news/shuokelist-pm1-s30-lastid0.json");
                startActivity(intent);
            }
        });

//        LinearLayoutManager manager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(manager);
//        adapter = new RecommendAdapter(getContext());
//        recyclerView.setAdapter(adapter);
        scrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                //轮播图
                recommendLunBoAdapter = new RecommendLunBoAdapter(getContext());
                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html",
                        RecommendEntity.class, new Response.Listener<RecommendEntity>() {
                            @Override
                            public void onResponse(RecommendEntity response) {
                                recommendLunBoAdapter.setEntity(response);
                                viewPager.setAdapter(recommendLunBoAdapter);
                            }
                        }
                        , new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.getMessage();
                            }
                        });

                recommendLunBoAdapter.setViewPager(viewPager);
                //开启线程像handler传值
                handler = new android.os.Handler(new Callback() {

                    @Override
                    public boolean handleMessage(Message msg) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                        return false;
                    }
                });

                if (mm) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (flag) {
                                try {
                                    Thread.sleep(3000);

                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                handler.sendEmptyMessage(0);
                            }
                        }
                    }).start();
                    mm = false;
                }


                //listView

                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html", RecommendEntity.class, new Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
                        RecommendAllGridAdapter allGridAdapter = new RecommendAllGridAdapter(getContext());
                        allGridAdapter.setEntity(response);
                        gridViews.setAdapter(allGridAdapter);

                    }
                }, new ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();

                    }
                });

                scrollView.onRefreshComplete();

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {

            }
        });

//五个固定图片
        VolleySingleton.addRequest("http://news.app.autohome.com.cn/shouye_v7.0.0/mobile/metadata.ashx?a=2&pm=2&v=7.0.7&types=newstype%7C636002832282225908%2Cvideotype%7C636002832282225908", MoreEntity.class, new Listener<MoreEntity>() {
            @Override
            public void onResponse(MoreEntity response) {
//                imaOne.setImageResource(R.mipmap.youchuang);
//                imaTwo.setImageResource(R.mipmap.shuoke);
//                imaThree.setImageResource(R.mipmap.shipin);
//                imaFour.setImageResource(R.mipmap.kuaizhao);
//                imaFive.setImageResource(R.mipmap.add);
                Picasso.with(getContext()).load(response.getResult().getMetalist().get(0).getList().get(0).getIconurl()).into(imaOne);
                Picasso.with(getContext()).load(response.getResult().getMetalist().get(0).getList().get(1).getIconurl()).into(imaTwo);
                Picasso.with(getContext()).load(response.getResult().getMetalist().get(0).getList().get(2).getIconurl()).into(imaThree);
                Picasso.with(getContext()).load(response.getResult().getMetalist().get(0).getList().get(3).getIconurl()).into(imaFour);
                Picasso.with(getContext()).load(response.getResult().getMetalist().get(0).getList().get(4).getIconurl()).into(imaFive);
                tvOne.setText(response.getResult().getMetalist().get(0).getList().get(0).getName());
                tvTwo.setText(response.getResult().getMetalist().get(0).getList().get(1).getName());
                tvThree.setText(response.getResult().getMetalist().get(0).getList().get(2).getName());
                tvFour.setText(response.getResult().getMetalist().get(0).getList().get(3).getName());
                tvFive.setText(response.getResult().getMetalist().get(0).getList().get(4).getName());

            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });



//轮播图
        recommendLunBoAdapter = new RecommendLunBoAdapter(getContext());
        VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html",
                RecommendEntity.class, new Response.Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
                        recommendLunBoAdapter.setEntity(response);
                        viewPager.setAdapter(recommendLunBoAdapter);
                    }
                }
                , new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                    }
                });

        recommendLunBoAdapter.setViewPager(viewPager);
        //开启线程像handler传值
        handler = new android.os.Handler(new Callback() {

            @Override
            public boolean handleMessage(Message msg) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return false;
            }
        });

        if (mm) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (flag) {
                        try {
                            Thread.sleep(3000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.sendEmptyMessage(0);
                    }
                }
            }).start();
            mm = false;
        }


        //listView

        VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html", RecommendEntity.class, new Listener<RecommendEntity>() {
            @Override
            public void onResponse(RecommendEntity response) {
                RecommendAllGridAdapter allGridAdapter = new RecommendAllGridAdapter(getContext());
                allGridAdapter.setEntity(response);
                gridViews.setAdapter(allGridAdapter);

            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getMessage();

            }
        });


    }
}
