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

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.RvServiceAdapter;
import com.example.dllo.homemycar.custom.GridViews;
import com.example.dllo.homemycar.custom.HorizontialListView;

import com.example.dllo.homemycar.adapter.HeadForMeRecommendAdapter;
import com.example.dllo.homemycar.adapter.LikeRecyclerViewAdapter;
import com.example.dllo.homemycar.adapter.PurchaseAdapter;
import com.example.dllo.homemycar.adapter.RadioSaleAdapter;
import com.example.dllo.homemycar.adapter.RadioSaleRecyclerAdapter;
import com.example.dllo.homemycar.adapter.RadioSaleViewPagerAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.FindAllEntity;
import com.example.dllo.homemycar.entity.FindEntity;
import com.example.dllo.homemycar.entity.PurchaseEntity;
import com.example.dllo.homemycar.entity.RadioEntity;
import com.example.dllo.homemycar.entity.RadioSaleViewPagerEntity;
import com.example.dllo.homemycar.volleydemo.VolleySingleton;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/9/19.
 */
public class RadioSaleFragment extends BaseFragment {
    private ViewPager viewPager;
    private RadioSaleViewPagerAdapter adapter;
    private ImageView imaIma;
    private android.os.Handler handler;
    private boolean flag = true;
    private boolean mm = true;
    private RecyclerView recyclerViews;
    private RecyclerView recyclerViewLike;
    private ImageView imaAcFirst,imaAcSecond,imaAcThird;
    private HorizontialListView hzListView;
    private GridViews gridViews;
    private GridViews liadadstView;
    private ImageView imaTop;
    private RecyclerView rvService;
    private ImageView imaQuestion,imaMoney;
    public static final String LIMITEDBUY_FIND_URL =
            "http://223.99.255.20/mobile.app.autohome.com.cn/discoverj_v5.9.5/mobile/limitedbuylist-a2-pm1-v6.2.0-pid210000-cid210200.json";



    @Override
    protected int setlayout() {
        return R.layout.radio_sale_fragment;
    }

    @Override
    protected void initView() {
        viewPager = getView(R.id.radio_sale_view_pager);
        recyclerViews = getView(R.id.radio_sale_rv);
        recyclerViewLike = getView(R.id.find_like_rv);
        imaAcFirst = getView(R.id.find_activity_first);
        imaAcSecond = getView(R.id.find_activity_second);
        imaAcThird = getView(R.id.find_activity_third);
        hzListView = getView(R.id.radio_sale_limit_list_view_h);
        gridViews = getView(R.id.find_for_me_like_ry);
        liadadstView = getView(R.id.radio_sale_list_view);
        imaIma = getView(R.id.ima_ima);
//        imaTop = getView(R.id.ima_find_top_top);
        rvService = getView(R.id.rv_service);
        imaQuestion = getView(R.id.question_ima);
        imaMoney = getView(R.id.ima_monery);

    }

