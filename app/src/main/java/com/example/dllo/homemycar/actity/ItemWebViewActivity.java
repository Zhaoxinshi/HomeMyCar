package com.example.dllo.homemycar.actity; /*
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

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.datebase.DateBaseTool;
import com.example.dllo.homemycar.entity.CollectEntity;
import com.litesuits.orm.LiteOrm;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by dllo on 16/10/11.
 */
public class ItemWebViewActivity extends BaseActivity {
    private WebView webView;
    private ImageView imageView, imaCollect;
    private String url;
    private LiteOrm liteOrm;
    private DateBaseTool tool;

    @Override
    protected int setLayout() {
        return R.layout.item_web_ac;
    }

    @Override
    protected void initView() {
        ShareSDK.initSDK(this);
        webView = getView(R.id.item_web_ac);
        imageView = getView(R.id.item_web_ac_for);
        imaCollect = getView(R.id.ima_collect);

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        url = intent.getStringExtra("asd");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShare();
            }
        });
        liteOrm = liteOrm.newSingleInstance(this, "mDateBase.db");
        tool = new DateBaseTool(this);
        imaCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CollectEntity entity = new CollectEntity();
                entity.setUrl(url);
                tool.insert(entity);
                Toast.makeText(ItemWebViewActivity.this, "是", Toast.LENGTH_SHORT).show();


            }
        });


    }

    private void showShare() {
        ShareSDK.initSDK(this);
        OnekeyShare oks = new OnekeyShare();
//关闭sso授权
        oks.disableSSOWhenAuthorize();

// title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle("标题");
// titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl(url);
// text是分享文本，所有平台都需要这个字段
        oks.setText("");
// imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
// url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl(url);
// comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
// site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
// siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl(url);

// 启动分享GUI
        oks.show(this);
    }
}
