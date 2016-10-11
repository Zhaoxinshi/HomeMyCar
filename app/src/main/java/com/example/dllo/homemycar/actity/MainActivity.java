package com.example.dllo.homemycar.actity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;
import com.example.dllo.homemycar.fragment.FindCarFragment;
import com.example.dllo.homemycar.fragment.FormFragment;
import com.example.dllo.homemycar.fragment.MyFragment;
import com.example.dllo.homemycar.fragment.RadioSaleFragment;
import com.example.dllo.homemycar.fragment.RecommendAllFragment;
import com.example.dllo.homemycar.recommendfragment.RecommendFragment;



public class MainActivity extends BaseActivity implements OnClickListener {
    private RadioButton radioRecommend, radioForum, radioFindCar, radioSale, radioMy;
    private RecommendAllFragment recommendAllFragment;
    private FormFragment formFragment;
    private FindCarFragment findCarFragment;
    private RadioSaleFragment radioSaleFragment;
    private MyFragment myFragment;


    @Override
    protected int setLayout() {

        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        radioRecommend = getView(R.id.radio_recommend);
        radioForum = getView(R.id.radio_forum);
        radioFindCar = getView(R.id.radio_find_car);
        radioSale = getView(R.id.radio_sale);
        radioMy = getView(R.id.radio_my);

    }

    @Override
    protected void initData() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        recommendAllFragment = new RecommendAllFragment();
        fragmentTransaction.replace(R.id.frame_replace, recommendAllFragment);
        fragmentTransaction.commit();


        radioRecommend.setOnClickListener(this);
        radioForum.setOnClickListener(this);
        radioFindCar.setOnClickListener(this);
        radioSale.setOnClickListener(this);
        radioMy.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.radio_recommend:
                recommendAllFragment = new RecommendAllFragment();
                fragmentTransaction.replace(R.id.frame_replace, recommendAllFragment);
                break;
            case R.id.radio_forum:
                formFragment = new FormFragment();
                fragmentTransaction.replace(R.id.frame_replace, formFragment);
                break;
            case R.id.radio_find_car:
                findCarFragment = new FindCarFragment();
                fragmentTransaction.replace(R.id.frame_replace, findCarFragment);

                break;
            case R.id.radio_sale:
                radioSaleFragment = new RadioSaleFragment();
                fragmentTransaction.replace(R.id.frame_replace, radioSaleFragment);
                break;
            case R.id.radio_my:
                myFragment = new MyFragment();
                fragmentTransaction.replace(R.id.frame_replace, myFragment);
                break;
        }
        fragmentTransaction.commit();

    }
}