    @Override
    protected void initData() {
        initViewPage();
        initRecys();
        initRvService();
        initLimit();
        initAc();
        initLike();
        initForMe();

       VolleySingleton.addRequest("http://223.99.255.20/mobile.app.autohome.com.cn/discover_v7.0.0/mobile/getcardlist.ashx?a=2&pm=1&v=7.0.0&uid=&deviceid=021676cd548e5cf2b6149c916a767228fac74da0&pid=0&cid=0&state=1&pageindex=1&pagesize=20&lat=0.000000&lng=0.000000&hid=", FindAllEntity.class, new Response.Listener<FindAllEntity>() {
           @Override
           public void onResponse(FindAllEntity response) {
               Picasso.with(getContext()).load(response.getResult().getCardlist().get(1).getData().get(0).getImageurl()).into(imaIma);
//               Picasso.with(getContext()).load(response.getResult().getCardlist().get(3).getData().get(0).getImageurl()).into(imaTop);
               Picasso.with(getContext()).load(response.getResult().getCardlist().get(5).getData().get(0).getImageurl()).into(imaQuestion);
               Picasso.with(getContext()).load(response.getResult().getCardlist().get(8).getData().get(0).getImageurl()).into(imaMoney);



           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError error) {
               error.getMessage();
           }
       });

        final RadioSaleAdapter adapter = new RadioSaleAdapter(getContext());
        VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mall/intelligentrecommend.ashx?a=2&pm=2&v=5.9.0&uid=0&deviceid=860482030794407&gps=38.889662,121.551011&cityid=210200&pid=210000&pageindex=1&pagesize=20&hid=", FindEntity.class, new Response.Listener<FindEntity>() {
            @Override
            public void onResponse(FindEntity response) {
                liadadstView.setAdapter(adapter);
                adapter.setEntity(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "请求失败", Toast.LENGTH_SHORT).show();
            error.getMessage();
            }
        });

    }

    private void initRvService() {
        final RvServiceAdapter adapter = new RvServiceAdapter(getContext());
        rvService.setLayoutManager(new GridLayoutManager(getContext(),2));

        VolleySingleton.addRequest("http://223.99.255.20/mobile.app.autohome.com.cn/discover_v7.0.0/mobile/getcardlist.ashx?a=2&pm=1&v=7.0.0&uid=&deviceid=021676cd548e5cf2b6149c916a767228fac74da0&pid=0&cid=0&state=1&pageindex=1&pagesize=20&lat=0.000000&lng=0.000000&hid=",
                FindAllEntity.class, new Response.Listener<FindAllEntity>() {
                    @Override
                    public void onResponse(FindAllEntity response) {
                        adapter.setEntity(response);
                        rvService.setAdapter(adapter);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
    }

    private void initForMe() {
        final HeadForMeRecommendAdapter adapter = new HeadForMeRecommendAdapter(getContext());
        VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mall/intelligentrecommend.ashx?a=2&pm=2&v=5.9.0&uid=0&deviceid=860482030794407&gps=38.889662,121.551011&cityid=210200&pid=210000&pageindex=1&pagesize=20&hid=\"",
                FindEntity.class, new Response.Listener<FindEntity>() {
                    @Override
                    public void onResponse(FindEntity response) {
                        adapter.setEntity(response);
                        gridViews.setAdapter(adapter);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                    }
                });
    }

    private void initLimit() {
        final PurchaseAdapter adapter = new PurchaseAdapter(getContext());
        VolleySingleton.addRequest(LIMITEDBUY_FIND_URL, PurchaseEntity.class, new Response.Listener<PurchaseEntity>() {
            @Override
            public void onResponse(PurchaseEntity response) {
                Log.d("你的夜", "response:" + response);
                adapter.setEntity(response);
                hzListView.setAdapter(adapter);



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getMessage();
            }
        });

    }

    private void initLike() {
        final LikeRecyclerViewAdapter adapter  = new LikeRecyclerViewAdapter(getContext());
        recyclerViewLike.setLayoutManager(new GridLayoutManager(getContext(),2));
        VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mall/intelligentrecommend.ashx?a=2&pm=2&v=5.9.0&uid=0&deviceid=860482030794407&gps=38.889662,121.551011&cityid=210200&pid=210000&pageindex=1&pagesize=20&hid=\"",
                FindEntity.class, new Response.Listener<FindEntity>() {
                    @Override
                    public void onResponse(FindEntity response) {
                        recyclerViewLike.setAdapter(adapter);
                        adapter.setEntity(response);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                    }
                });
    }

    private void initAc() {
      VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/functionlist-a2-pm2-v5.9.0-pid210000-cid210200.json",RadioEntity.class, new Response.Listener<RadioEntity>() {
          @Override
          public void onResponse(RadioEntity response) {
              Picasso.with(mContext).load(response.getResult().getImageads().getImageadsinfo().get(0).getImgurl()).into(imaAcFirst);
              Picasso.with(mContext).load(response.getResult().getImageads().getImageadsinfo().get(1).getImgurl()).into(imaAcSecond);
              Picasso.with(mContext).load(response.getResult().getImageads().getImageadsinfo().get(2).getImgurl()).into(imaAcThird);



          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
              error.getMessage();

          }
      });

    }

    private void initRecys() {
        final RadioSaleRecyclerAdapter adapter = new RadioSaleRecyclerAdapter(getContext());
       recyclerViews.setLayoutManager(new GridLayoutManager(getContext(),4));
        VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/functionlist-a2-pm2-v5.9.0-pid210000-cid210200.json", RadioEntity.class, new Response.Listener<RadioEntity>() {
            @Override
            public void onResponse(RadioEntity response) {
                recyclerViews.setAdapter(adapter);
                adapter.setEntity(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


    }

    private void initViewPage() {
        adapter = new RadioSaleViewPagerAdapter(getContext());
        VolleySingleton.addRequest("http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/appadvert.ashx?appid=2&platform=2&version=5.9.0&siteid=2&provinceid=210000&cityid=210200&lat=38.889662&lng=121.551011", RadioSaleViewPagerEntity.class, new Response.Listener<RadioSaleViewPagerEntity>() {
            @Override
            public void onResponse(RadioSaleViewPagerEntity response) {
                adapter.setEntity(response);
                viewPager.setAdapter(adapter);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        adapter.setViewPager(viewPager);
        handler = new Handler(new Callback() {
            @Override
            public boolean handleMessage(Message message) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return false;
            }
        });
        if (mm) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    if (flag) {
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
    }
}
