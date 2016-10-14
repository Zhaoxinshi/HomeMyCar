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
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.CollectActivity;
import com.example.dllo.homemycar.actity.DraftActivity;
import com.example.dllo.homemycar.actity.HistoryActivity;
import com.example.dllo.homemycar.actity.PreferentialActivity;
import com.example.dllo.homemycar.actity.SetUpActivity;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;

/**
 * Created by dllo on 16/9/19.
 */
public class MyFragment extends BaseFragment implements OnClickListener {
    private RelativeLayout rlCollect;
    private RelativeLayout rlPreferential, rlHistory, rlCg, rlSetUp;
    private ImageView imaDay;
    private ImageView imaWeixin, imaWeibo;


    @Override
    protected int setlayout() {
        return R.layout.my_fragment;
    }

    @Override
    protected void initView() {
        rlCollect = getView(R.id.my_rl_collect);
        rlPreferential = getView(R.id.rl_preferential);
        rlHistory = getView(R.id.my_rl_history);
        rlCg = getView(R.id.my_fragment_cao_gao_rl);
        rlSetUp = getView(R.id.my_fragment_set_up_rl);
        imaDay = getView(R.id.ima_day);
        imaWeixin = getView(R.id.ima_wei_xin);
        imaWeibo = getView(R.id.ima_wei_bo);


    }

    @Override
    protected void initData() {
        ShareSDK.initSDK(getContext());
        rlCollect.setOnClickListener(this);
        rlPreferential.setOnClickListener(this);
        rlHistory.setOnClickListener(this);
        rlCg.setOnClickListener(this);
        rlSetUp.setOnClickListener(this);
        imaDay.setOnClickListener(this);
        imaWeibo.setOnClickListener(this);
        imaWeixin.setOnClickListener(this);
        ShareSDK.initSDK(getContext());


    }

    @Override
    public void onClick(View view) {
        PlatformActionListener paListener = null;
        switch (view.getId()) {
            case R.id.my_rl_collect:
                startActivity(new Intent(getContext(), CollectActivity.class));
                break;
            case R.id.rl_preferential:
                startActivity(new Intent(getContext(), PreferentialActivity.class));
                break;
            case R.id.my_rl_history:
                startActivity(new Intent(getContext(), HistoryActivity.class));
                Log.d("监听", "onClick: ");
                Toast.makeText(mContext, "点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_fragment_cao_gao_rl:
                startActivity(new Intent(getContext(), DraftActivity.class));
                break;
            case R.id.my_fragment_set_up_rl:
                startActivity(new Intent(getContext(), SetUpActivity.class));
                break;
            case R.id.ima_day:
                showShare();
                break;
            case R.id.ima_wei_bo:
                Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);

                weibo.setPlatformActionListener(paListener);
//authorize与showUser单独调用一个即可
                weibo.authorize();//单独授权,OnComplete返回的hashmap是空的
                weibo.showUser(null);//授权并获取用户信息
                break;
            case R.id.ima_wei_xin:
                Platform qq = ShareSDK.getPlatform(QQ.NAME);

                qq.setPlatformActionListener(paListener);
//authorize与showUser单独调用一个即可
                qq.authorize();//单独授权,OnComplete返回的hashmap是空的
                qq.showUser(null);//授权并获取用户信息
                break;

        }

    }

    private void showShare() {
        ShareSDK.initSDK(getContext());
        OnekeyShare oks = new OnekeyShare();
//关闭sso授权
        oks.disableSSOWhenAuthorize();

// title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle("标题");
// titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl("http://sharesdk.cn");
// text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
// imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
//oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
// url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
// comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
// site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
// siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

// 启动分享GUI
        oks.show(getContext());
    }
}
