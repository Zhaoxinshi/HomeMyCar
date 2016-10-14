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

import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseActivity;

/**
 * Created by dllo on 16/10/13.
 */
public class WelcomeWebViewActivity extends BaseActivity{
    private WebView webView;
    @Override
    protected int setLayout() {
        return R.layout.web_welcome;
    }

    @Override
    protected void initView() {
        webView = getView(R.id.welcome_web);

    }

    @Override
    protected void initData() {

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.loadUrl("http://adx.autohome.com.cn/c?z=26&la=1047&bidid=2084633c-6dcb-43a0-b42e-546cce7d535d&pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0&dvid=021676cd548e5cf2b6149c916a767228fac74da0&u=PNJ%2BSyFzH/XQZI7K08EYJhFoS6y5kBGcxJcYpcyjZiEhVs0Av2FPblFwJZJc7I3FLEVaRyK%2BgEVUa1ufml6HluyyjaAIZlLeSU59oOJnsjMAtNkHZKVogMCYMSF8RRBLI%2Bni%2BMoKNSQo1F1MZ3LMot%2BJNQBSkhPGZSqicaZsEYsXpUMB/J45wBC71zg21HieQGz7/PQFvVMLsw0YmO4L/MSZg5Ab0lxvUf1q3vrVrAILJNQx98Zf1rlU8fI9DNeSMU93y4f1CRhVvAD/9nvj81Ero8qFejaeaPeM%2BtefYx/CjOxuDq7r1ZCLf2wMwo/WtcUar75p6ab9OOM5NE0AgUkd4AL/6DBirrqASO7EZ3unx1yTahPxr9QPWtDB4WOJQk8OKm%2BnF30FMvKB6jqJcJ4LMxuYA4mxSmjubeNi013LgtzpM47G/m7x5nWKyO6OM4bzgqw13spNhFdtuWrp4alfhmIec3rrdIXHcdbOX3wCEc4D7nFrddpQk5PxDiYeDQln7/rzFNtj9Jau1WFTiwAfO/P40nEKhc9m5OsK6rH74LVhqqbQtH31AlRypUim2PaKe9gLGwp8TKDYcI9IxPi/yLOa1icVLSIyMM4k47HQrix0KTI3Bwu3xZH5DO4cZquTJZ7FqvsPUuyGRq5kNlGVWCbaHNyEOHOE0v/xM7aOWpC3YLOJ66YdGF1ox5R30evhzHcsrGXte9oraJgv9R7C9LDyrOll2Bha%2BZLNsyYLrNhkFjr3ZFLj6Fs6AQDQAR7hSQrkhWIajQ%2BNNEBKA3j9SQ0EC6dLGvZtBj0Xumtkb9PkFp0oRFefurBJqbBjjlFJR46XaqLSFtNwEGAjihIPhRFdtSW1IzGqhOYrqWChpCmSM3kJ/ceJWebZg9HPs7Eo0i%2BA7Orp1Vc5/9xD9w7JKhoyf1ylOS2qLnEUBy%2BQW5fNcaniIekKKQ0T3cwjDobaWZzSzYRI24o4Khk2DinRQGs30G9n3/vMHEcjORIHaqMU1pjhlhWYj5sthUQMDx9Ins3rzG40WMGa3cv64cuh4Cdxc4Ehwm/1CAI3d79RKcIPnVUxLq8gni8rEilDPzkiyNPfmMc%2B7AW2eLIKVZNwN7ujECGSKQKZaUOFN6iudCZrV/EH1FVUFkGSAGtK8Z0JjjFrkF2XGMJQFIaR0YIwhvKPSahElc5VPmNY6EaKzcXIK0cgfdQ8KjD0YPCVwhFwa5LIHYdkluZT3EY428JFFudnrCHxoP5zdA5qQV3XAHEpswzhlAuKs1HPOkntdG9V1ZXmkRdqIKxYQZnr8CQWMOQjTaKDeduulvfFIWikJVh%2Bc26oHApOwQNcCiGh");
    }
}
